package com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class MappingController {

	@RequestMapping({"/" ,"/Login"})
	public String home()
	{
		return "Login";
	}
	
	@RequestMapping("/AdminHome")
	public String AdminHome(HttpSession ses)
	{
	    Object adminLoggedIn = ses.getAttribute("adminLoggedIn");
	    if (adminLoggedIn != null && (boolean) adminLoggedIn) {
	        return "AdminHome";
	    } else {
	        return "Login";
	    }
	}
	
	@RequestMapping("/AddAccountant")
	public String addAcc(HttpSession ses) {
	    Object adminLoggedIn = ses.getAttribute("adminLoggedIn");
	    if (adminLoggedIn != null && (boolean) adminLoggedIn) {
	        return "AddAccountant";
	    } else {
	        return "Login";
	    }
	}
	
		@RequestMapping("/DeleteAcc")
	public String deleteAcc(HttpSession ses)
	{
		Object adminLoggedIn = ses.getAttribute("adminLoggedIn");
	
    if (adminLoggedIn != null && (boolean) adminLoggedIn) {
		return "DeleteAcc";}
    else {
    	return "Login";
    }
	}
		
	@RequestMapping("/Logout")
	public String AdminLogout(HttpSession ses)
	{
	    Object adminLoggedIn = ses.getAttribute("adminLoggedIn");
	    if (adminLoggedIn != null && (boolean) adminLoggedIn) {
	    	ses.invalidate();
	        return "Login";
	    } else {
	        return "Login";
	    }
	}
	
	@RequestMapping({"/AccLogin","/AccountantWelcome"})
	public String AccWel(HttpSession ses)
	{
	    Object accountantLoggedIn = ses.getAttribute("accountantLoggedIn");
	    if (accountantLoggedIn != null && (boolean) accountantLoggedIn) {
	        return "AccountantWelcome";
	    } else {
	        return "Login";
	    }
	}

	@GetMapping("/AddNewStudent")
	public String addNewStu(HttpSession ses) {
		Object accountantLoggedIn = ses.getAttribute("accountantLoggedIn");
	    if (accountantLoggedIn != null && (boolean) accountantLoggedIn) {
			        return "AddNewStudent";
	    } else {
	        return "Login";
	    }
	}

	@GetMapping("/StudentFeePayment")
	public String feePayment(HttpSession ses)
	{
	    Object accountantLoggedIn = ses.getAttribute("accountantLoggedIn");
	    if (accountantLoggedIn != null && (boolean) accountantLoggedIn) {
		return "StudentFeePayment";
	    }else {
	    	return "Login";
	    }
	}
	
	
	
	@RequestMapping("/Logout1")
	public String accountantLogout(HttpSession ses)
	{
		Object accountantLoggedIn = ses.getAttribute("accountantLoggedIn");
	    if (accountantLoggedIn != null && (boolean) accountantLoggedIn) {
			    	ses.invalidate();
	        return "Login";
	    } else {
	        return "Login";
	    }
	}

}
