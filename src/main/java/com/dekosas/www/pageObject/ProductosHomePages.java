package com.dekosas.www.pageObject;

import org.openqa.selenium.By;

public class ProductosHomePages {
    private By btnMuebles = By.xpath("//a[@href='https://dekosas.com/co/muebles-accesorios']");
    private By btnProducto1 = By.xpath("(//a[@href='https://dekosas.com/co/repisa-print-madala-dko-design-sas'])[2]");
    private By btnProducto2 = By.xpath("(//a[@href='https://dekosas.com/co/mesa-auxiliar-de-apoyo-blanco-colsein'])[2]");
    private By btnProducto3 = By.xpath("(//a[@href='https://dekosas.com/co/repisa-para-cocina-blanca-colsein'])[2]");
    private By btnProducto4 = By.xpath("(//a[@href='https://dekosas.com/co/mesa-de-apoyo-para-libros-negro-satinado-colsein'])[2]");
    private By btnProducto5 = By.xpath("(//a[@href='https://dekosas.com/co/escritorio-cannes-blanco-20-20-muebles'])[2]");
    private By lblproductos = By.xpath("//span[@class='base']");
    private By btnInicio = By.xpath("//a[@class='logo']");
    private By btnMenu = By.id("main-toggle-menu");


    public By getBtnMuebles() {
        return btnMuebles;
    }

    public By getBtnProducto1() {
        return btnProducto1;
    }

    public By getBtnProducto2() {
        return btnProducto2;
    }

    public By getBtnProducto3() {
        return btnProducto3;
    }

    public By getBtnProducto4() {
        return btnProducto4;
    }

    public By getBtnProducto5() {
        return btnProducto5;
    }

    public By getLblproductos() {
        return lblproductos;
    }

    public By getBtnInicio() {
        return btnInicio;
    }

    public By getBtnMenu() {
        return btnMenu;
    }
}
