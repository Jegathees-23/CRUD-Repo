package com.chainsys.main.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping("/index")
	public ModelAndView indexpage() {
		ModelAndView mod = new ModelAndView("Index");
		return mod;
	}
	
	/*
	 * @RequestMapping("/Login") public ModelAndView loginForm() { ModelAndView mod
	 * = new ModelAndView("Login"); return mod; }
	 */
}
