package com.dekosas.www.pageObject;

import org.openqa.selenium.By;

public class CategoriaPages {
    private By btnMenu = By.id("main-toggle-menu");
    private By btnDecoracion = By.xpath("//a[@href='https://dekosas.com/co/decoracion-apartamentos-casas']");

    public By getBtnMenu() {
        return btnMenu;
    }

    public By getBtnDecoracion() {
        return btnDecoracion;
    }
}
