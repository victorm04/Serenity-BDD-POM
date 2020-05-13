package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TablerosTrelloLoginPage02 extends PageObject{

	@FindBy(id="password")
	public WebElementFacade passInput;
	
	@FindBy(id="login-submit")
	public WebElementFacade btnLogin;
	
	public void setPassword(String password) {
		passInput.click();
		passInput.clear();
		passInput.sendKeys(password);
		
		btnLogin.click();
	}
}
