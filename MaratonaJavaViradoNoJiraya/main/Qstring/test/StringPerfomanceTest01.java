package Qstring.test;

public class StringPerfomanceTest01 {
    public static void main(String[] args){
        long inicio = System.currentTimeMillis();
        concatString(30_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(1_000_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer " + (fim - inicio) + "ms");
    }

    public static void concatString(int tamanho){
        String texto = "Ola meu nome é William";
        for (int i = 0; i < tamanho; i++){
            texto += i;
        }
    }

    public static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++){
            sb.append(i);
        }
    }

    public static void concatStringBuffer(int tamanho){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < tamanho; i++){
            sb.append(i);
        }
    }
}
