package com.dekosas.www.steps;

import com.dekosas.www.pageObject.BuscarPages;
import com.dekosas.www.utils.EsperaImplicita;
import com.dekosas.www.utils.Excel;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class BuscarSteps extends MetodosSeleniumSteps{

    BuscarPages buscarPages = new BuscarPages();
    EsperaImplicita esperaImplicita = new EsperaImplicita();

    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();
    @Step
    public void Buscar(){
        esperaImplicita.esperar(60);

        try {
            leerExcel = Excel.readExcel("dekosas.xlsx", "Terminos Busqueda");
        }catch (IOException e){
            e.printStackTrace();
        }

        for (int i = 0; i<leerExcel.size(); i++){
            escribirMasEnter(buscarPages.getTxtBarraBusqueda(), leerExcel.get(i).get("buscar"));

            limpiarCampo(buscarPages.getTxtBarraBusqueda());
        }

        }



    }

