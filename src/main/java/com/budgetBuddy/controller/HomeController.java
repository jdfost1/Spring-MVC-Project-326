package com.budgetBuddy.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

  @RequestMapping("/")
  public String welcome() {
   

    return "welcome";
  }
  
  @RequestMapping("/welcome")
  public String welcomeAgain() {
   

    return "welcome";
  }
 
  
  
 @RequestMapping("/401k")
 public String calculate401k() {
	 return "401k";
 }
 
 @RequestMapping("/quickBudget")
 public String quickBudget() {
	 return "quickBudget";
 }
 
 @RequestMapping("/compoundInterest")
 public String calculateSavings() {
	 return "compoundInterest";
 }
 @RequestMapping("/signUp")
 public String signUp() {
	 return "signUp";
 }
}
