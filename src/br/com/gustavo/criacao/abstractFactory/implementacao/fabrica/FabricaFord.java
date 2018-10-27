package br.com.gustavo.criacao.abstractFactory.implementacao.fabrica;

import br.com.gustavo.criacao.abstractFactory.implementacao.carro.Fiesta;
import br.com.gustavo.criacao.abstractFactory.implementacao.carro.FiestaSiena;
import br.com.gustavo.criacao.abstractFactory.interfaces.CarroPopular;
import br.com.gustavo.criacao.abstractFactory.interfaces.CarroSedan;
import br.com.gustavo.criacao.abstractFactory.interfaces.FabricaDeCarro;

public class FabricaFord implements FabricaDeCarro {
    @Override
    public CarroSedan criarCarroSedan() {
        return new FiestaSiena();
    }

    @Override
    public CarroPopular criarCarroPopular() {
        return new Fiesta();
    }
}
