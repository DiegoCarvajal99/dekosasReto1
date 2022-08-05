package com.dekosas.www.steps;

import com.dekosas.www.driver.SeleniumWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.assertEquals;

public class MetodosSeleniumSteps {

    public void clickear(By localizador) {

        SeleniumWebDriver.driver.findElement(localizador).click();
    }

    public void limpiarCampo(By localizador) {
        SeleniumWebDriver.driver.findElement(localizador).clear();
    }

    public void escribir(By localizador, String texto) {
        SeleniumWebDriver.driver.findElement(localizador).sendKeys(texto);
    }

    public void selecionar(By localizador, String texto) {
        Select selector = new Select(SeleniumWebDriver.driver.findElement(localizador));
        selector.selectByValue(texto);
    }

    public void escribirMasEnter(By localizador, String texto) {
        SeleniumWebDriver.driver.findElement(localizador).sendKeys(texto, Keys.ENTER);
    }

    public String getTextElement(By localizador) {
        return SeleniumWebDriver.driver.findElement(localizador).getText();
    }


    public void validacion(By localizador, String texto) {
        assertEquals(getTextElement(localizador), texto);
    }
}
