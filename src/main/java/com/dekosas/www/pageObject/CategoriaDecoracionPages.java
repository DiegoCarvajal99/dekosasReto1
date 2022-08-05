package com.dekosas.www.pageObject;

import org.openqa.selenium.By;

public class CategoriaDecoracionPages {
    private By btnProducto1 = By.xpath("//a[@href='https://dekosas.com/co/trancapuertas-uzulu-mulikka' and @class='product-item-link']");
    private By BtnProducto2 = By.xpath("//a[@href='https://dekosas.com/co/organizador-de-zapatos-5-niveles-essenza' and @class='product-item-link']");
    private By lblProducto1 = By.xpath("//span[@data-ui-id='page-title-wrapper']");
    private By lblProducto2 = By.xpath("//span[@data-ui-id='page-title-wrapper']");
    private By btnInicio = By.xpath("//a[@class='logo']");

    public By getBtnInicio() {
        return btnInicio;
    }

    public By getBtnProducto1() {
        return btnProducto1;
    }

    public By getBtnProducto2() {
        return BtnProducto2;
    }

    public By getLblProducto1() {
        return lblProducto1;
    }

    public By getLblProducto2() {
        return lblProducto2;
    }
}
