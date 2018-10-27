package br.com.gustavo.criacao.factoryMethod.implementacao.fabricas;

import br.com.gustavo.criacao.factoryMethod.implementacao.carros.Fiesta;
import br.com.gustavo.criacao.factoryMethod.interfaces.Carro;
import br.com.gustavo.criacao.factoryMethod.interfaces.FabricaCarro;

public class FabricaFord implements FabricaCarro {
    @Override
    public Carro criarCarro() {
        return new Fiesta();
    }
}
