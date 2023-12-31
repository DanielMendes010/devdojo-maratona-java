package ZZClambdas.service;

import ZZClambdas.dominio.Anime;

public class AnimeComparators {
    public static int compareByTittle(Anime a1, Anime a2){
        return a1.getTitle().compareTo(a2.getTitle());
    }

    public static int compareByEpisode(Anime a1, Anime a2){
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }

    public int compareByEpisodeNonStatic(Anime a1, Anime a2){
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }
}
