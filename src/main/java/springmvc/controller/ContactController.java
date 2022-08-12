package springmvc.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springmvc.dao.UserDao;
import springmvc.model.User;

@Controller
public class ContactController {

	@Autowired
	UserDao UserDao;
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}

	@PostMapping("/processform")
	public String getData(@ModelAttribute User user) {
		if(user.getPassword().equals(user.getConfirmPassword())) {
			UserDao.saveUser(user);
			return "success";	
		}
		else {
			return "contact";
		}
		
		
		
	}

}
