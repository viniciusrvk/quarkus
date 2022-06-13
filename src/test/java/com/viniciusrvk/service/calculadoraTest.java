package com.viniciusrvk.service;

import org.junit.jupiter.api.Test;
import org.wildfly.common.Assert;


public class calculadoraTest {

    @Test
    public void deveRetornarZero() {
        CalculadoraService calculadoraService = new CalculadoraService();
        Integer retorno = calculadoraService.calcular(0);
        Assert.assertTrue(retorno == 0);
    }
    @Test
    public void deveRetornarUm() {
        CalculadoraService calculadoraService = new CalculadoraService();
        Integer retorno = calculadoraService.calcular(1);
        Assert.assertTrue(retorno == 1);
    }
    @Test
    public void deveRetornarDois() {
        CalculadoraService calculadoraService = new CalculadoraService();
        Integer retorno = calculadoraService.calcular(5);
        Assert.assertTrue(retorno == 2);
    }
    @Test
    public void deveRetornarTres() {
        CalculadoraService calculadoraService = new CalculadoraService();
        Integer retorno = calculadoraService.calcular(6);
        Assert.assertTrue(retorno == 3);
    }
    @Test
    public void deveRetornarQuatro() {
        CalculadoraService calculadoraService = new CalculadoraService();
        Integer retorno = calculadoraService.calcular(7);
        Assert.assertTrue(retorno == 4);
    }
    @Test
    public void deveRetornarCinco() {
        CalculadoraService calculadoraService = new CalculadoraService();
        Integer retorno = calculadoraService.calcular(8);
        Assert.assertTrue(retorno == 5);
    }
    @Test
    public void deveRetornarSete() {
        CalculadoraService calculadoraService = new CalculadoraService();
        Integer retorno = calculadoraService.calcular(9);
        Assert.assertTrue(retorno == 7);
    }
}