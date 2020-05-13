package com.choucair.formacion.steps;

import java.util.List;

import com.choucair.formacion.pageobjects.TablerosTrelloLoginPage01;
import com.choucair.formacion.pageobjects.TablerosTrelloLoginPage02;
import com.choucair.formacion.pageobjects.TablerosTrelloPage01;
import com.choucair.formacion.pageobjects.TablerosTrelloPage02;
import com.choucair.formacion.pageobjects.TablerosTrelloPage03;

import net.thucydides.core.annotations.Step;

public class TablerosTrelloSteps {

	TablerosTrelloLoginPage01 tablerosTrelloLoginPage01;
	TablerosTrelloLoginPage02 tablerosTrelloLoginPage02;
	TablerosTrelloPage01 tablerosTrelloPage01;
	TablerosTrelloPage02 tablerosTrelloPage02;
	TablerosTrelloPage03 tablerosTrelloPage03;
	
	@Step
	public void login(String email, String password) {
		tablerosTrelloLoginPage01.open();
		tablerosTrelloLoginPage01.setEmail(email);
		
		tablerosTrelloLoginPage02.setPassword(password);
	}
	
	@Step
	public void crearTableros(List<List<String>> data, int i) {
		tablerosTrelloPage01.crearTablero();
		tablerosTrelloPage02.crearTablero(data.get(i).get(0).trim());
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {}
		tablerosTrelloPage03.verificarTablero(data.get(i).get(0).trim());
		
	}
}
