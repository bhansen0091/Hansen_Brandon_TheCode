package com.hansen.code;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}

	@RequestMapping("/code")
	public String form(HttpSession session) {
		return "code.jsp";
	}
	
	@RequestMapping(value = "/login", method=RequestMethod.POST)
	public String login(@RequestParam(value="code") String code, HttpSession session) {
		
		session.setAttribute("code", code);
		
		if (session.getAttribute("code").equals("bushido")) {
			return "redirect:/code";
		}else {
			return "redirect:/createError";			
		}
		
	}
	
	@RequestMapping("/createError")
	public String error(RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("error", "You must train harder.");
		return "redirect:/";
	}
	
}
