package br.com.gustavo.criacao.abstractFactory.implementacao.carro;

import br.com.gustavo.criacao.abstractFactory.interfaces.CarroSedan;

public class Siena implements CarroSedan {
    @Override
    public void exibirInfoSedan() {
        System.out.println("Modelo: Siena\nFábrica: Fiat\nCategoria:Sedan");
    }
}
