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
import static java.util.stream.Collectors.*;

public class StreamTest15 {
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
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);
        // Map<Category, List<Promotion>>

        Map<Category, Set<Promotion>> collect1 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion, toSet())));
        System.out.println(collect1);

        Map<Category, LinkedHashSet<Promotion>> collect2 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion,
                toCollection(LinkedHashSet::new))));
        System.out.println(collect2);
        
    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }

}
