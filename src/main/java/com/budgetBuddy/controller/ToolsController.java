package com.budgetBuddy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.budgetBuddy.tools.CompoundInterest;
import com.budgetBuddy.tools.CompoundInterestResult;
import com.budgetBuddy.tools.Quick401k;
import com.budgetBuddy.tools.QuickBudget;

@Controller
@RequestMapping("/tools")
public class ToolsController {

	@RequestMapping("/compound-interest-calculator")
	public String showCompoundInterestCalculator(Model model) {
		model.addAttribute("interest", new CompoundInterest());
		return "compound-interest";
	}
	
	@RequestMapping("/compound-interest-calculator/result")
	public String showCompoundInterestResult(Model model, @ModelAttribute("interest") CompoundInterest interest) {
		model.addAttribute("interestResult", new CompoundInterestResult(interest));
		return "compound-interest-result";
	}
	@RequestMapping("/budgetCalculator")
	public String showBudgetCalculator(Model model) {
		model.addAttribute("budget", new QuickBudget());
		return "budget";
	}
	
	@RequestMapping("/401k")
	public String show401kCalculator(Model model) {
		model.addAttribute("balance", new Quick401k());
		return "401k";
	}
}
