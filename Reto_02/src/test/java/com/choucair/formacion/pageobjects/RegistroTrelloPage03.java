package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class RegistroTrelloPage03 extends PageObject{
	
	@FindBy(xpath="//*[@id='8ab847e1-5942-4261-8542-f676d5f767a6']/section/h1/span")
	public WebElementFacade lblVerify;
	
	private String txtVerify = "¡Bienvenido a Trello!";
	
	public void verificoRegistro() {
		assertThat(lblVerify.getText(), containsString(txtVerify));
	}

}
