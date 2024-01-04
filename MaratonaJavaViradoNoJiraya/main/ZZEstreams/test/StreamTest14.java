package ZZEstreams.test;

import ZZEstreams.dominio.Category;
import ZZEstreams.dominio.LightNovel;
import ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static ZZEstreams.dominio.Promotion.NORMAL_PRICE;
import static ZZEstreams.dominio.Promotion.UNDER_PROMOTION;
import static java.util.stream.Collectors.groupingBy;

public class StreamTest14 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Naruto Shippuden", 4.90, Category.FANTASY),
            new LightNovel("Dragon Ball Super", 5.40, Category.FANTASY),
            new LightNovel("One Piece", 3.00, Category.FANTASY),
            new LightNovel("Bleach", 2.20, Category.FANTASY),
            new LightNovel("Bleach", 2.20, Category.FANTASY),
            new LightNovel("Fullmetal Alchimist", 6.00, Category.FANTASY),
            new LightNovel("One Punch Man", 2.90, Category.COMEDY),
            new LightNovel("Death Note", 4.90, Category.DRAMA)
    ));

    public static void main(String[] args) {
        Map<Category, Long> collect = lightNovels
                .stream()
                .collect(groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect);

        Map<Category, Optional<LightNovel>> collect1 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);

        Map<Category, LightNovel> collect2 = lightNovels.stream().collect(groupingBy(LightNovel::getCategory,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        System.out.println(collect2);

        Map<Category, LightNovel> collect3 = lightNovels.stream().collect(Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect3);
    }
}
