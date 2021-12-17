package br.com.tricentis.modulos;

import org.junit.Assert;

import br.com.tricentis.paginas.AutomovelPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AutomovelTest extends AutomovelPage {
	
	@Given("que acesso a pagina Tricentis Vehicle Insurance Application")
	public void que_acesso_a_pagina_tricentis_vehicle_insurance_application() {
		acessaPagina("http://sampleapp.tricentis.com/101/app.php");
	}

	@When("preencho os formularios Vehicle Data, Insurant Data, Product Data, Price Option e Send Quote")
	public void preencho_os_formularios_vehicle_data_insurant_data_product_data_price_option_e_send_quote() {
		new AutomovelPage()
			.verificarObjetoSelecionado()
			// Vehicle Data
			.informarMake("Ford")
			.informarEnginePerformance("100")
			.informarDateOfManufacture("10/01/1998")
			.informarNumberOfSeats("5")
			.informarFuelType("Gas")
			.informarListPrice("650")
			.informarAnnualMileage("250")
			.nextVehicleData()
			// Insurant Data
			.informarFirstName("Maria")
			.informarLastName("Socorro")
			.informarDateOfBirth("03/10/1988")
			.informarGender()
			.informarCountry("Brazil")
			.informarZipCode("73035090")
			.informarOccupation("Employee")
			.informarHobbies()
			.nextInsurantData()
			// Product Data
			.informarStartDate("05/01/2022")
			.informarInsuranceSum("35.000.000,00")
			.informarMeritRating("Bonus 7")
			.informarDamageInsurance("No Coverage")
			.informarOptionalProducts()
			.informarCourtesyCar("Yes")
			.nextProductData()
			// Price Option
			.informarPriceOption()
			.nextPriceOption()
			// Send Quote
			.informarEMail("teste@gmail.com")
			.informarUsername("teste")
			.informarPassword("Teste123")
			.informarConfirmpassword("Teste123");
	}

	@And("envio a cotacao")
	public void envio_a_cotacao() {
		new AutomovelPage()
		.sendQuote();
		
	}
	
	@Then("apresenta a mensagem Sending e-mail success!")
	public void apresenta_a_mensagem_sending_e_mail_success() {
		AutomovelPage automovelPage = new AutomovelPage();
		
		boolean exibirMensagemSucesso = automovelPage.verificarMensagemSucesso();
		Assert.assertTrue("Mensagem de sucesso", exibirMensagemSucesso);
		
		alertFinish();
		
	}
	
	
}
