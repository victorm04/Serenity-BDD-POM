package com.choucair.formacion.definition;

import java.util.List;

import com.choucair.formacion.steps.TablerosTrelloSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TablerosTrelloDefinition {

	@Steps
	TablerosTrelloSteps tablerosTrelloSteps;
	
	@Given("^Ingreso a la plataforma con mis credenciales \"([^\"]*)\" y \"([^\"]*)\"$")
	public void ingreso_a_la_plataforma_con_mi_y(String email, String password) {
		tablerosTrelloSteps.login(email, password);
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {}
	}
	
	@When("^Creo los tableros para llevar el control adecuado de mis proyectos$")
	public void creo_los_tableros_para_llevar_el_control_adecuado_de_mis_proyectos(DataTable dtDatos){
		
		List<List<String>> data = dtDatos.raw();
		
		for(int i=1; i<data.size(); i++) {
			tablerosTrelloSteps.crearTableros(data, i);
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e) {}
		}
	}
	
	@Then("^Verifico que los tableros se encuentren en mi dashboard$")
	public void verifico_que_los_tableros_se_creen_exitosamente() {
	}
}
