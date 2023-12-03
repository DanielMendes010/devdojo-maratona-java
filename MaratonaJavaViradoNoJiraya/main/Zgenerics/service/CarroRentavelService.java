package Zgenerics.service;

import Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BWM"), new Carro("Fusca")));

    public Carro buscandoCarroDisponivel() {
        System.out.println("Buscando carro disponível....");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro...." + carro);
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void retornandoCarroAlugado(Carro carro) {
        System.out.println("Devolvendo carro " + carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(carrosDisponiveis);
    }
}
