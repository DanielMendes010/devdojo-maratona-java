package ZZEstreams.test;

import ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//1. Order LightNovel by title
//2. Retrieve the first 3 titles light novels with price less than 4
public class StreamTest01 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Naruto Shippuden", 4.90),
            new LightNovel("Dragon Ball Super", 5.40),
            new LightNovel("One Piece", 3.00),
            new LightNovel("Bleach", 2.20),
            new LightNovel("Fullmetal Alchimist", 6.00),
            new LightNovel("One Punch Man", 2.90)
    ));

    public static void main(String[] args) {
        lightNovels.sort((Comparator.comparing(LightNovel::getTitle)));
        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4) {
                titles.add(lightNovel.getTitle());
            }
            if (titles.size() >= 3) {
                break;
            }
        }
        System.out.println(lightNovels);
        System.out.println(titles);
    }
}
