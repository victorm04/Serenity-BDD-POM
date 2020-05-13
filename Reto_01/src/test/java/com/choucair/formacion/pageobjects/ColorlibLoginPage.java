package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class ColorlibLoginPage extends PageObject {
	
	@FindBy(xpath="//*[@id='login']/form/input[1]")
	public WebElementFacade txtUsername;
	
	@FindBy(xpath="//*[@id='login']/form/input[2]")
	public WebElementFacade txtPassword;
	
	@FindBy(xpath="//*[@id='login']/form/button")
	public WebElementFacade btnIngresar;
	
	@FindBy(id="bootstrap-admin-template")
	public WebElementFacade lblHomeVerify;

	public void ingresarDatos(String strUsername, String strPassword) {
		txtUsername.sendKeys(strUsername);
		txtPassword.sendKeys(strPassword);
		btnIngresar.click();
	}

	public void verificarHome() {
		String labelv = "Bootstrap-Admin-Template";
		String strMensaje = lblHomeVerify.getText();
		assertThat(strMensaje, containsString(labelv));
	}
	
}
