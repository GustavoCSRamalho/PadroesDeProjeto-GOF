package br.com.gustavo.criacao.abstractFactory.implementacao.carro;

import br.com.gustavo.criacao.abstractFactory.interfaces.CarroSedan;

public class FiestaSiena implements CarroSedan {
    @Override
    public void exibirInfoSedan() {
        System.out.println("Modelo: Fiesta\nFábrica:Ford\nCategoria:Sedan");
    }
}
