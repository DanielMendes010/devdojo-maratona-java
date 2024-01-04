package ZZEstreams.test;

import ZZEstreams.dominio.Category;
import ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
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
        Map<Category, List<LightNovel>> categoryLightNovelMap = new HashMap<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> comedy = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCategory()){
                case DRAMA: drama.add(lightNovel); break;
                case FANTASY: fantasy.add(lightNovel); break;
                case COMEDY: comedy.add(lightNovel); break;
            }
        }
        categoryLightNovelMap.put(Category.DRAMA, drama);
        categoryLightNovelMap.put(Category.FANTASY, fantasy);
        categoryLightNovelMap.put(Category.COMEDY, comedy);
        System.out.println(categoryLightNovelMap);

        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);
    }
}
