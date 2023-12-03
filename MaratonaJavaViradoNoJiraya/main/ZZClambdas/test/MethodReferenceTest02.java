package ZZClambdas.test;

import ZZClambdas.dominio.Anime;
import ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

//Reference to an instance method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(
                List.of(new Anime("Berserk", 43),
                        new Anime("One Piece", 900),
                        new Anime("Naruto", 500)
                ));
        animeList.sort(animeComparators::compareByEpisodeNonStatic);
        animeList.sort((a1, a2) -> animeComparators.compareByEpisodeNonStatic(a1, a2));
        System.out.println(animeList);
    }
}
