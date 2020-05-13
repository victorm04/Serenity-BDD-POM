package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://trello.com/es/signup")
public class RegistroTrelloPage01 extends PageObject{

	@FindBy(id="email")
	public WebElementFacade emailInput;
	
	@FindBy(id="signup-submit")
	public WebElementFacade btnContinuar;
	
	public void setEmail(String strEmail) {
		emailInput.click();
		emailInput.clear();
		emailInput.sendKeys(strEmail);
		
		btnContinuar.click();
	}
}
