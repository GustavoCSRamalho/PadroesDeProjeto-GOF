package br.com.gustavo.criacao.abstractFactory.implementacao.carro;

import br.com.gustavo.criacao.abstractFactory.interfaces.CarroPopular;

public class Fiesta implements CarroPopular {
    @Override
    public void exibirInfoPopular() {
        System.out.println("Modelo: Fiesta\nFábrica: Ford\nCategoria:Popular");
    }
}
