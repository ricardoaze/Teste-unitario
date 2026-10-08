package com.spring.teste_unitario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTeste {

    @Test
    void deveSomar() {

        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.somar(10, 5);

        assertEquals(15, resultado);
    }

    @Test
    void deveSubtrair() {

        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.subtrair(10, 5);

        assertEquals(5, resultado);
    }
}










