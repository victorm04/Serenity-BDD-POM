package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TablerosTrelloPage02 extends PageObject{
	
	@FindBy(xpath="//*[@id='chrome-container']/div[3]/div/div/div/form/div[1]/div/div[1]/input")
	private WebElementFacade boardNameInput;
	
	@FindBy(xpath="//*[@id='chrome-container']/div[3]/div/div/div/form/div[2]/button")
	private WebElementFacade btnCreateBoard;
	
	public void crearTablero(String boardName) {
		boardNameInput.click();
		boardNameInput.clear();
		boardNameInput.sendKeys(boardName);
		
		btnCreateBoard.click();
	}

}
