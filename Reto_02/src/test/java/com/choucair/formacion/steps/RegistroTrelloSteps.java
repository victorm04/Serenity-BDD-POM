package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.RegistroTrelloPage01;
import com.choucair.formacion.pageobjects.RegistroTrelloPage02;
import com.choucair.formacion.pageobjects.RegistroTrelloPage03;

import net.thucydides.core.annotations.Step;

public class RegistroTrelloSteps {

	RegistroTrelloPage01 registroTrelloPage01;
	RegistroTrelloPage02 registroTrelloPage02;
	RegistroTrelloPage03 registroTrelloPage03;
	
	@Step
	public void ingresoPlataforma() {
		registroTrelloPage01.open();
	}
	
	@Step
	public void setEmail(String strEmail) {
		registroTrelloPage01.setEmail(strEmail);		
	}
	
	@Step
	public void ingresoDatos(String name, String pass) {
		registroTrelloPage02.ingresarDatos(name, pass);
	}
	
	@Step
	public void verificoRegistro() {
		registroTrelloPage03.verificoRegistro();
	}
}
