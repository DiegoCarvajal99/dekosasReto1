package com.dekosas.www.pageObject;

import org.openqa.selenium.By;

public class BuscarPages {
    private By txtBarraBusqueda = By.id("search");

    public By getTxtBarraBusqueda() {
        return txtBarraBusqueda;
    }
}
