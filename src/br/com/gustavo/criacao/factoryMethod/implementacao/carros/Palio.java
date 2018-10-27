package br.com.gustavo.criacao.factoryMethod.implementacao.carros;

import br.com.gustavo.criacao.factoryMethod.interfaces.Carro;

public class Palio implements Carro {
    @Override
    public void exibirInfo() {
        System.out.println("Modelo: Palio\nFabricante: Fiat");
    }
}
