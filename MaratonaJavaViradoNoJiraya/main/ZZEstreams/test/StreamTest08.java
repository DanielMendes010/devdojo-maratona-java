package ZZEstreams.test;

import ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Naruto Shippuden", 4.90),
            new LightNovel("Dragon Ball Super", 5.40),
            new LightNovel("One Piece", 3.00),
            new LightNovel("Bleach", 2.20),
            new LightNovel("Bleach", 2.20),
            new LightNovel("Fullmetal Alchimist", 6.00),
            new LightNovel("One Punch Man", 2.90)
    ));

    public static void main(String[] args) {
        lightNovels
                .stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        double sum = lightNovels.stream()//Stream<Double>
                .mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 3)
                .sum();

        System.out.println(sum);
    }
}
