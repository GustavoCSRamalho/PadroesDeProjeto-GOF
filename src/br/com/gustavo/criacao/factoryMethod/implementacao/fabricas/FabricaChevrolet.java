package br.com.gustavo.criacao.factoryMethod.implementacao.fabricas;

import br.com.gustavo.criacao.factoryMethod.implementacao.carros.Celta;
import br.com.gustavo.criacao.factoryMethod.interfaces.Carro;
import br.com.gustavo.criacao.factoryMethod.interfaces.FabricaCarro;

public class FabricaChevrolet implements FabricaCarro {
    @Override
    public Carro criarCarro() {
        return new Celta();
    }
}
