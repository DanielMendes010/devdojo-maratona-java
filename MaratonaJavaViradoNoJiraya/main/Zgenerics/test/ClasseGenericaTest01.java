package Zgenerics.test;

import Zgenerics.dominio.Carro;
import Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscandoCarroDisponivel();
        System.out.println("Usando o carro por um mês...");
        carroRentavelService.retornandoCarroAlugado(carro);
    }
}
