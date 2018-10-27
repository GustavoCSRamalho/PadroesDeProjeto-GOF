package br.com.gustavo.criacao.factoryMethod.implementacao.fabricas;

import br.com.gustavo.criacao.factoryMethod.implementacao.carros.Gol;
import br.com.gustavo.criacao.factoryMethod.interfaces.Carro;
import br.com.gustavo.criacao.factoryMethod.interfaces.FabricaCarro;

public class FabricaVolks implements FabricaCarro {
    @Override
    public Carro criarCarro() {
        return new Gol();
    }
}
