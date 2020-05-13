package com.choucair.formacion.definition;

import com.choucair.formacion.steps.RegistroTrelloSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegistroTrelloDefinition {
	
	@Steps
	RegistroTrelloSteps registroTrelloSteps;

	@Given("^Ingreso al url de registro de la plataforma$")
	public void ingreso_al_url_de_registro_de_la_plataforma() {
		registroTrelloSteps.ingresoPlataforma();
	}

	@When("^coloco la informacion de usuario necesaria para el registro \"([^\"]*)\" \"([^\"]*)\" y \"([^\"]*)\"$")
	public void coloco_la_informacion_de_usuario_necesaria_para_el_registro_y(String name, String email, String pass) {
		registroTrelloSteps.setEmail(email);
		registroTrelloSteps.ingresoDatos(name, pass);
		try {
			Thread.sleep(30000);
		}catch(InterruptedException e) {}
	}

	@Then("^Verifico que me registre exitosamente$")
	public void verifico_que_me_registre_exitosamente() {
		registroTrelloSteps.verificoRegistro();
	}
	
}


