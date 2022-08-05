package com.dekosas.www.stepDefinitions;

import com.dekosas.www.driver.SeleniumWebDriver;
import com.dekosas.www.steps.ProductosHomeSteps;
import com.dekosas.www.utils.Excel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class ProductosHomeStepDefinitions {
    @Steps
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();
    ProductosHomeSteps productosHomeSteps = new ProductosHomeSteps();
    @Given("^que me encuentre en la pagina principal de dekosas$")
    public void queMeEncuentreEnLaPaginaPrincipalDeDekosas() {
        try {
            leerExcel = Excel.readExcel("dekosas.xlsx", "url");
        }catch (IOException e){
            e.printStackTrace();
        }
        SeleniumWebDriver.chromeDriver(leerExcel.get(0).get("link"));
    }


    @When("^quiero elegir unos productos$")
    public void quieroElegirUnosProductos() {
        productosHomeSteps.Pasos();
    }

    @Then("^la pagina me redireccionara a la pagina del producto$")
    public void laPaginaMeRedireccionaraALaPaginaDelProducto() {
        SeleniumWebDriver.driver.close();
    }
}
