package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/")
	public ModelAndView  home() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("name", "jsp expressoin");
		modelAndView.setViewName("index");
		
		
		return modelAndView;
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("about called");
		return "about";
	}

}
