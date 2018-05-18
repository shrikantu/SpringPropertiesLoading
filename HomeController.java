package com.kb;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@Autowired
	 private MessageSource messageSource;

	@RequestMapping(value = "home", method = RequestMethod.GET)
	public String getHomePage(Model model) {
		String minlength = messageSource.getMessage("minlength.abc", null, Locale.US);
		String maxlength = messageSource.getMessage("maxlength.abc", null, Locale.US);
		String lenghtValidation = messageSource.getMessage("lenght.validation.abc", new Object[] { minlength,maxlength }, Locale.US);
	model.addAttribute("minlength", minlength);
		model.addAttribute("maxlength", maxlength);
		model.addAttribute("lenghtValidation", lenghtValidation);
		return "home";

	}

}
