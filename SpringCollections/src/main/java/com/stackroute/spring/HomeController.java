package com.stackroute.spring;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
 @Controller
public class HomeController {
	ArrayList<String> a = new ArrayList<String>();
	@RequestMapping("/home")
	public ModelAndView collections(ArrayList<String> a) {
		a.add("Apple");
	    a.add("Banana");
	    a.add("Orange");
	    a.add("Grapes");
	    a.add("PineApple");
		ModelAndView fruits=new ModelAndView("home");
		fruits.addObject("message", a);
		return fruits;		
	}
	
}
