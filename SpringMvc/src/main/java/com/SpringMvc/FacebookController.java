package com.SpringMvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.FacebookUser.Facebookuser;
import com.Service.FacebookuserService;
import com.Service.FacebookuserServiceInterface;

@Controller
public class FacebookController {

	@RequestMapping("registration.htm")
	public ModelAndView registerClient(HttpServletRequest request) {
		String name = request.getParameter("fname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String address = request.getParameter("address");
		
		  ModelAndView mv = new ModelAndView();
		
		Facebookuser fb = new Facebookuser();
		fb.setName(name);
		fb.setEmail(email);
		fb.setPassword(password);
		fb.setAddress(address);
		
	FacebookuserServiceInterface fs = new FacebookuserService();
	   int i=fs.registeration(fb);
	   
	   if(i>0) {
		 
			mv.addObject("first_name", name);
			mv.addObject("e_email", email);
			
			mv.setViewName("registraitionview.jsp");
	   }
	   else {
		   System.out.println("something went wrong");
	   }
		
		return mv;
	}

}
