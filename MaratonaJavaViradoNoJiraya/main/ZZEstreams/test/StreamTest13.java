package ZZEstreams.test;

import ZZEstreams.dominio.Category;
import ZZEstreams.dominio.LightNovel;
import ZZEstreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static ZZEstreams.dominio.Promotion.*;
import static java.util.stream.Collectors.groupingBy;

public class StreamTest13 {
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
        Map<Promotion, List<LightNovel>> collect = lightNovels
                .stream()
                .collect(groupingBy(StreamTest13::getPromotion
                ));
        System.out.println(collect);
        // Map<Category, Map<Promotion, List<LightNovel>>>

        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels
                .stream()
                .collect(groupingBy(LightNovel::getCategory, groupingBy(StreamTest13::getPromotion
                )));
        System.out.println(collect1);
    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}
