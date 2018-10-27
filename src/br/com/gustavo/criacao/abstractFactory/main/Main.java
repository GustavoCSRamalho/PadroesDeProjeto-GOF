package br.com.gustavo.criacao.abstractFactory.main;

import br.com.gustavo.criacao.abstractFactory.implementacao.fabrica.FabricaFiat;
import br.com.gustavo.criacao.abstractFactory.implementacao.fabrica.FabricaFord;
import br.com.gustavo.criacao.abstractFactory.interfaces.CarroPopular;
import br.com.gustavo.criacao.abstractFactory.interfaces.CarroSedan;
import br.com.gustavo.criacao.abstractFactory.interfaces.FabricaDeCarro;

public class Main {

    public static void main(String[] args){
        FabricaDeCarro fabrica = new FabricaFiat();
        CarroSedan sedan = fabrica.criarCarroSedan();
        CarroPopular popular = fabrica.criarCarroPopular();
        sedan.exibirInfoSedan();
        popular.exibirInfoPopular();
        System.out.println();

        fabrica = new FabricaFord();
        sedan = fabrica.criarCarroSedan();
        popular = fabrica.criarCarroPopular();
        sedan.exibirInfoSedan();
        popular.exibirInfoPopular();

    }
}
