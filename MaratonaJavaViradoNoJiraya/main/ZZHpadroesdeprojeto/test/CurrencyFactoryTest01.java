package ZZHpadroesdeprojeto.test;

import ZZHpadroesdeprojeto.dominio.Country;
import ZZHpadroesdeprojeto.dominio.Currency;
import ZZHpadroesdeprojeto.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
