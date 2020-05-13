package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://trello.com/login")
public class TablerosTrelloLoginPage01 extends PageObject{

	@FindBy(id="user")
	public WebElementFacade emailInput;
	
	@FindBy(id="login")
	public WebElementFacade btnLogin;
	
	public void setEmail(String email) {
		emailInput.click();
		emailInput.clear();
		emailInput.sendKeys(email);
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {}
		
		btnLogin.click();
	}
}
