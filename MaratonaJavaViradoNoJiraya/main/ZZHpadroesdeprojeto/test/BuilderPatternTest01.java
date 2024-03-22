package ZZHpadroesdeprojeto.test;

import ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = Person.PersonBuilder
                .builder()
                .firstName("Daniel")
                .lastName("Mendes")
                .username("danielzinho_gameplay")
                .email("email.com")
                .build();

        System.out.println(build);
    }
}
