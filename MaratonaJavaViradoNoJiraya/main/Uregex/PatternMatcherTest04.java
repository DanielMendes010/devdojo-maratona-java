package Uregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args){
        // \d = Todos os dígitos
        // \D = Tudo o que não for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, dígitos, _
        // \W = Tudo que não for incluso no \w
        // []
        // ? Zero ou uma ocorrências
        // * Zero ou mais ocorrências
        // + uma ou mais ocorrências
        // {n,m} de n até m ocorrências
        // ()
        // | o(v|o)o ovo | oco
        // $
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0x 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex " + regex);
        System.out.println("Posições encontradas");

        while (matcher.find()){
            System.out.print(matcher.start() + " " + matcher.group()+ "\n");
        }
    }
}
