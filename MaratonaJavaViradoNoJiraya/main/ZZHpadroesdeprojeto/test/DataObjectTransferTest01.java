package ZZHpadroesdeprojeto.test;

import ZZHpadroesdeprojeto.dominio.*;

public class DataObjectTransferTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person person = Person.PersonBuilder
                .builder()
                .firstName("Daniel")
                .lastName("Mendes")
                .build();

        ReportDto reportDto = ReportDto.ReportDtoBuilder
                .builder()
                .aircraft(aircraft.getName())
                .country(country)
                .currency(currency)
                .personName(person.getFirstName())
                .build();

        System.out.println(reportDto);
    }
}
