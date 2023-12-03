package ZZAclassesinternas.test;

public class OuterClassesTest03 {
    private String name = "Fulano";

    static class Nested {
        private String lastName = "De tal";
        void print() {
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
