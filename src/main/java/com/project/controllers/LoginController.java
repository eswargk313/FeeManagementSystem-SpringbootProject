package com.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.dao.AccountantDetails;
import com.project.servicePack.AccServiceClass;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {
	
	@PostMapping("/adminLogin")
    public String adminWelcome(@RequestParam("email") String email, @RequestParam("pass") String pass, HttpSession session, Model model) {
        if ("eswar@gmail.com".equals(email) && "1234".equals(pass)) {
            session.setAttribute("adminLoggedIn", true);
            return "AdminHome";
        } else {
            model.addAttribute("error", "Incorrect email/password");
            return "Login";
        }
    }

    @Autowired
    AccServiceClass aServ;

    @PostMapping("/AccLogin")
    public String accLogin(@RequestParam String email, @RequestParam String pass,HttpSession session2, Model model) {
        List<AccountantDetails> registrationList = aServ.loginLogic();

        for (AccountantDetails registration : registrationList) {
            if (registration.getEmail().equals(email) && registration.getPassword().equals(pass)) {
                session2.setAttribute("accountantLoggedIn", true);
                return "AccountantWelcome";
            }
        }
        model.addAttribute("msg", "Incorrect Email/password");
        return "Login";
        
        
    }
}