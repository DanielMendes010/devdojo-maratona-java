package ZZDoptional.test;

import ZZDoptional.dominio.Manga;
import ZZDoptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Naruto Shippuden");
        mangaByTitle.ifPresent(m -> m.setTitle("Naruto Shippuden Season 2"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findById(1).orElseThrow(IllegalAccessError::new);
        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Drifters")
                .orElseGet(() -> new Manga(3, "Drifters", 20));
        System.out.println(newManga);
    }
}
