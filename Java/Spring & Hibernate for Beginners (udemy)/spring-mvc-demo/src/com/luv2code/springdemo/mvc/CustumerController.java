package com.luv2code.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/custumer")
public class CustumerController {

	@InitBinder
	public void initBinder(WebDataBinder theBinder) {
		
		StringTrimmerEditor stringTimmerEditor = new StringTrimmerEditor(true);
		
		theBinder.registerCustomEditor(String.class, stringTimmerEditor);
		
		//imprime o nome dos erros , posso utilizar uma mensagem de erro custumizado para ajudar no debug
		System.out.println(theBinder);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		theModel.addAttribute("custumer",new Custumer());
		
		return "custumer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute("custumer") Custumer theCustumer,
			BindingResult theBindingResult) {
		
		if(theBindingResult.hasErrors()) {
			return "custumer-form";
		}else {
			return "custumer-confirmation";
		}
	}
}
