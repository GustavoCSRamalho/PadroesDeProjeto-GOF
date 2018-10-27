package br.com.gustavo.criacao.factoryMethod.implementacao.fabricas;

import br.com.gustavo.criacao.factoryMethod.implementacao.carros.Palio;
import br.com.gustavo.criacao.factoryMethod.interfaces.Carro;
import br.com.gustavo.criacao.factoryMethod.interfaces.FabricaCarro;

public class FabricaFiat implements FabricaCarro {

    @Override
    public Carro criarCarro() {
        return new Palio();
    }
}