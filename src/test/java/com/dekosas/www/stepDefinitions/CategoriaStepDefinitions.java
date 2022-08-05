package com.dekosas.www.stepDefinitions;

import com.dekosas.www.driver.SeleniumWebDriver;
import com.dekosas.www.steps.BuscarSteps;
import com.dekosas.www.steps.CategoriaSteps;
import com.dekosas.www.utils.Excel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class CategoriaStepDefinitions {

    @Steps
    CategoriaSteps categoriaSteps = new CategoriaSteps();
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();
    @Given("^que me encuentre en la pagina de dekosas/categoria$")
    public void queMeEncuentreEnLaPaginaDeDekosasCategoria() {
        try {
            leerExcel = Excel.readExcel("dekosas.xlsx", "url");
        }catch (IOException e){
            e.printStackTrace();
        }
        SeleniumWebDriver.chromeDriver(leerExcel.get(0).get("link"));
    }



    @When("^quiero elegir una categoria y elegir unos productos$")
    public void quieroElegirUnaCategoriaYElegirUnosProductos() {
        categoriaSteps.Pasos();
    }

    @Then("^la pagina me mostrara los articulos relacionados con  la categoria$")
    public void laPaginaMeMostraraLosArticulosRelacionadosConLaCategoria() {
        SeleniumWebDriver.driver.close();
    }
}
