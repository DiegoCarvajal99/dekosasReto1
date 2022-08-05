package com.dekosas.www.steps;

import com.dekosas.www.pageObject.CategoriaDecoracionPages;
import com.dekosas.www.pageObject.CategoriaPages;
import com.dekosas.www.utils.EsperaImplicita;
import com.dekosas.www.utils.Excel;
import com.dekosas.www.utils.Scroll;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class CategoriaSteps extends MetodosSeleniumSteps{

    CategoriaPages categoriaPages = new CategoriaPages();
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();
    CategoriaDecoracionPages categoriaDecoracionPages = new CategoriaDecoracionPages();
    Scroll scroll = new Scroll();
    EsperaImplicita esperaImplicita = new EsperaImplicita();
    @Step
    public void ElegirCategoriayProducto1(){
        esperaImplicita.esperaEx(10000);
        clickear(categoriaPages.getBtnMenu());
        esperaImplicita.esperaEx(1000);
        clickear(categoriaPages.getBtnDecoracion());
        esperaImplicita.esperaEx(10000);
        scroll.scrollPixels();
        clickear(categoriaDecoracionPages.getBtnProducto1());


    }
    @Step
    public void ValidarProducto1(){
        try {
            leerExcel = Excel.readExcel("dekosas.xlsx", "validaciones");
        }catch (IOException e){
            e.printStackTrace();
        }
        validacion(categoriaDecoracionPages.getLblProducto1(),leerExcel.get(0).get("productos"));
    }

    @Step
    public void ElegirCategoriayProducto2(){
        esperaImplicita.esperaEx(10000);
        clickear(categoriaDecoracionPages.getBtnInicio());
        esperaImplicita.esperaEx(10000);
        clickear(categoriaPages.getBtnMenu());
        esperaImplicita.esperaEx(1000);
        clickear(categoriaPages.getBtnDecoracion());
        esperaImplicita.esperaEx(10000);
        scroll.scrollPixels();
        clickear(categoriaDecoracionPages.getBtnProducto2());
    }
    @Step
    public void ValidarProducto2(){
        try {
            leerExcel = Excel.readExcel("dekosas.xlsx", "validaciones");
        }catch (IOException e){
            e.printStackTrace();
        }
        validacion(categoriaDecoracionPages.getLblProducto2(),leerExcel.get(1).get("productos"));
    }
    @Step
    public void Pasos(){
        ElegirCategoriayProducto1();
        ValidarProducto1();
        ElegirCategoriayProducto2();
        ValidarProducto2();
    }
}
