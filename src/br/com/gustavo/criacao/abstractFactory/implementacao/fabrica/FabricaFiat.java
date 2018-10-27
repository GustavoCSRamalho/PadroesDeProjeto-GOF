package br.com.gustavo.criacao.abstractFactory.implementacao.fabrica;

import br.com.gustavo.criacao.abstractFactory.implementacao.carro.Palio;
import br.com.gustavo.criacao.abstractFactory.implementacao.carro.Siena;
import br.com.gustavo.criacao.abstractFactory.interfaces.CarroPopular;
import br.com.gustavo.criacao.abstractFactory.interfaces.CarroSedan;
import br.com.gustavo.criacao.abstractFactory.interfaces.FabricaDeCarro;

public class FabricaFiat implements FabricaDeCarro {
    @Override
    public CarroSedan criarCarroSedan() {
        return new Siena();
    }

    @Override
    public CarroPopular criarCarroPopular() {
        return new Palio();
    }
}
