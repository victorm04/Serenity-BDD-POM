package com.choucair.formacion.pageobjects;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import java.util.List;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;


public class TablerosTrelloPage03 extends PageObject {

	//@FindBy(xpath="//SPAN[@class='js-board-editing-target board-header-btn-text'][text()='usdjchdvhv']")
	//private WebElementFacade boardTittle;
	
	@FindBys({
		@FindBy(id="header"),
		@FindBy(tagName="a"),
		@FindBy(tagName="span")
	})
	private WebElementFacade btnHome;
	
	public void verificarTablero(String boardName) {
		
		//assertThat(boardTittle.getText(), containsString(boardName));
		btnHome.click();
	}
}