package Zgenerics.test;

import Zgenerics.dominio.Barco;
import Zgenerics.service.BarcoRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscandoBarcoDisponivel();
        System.out.println("Usando o barco por um mês...");
        barcoRentavelService.retornandoBarcoAlugado(barco);
    }
}
