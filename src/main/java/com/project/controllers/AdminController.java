package com.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.dao.AccountantDetails;
import com.project.dao.StudentDetails;
import com.project.servicePack.AccServiceClass;
import com.project.servicePack.StudentServiceClass;

import jakarta.servlet.http.HttpSession;

@Controller
public class AdminController {

	@Autowired
	AccountantDetails aDe;

	@Autowired
	AccServiceClass aSer;

	private boolean isAdminLoggedIn(HttpSession ses) {
		Object adminLoggedIn = ses.getAttribute("adminLoggedIn");
		return adminLoggedIn != null && (boolean) adminLoggedIn;
	}

	@PostMapping("/AccRegistration")
	public String AccRegistration(@RequestParam String name, @RequestParam String email, @RequestParam String password,
			@RequestParam String contact, @RequestParam String address, HttpSession ses, Model m) {
		{
			if (isAdminLoggedIn(ses)) {

				aDe.setName(name);
				aDe.setEmail(email);
				aDe.setPassword(password);
				aDe.setContact(contact);
				aDe.setAddress(address);

				Integer i = aSer.registerLogic(aDe);
				if (i != null) {
					m.addAttribute("msg", "New Accountant Added sucessfully");
					m.addAttribute("id", i);
					return "AddAccountant";
				} else {
					m.addAttribute("msg", "Registration failed!!!!");
					return "AddAccountant";
				}
			} else {
				m.addAttribute("msg", "Please Login to continue");
				return "Login";
			}
		}
	}

	@GetMapping("/ViewAccountant")
	public String ViewAcc(Model m, HttpSession ses) {
		if (isAdminLoggedIn(ses)) {
			List<AccountantDetails> accountants = aSer.allAcc();
			m.addAttribute("accountants", accountants);
			return "ViewAccountant";
		} else {
			return "Login";
		}
	}

	@PostMapping("/DeleteAccountant")
	public String DeleteAcc(@RequestParam Integer Id, Model m, HttpSession ses) {
		if (isAdminLoggedIn(ses)) {

			aDe.setaId(Id);
			aSer.deleteLogic();
			if (aDe.getaId() == Id) {
				m.addAttribute("msg", "Account deleted Sucessfully");
				return "DeleteAcc";
			} else {
				m.addAttribute("msg", "Account is not deleted");
				return "DeleteAcc";
			}
		} else {
			return "Login";
		}
	}

	@Autowired
	StudentServiceClass sSer;

	@Autowired
	StudentDetails sReg;

	@GetMapping("/ViewStud")
	public String viewStuDetails(Model m, HttpSession ses) {
		if (isAdminLoggedIn(ses)) {
			List<StudentDetails> students = sSer.allStudentDetails();
			m.addAttribute("students", students);
			return "ViewStud";

		} else {
			return "Login";
		}
	}
}
