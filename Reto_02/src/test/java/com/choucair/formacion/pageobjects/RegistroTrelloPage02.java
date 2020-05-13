package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegistroTrelloPage02 extends PageObject{

	@FindBy(id="displayName")
	public WebElementFacade inputName;
	
	@FindBy(id="password")
	public WebElementFacade inputPassword;
	
	@FindBy(id="signup-submit")
	public WebElementFacade btnRegistro;
		
	public void ingresarDatos(String name, String pass) {
		inputName.click();
		inputName.clear();
		inputName.sendKeys(name);
		
		inputPassword.click();
		inputPassword.clear();
		inputPassword.sendKeys(pass);
		
		btnRegistro.click();
	}
}
