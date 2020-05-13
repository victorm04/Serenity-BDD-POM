package com.choucair.formacion.pageobjects;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TablerosTrelloPage01 extends PageObject{

	@FindBy(className="boards-page-board-section-list-item")
	public List<WebElementFacade> btnNewBoard;
	
	public void crearTablero() {
		int x = btnNewBoard.size();
		btnNewBoard.get(x-1).click();
	}
}
