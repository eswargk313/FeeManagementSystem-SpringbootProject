package com.project.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.dao.StudentDetails;
import com.project.servicePack.StudentServiceClass;

import jakarta.servlet.http.HttpSession;

@Controller
public class AccountantController {

	@Autowired
	StudentDetails sDe;

	@Autowired
	StudentServiceClass sSer;

	private boolean isAccountantLoggedIn(HttpSession ses) {
		Object accountantLoggedIn = ses.getAttribute("accountantLoggedIn");
		return accountantLoggedIn != null && (boolean) accountantLoggedIn;
	}

	@PostMapping("/StudentRegistration")
	public String studentRegistration(@RequestParam String sName, @RequestParam String sBranch,
			@RequestParam Integer sYear, @RequestParam Long sContact, @RequestParam Double sFee,
			@RequestParam String sAddress, Model m, HttpSession ses) {
		if (isAccountantLoggedIn(ses)) {

			sDe.setsName(sName);
			sDe.setsBranch(sBranch);
			sDe.setsYear(sYear);
			sDe.setsContact(sContact);
			sDe.setsFee(sFee);
			sDe.setsAddress(sAddress);

			Integer i = sSer.addNewStd(sDe);
			if (i != null) {
				m.addAttribute("msg", "New Student Added sucessfully");
				m.addAttribute("id", i);
				return "AddNewStudent";
			} else {
				m.addAttribute("msg", "Registration failed!!!!");
				return "AddNewStudent";
			}
		} else {
			m.addAttribute("msg", "Please Login to continue");
			return "Login";
		}
	}

	@GetMapping("/ViewStudentAcc")
	public String allStd(Model m, HttpSession ses) {
		if (isAccountantLoggedIn(ses)) {

			List<StudentDetails> students = sSer.allStudentDetails();
			m.addAttribute("students", students);
			return "AllStudents";
		} else
			return "Login";
	}

	@GetMapping("/ViewStd")
	public String ViewStd(@RequestParam Integer sRollNo, Model m, HttpSession ses) {
		if (isAccountantLoggedIn(ses)) {

			Optional<StudentDetails> op = sSer.studentViewLoic(sRollNo);
			if (op.isPresent()) {
				StudentDetails stud = op.get();

				m.addAttribute("stud", stud);
			} else {
				m.addAttribute("msg", "No Data");
			}
			return "StudentDetails";
		} else {
			return "Login";
		}
	}

	@GetMapping("/ViewStdFee")
	public String ViewStdFee(@RequestParam Integer sRollNo, Model m, HttpSession ses) {
		if (isAccountantLoggedIn(ses)) {

			Optional<StudentDetails> op = sSer.studentViewLoic(sRollNo);
			if (op.isPresent()) {
				StudentDetails stud = op.get();

				m.addAttribute("stud", stud);
			} else {
				m.addAttribute("msg", "No Data");

			}
			return "StudFeeDetails";
		} else {
			return "Login";
		}
	}

	@GetMapping("/Feepayment")
	public String Feepaymnet(@RequestParam Double amount, @RequestParam Integer sRollNo, Model m, HttpSession ses) {
		if (isAccountantLoggedIn(ses)) {

			Double rem = sSer.feePayment(amount, sRollNo);

			m.addAttribute("amount", amount);
			m.addAttribute("rem", rem);

			sDe.setsRollNo(sRollNo);
//			Double actualFee= sReg.getsFee();
			Double actualFee = sDe.getsFee() + amount;
			m.addAttribute("actualFee", actualFee);

			Optional<StudentDetails> op = sSer.studentViewLoic(sRollNo);
			if (op.isPresent()) {
				StudentDetails stud = op.get();
				m.addAttribute("stud", stud);
			}

			return "Recipt";
		} else {
			return "Login";
		}
	}

	@GetMapping("/FeeDueStudents")
	public String feeDueStudents(Model m, HttpSession ses) {
		if (isAccountantLoggedIn(ses)) {
			List<StudentDetails> students = sSer.feeDue();
			m.addAttribute("students", students);

			return "FeeDueStudentsView";
		} else {
			return "Login";
		}
	}

	@RequestMapping("ByYear")
	public String yearWise(HttpSession ses) {
		if (isAccountantLoggedIn(ses))

			return "yearWise";
		else
			return "Login";
	}

//	@GetMapping("/StdbyYear")
//	public String StdbyYear(@RequestParam Integer year, Model m, HttpSession ses) {
//		if (isAccountantLoggedIn(ses)) {
//
//			List<StudentDetails> students = sSer.StudYearWise(year);
//			m.addAttribute("students", students);
//
//			return "StudentDetailsYear";
//		} else {
//			return "Login";
//		}
//	}

}
