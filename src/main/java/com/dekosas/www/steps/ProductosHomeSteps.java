package com.dekosas.www.steps;


import com.dekosas.www.pageObject.ProductosHomePages;
import com.dekosas.www.utils.EsperaImplicita;
import com.dekosas.www.utils.Excel;
import com.dekosas.www.utils.Scroll;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class ProductosHomeSteps extends MetodosSeleniumSteps{
    ProductosHomePages productosHomePages = new ProductosHomePages();
    Scroll scroll = new Scroll();
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();
    EsperaImplicita esperaImplicita = new EsperaImplicita();

    @Step
    public void ElegirCategoria(){
        esperaImplicita.esperar(60);
        clickear(productosHomePages.getBtnMenu());
        clickear(productosHomePages.getBtnMuebles());
    }
    @Step
    public void VolverHome(){
        clickear(productosHomePages.getBtnInicio());

    }
    @Step
    public void ElegirProducto1(){
        esperaImplicita.esperar(60);
        scroll.scrollPixels();
        clickear(productosHomePages.getBtnProducto1());
        esperaImplicita.esperar(60);

    }
    @Step
    public void Validacion1(){
        try {
            leerExcel = Excel.readExcel("dekosas.xlsx", "validaciones home");
        }catch (IOException e){
            e.printStackTrace();
        }
        validacion(productosHomePages.getLblproductos(),leerExcel.get(0).get("productos"));
    }
    @Step
    public void ElegirProducto2(){
        esperaImplicita.esperar(60);
        scroll.scrollPixels();
        clickear(productosHomePages.getBtnProducto2());
        esperaImplicita.esperar(60);

    }
    @Step
    public void Validacion2(){
        try {
            leerExcel = Excel.readExcel("dekosas.xlsx", "validaciones home");
        }catch (IOException e){
            e.printStackTrace();
        }
        validacion(productosHomePages.getLblproductos(),leerExcel.get(1).get("productos"));
    }
    @Step
    public void ElegirProducto3(){
        esperaImplicita.esperar(60);
        scroll.scrollPixels();
        clickear(productosHomePages.getBtnProducto3());
        esperaImplicita.esperar(60);

    }
    @Step
    public void Validacion3(){
        try {
            leerExcel = Excel.readExcel("dekosas.xlsx", "validaciones home");
        }catch (IOException e){
            e.printStackTrace();
        }
        validacion(productosHomePages.getLblproductos(),leerExcel.get(2).get("productos"));
    }

    @Step
    public void ElegirProducto4(){
        esperaImplicita.esperar(60);
        scroll.scrollAElemento(productosHomePages.getBtnProducto1());
        clickear(productosHomePages.getBtnProducto4());
        esperaImplicita.esperar(60);

    }
    @Step
    public void Validacion4(){
        try {
            leerExcel = Excel.readExcel("dekosas.xlsx", "validaciones home");
        }catch (IOException e){
            e.printStackTrace();
        }
        validacion(productosHomePages.getLblproductos(),leerExcel.get(3).get("productos"));
    }
    @Step
    public void ElegirProducto5(){
        esperaImplicita.esperar(60);
        scroll.scrollAElemento(productosHomePages.getBtnProducto1());
        clickear(productosHomePages.getBtnProducto5());
        esperaImplicita.esperar(60);

    }
    @Step
    public void Validacion5(){
        try {
            leerExcel = Excel.readExcel("dekosas.xlsx", "validaciones home");
        }catch (IOException e){
            e.printStackTrace();
        }
        validacion(productosHomePages.getLblproductos(),leerExcel.get(4).get("productos"));
    }
    @Step
    public void Pasos(){
        ElegirCategoria();
        ElegirProducto1();
        Validacion1();
        ElegirCategoria();
        ElegirProducto2();
        Validacion2();
        ElegirCategoria();
        ElegirProducto3();
        Validacion3();
        ElegirCategoria();
        ElegirProducto4();
        Validacion4();
        ElegirCategoria();
        ElegirProducto5();
        Validacion5();
    }
}
