package br.com.gustavo.criacao.abstractFactory.implementacao.carro;

import br.com.gustavo.criacao.abstractFactory.interfaces.CarroPopular;

public class Palio implements CarroPopular {
    @Override
    public void exibirInfoPopular() {
        System.out.println("Modelo: Palio\nFábrica: Fiat\nCategoria:Popular");
    }
}
