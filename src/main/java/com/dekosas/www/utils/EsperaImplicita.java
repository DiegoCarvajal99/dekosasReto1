package com.dekosas.www.utils;

import com.dekosas.www.driver.SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

public class EsperaImplicita {
    public void esperar(int segundos) {
        SeleniumWebDriver.driver.manage().timeouts().implicitlyWait(segundos, TimeUnit.SECONDS);
    }
    public void esperaEx(int tiempo){
        try {
            Thread.sleep(tiempo);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
