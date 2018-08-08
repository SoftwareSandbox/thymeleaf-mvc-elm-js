package be.swsb.tl.service.taxonomy;

import be.swsb.tl.domain.taxonomy.Category;
import be.swsb.tl.domain.taxonomy.Genre;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class TaxonomyService {

    private static HashMap<String, Genre> genres = new HashMap<>();

    static {
        genres.put("Horror", new Genre("Horror", 5));
        genres.put("Sci-Fi", new Genre("Sci-Fi", 7));
    }

    private static List<Category> categories = Arrays.asList(
            new Category("tween", 10, genres.get("Horror")),
            new Category("adult", 5, genres.get("Horror")),
            new Category("tween", 3, genres.get("Sci-Fi")),
            new Category("adult", 9, genres.get("Sci-Fi"))
    );

    public List<Category> categories() {
        return categories;
    }

    public List<Category> categoriesForGenre(final String genre) {
        return null;
    }

    public List<Genre> genres() {
        return new ArrayList<>(genres.values());
    }

    public List<Genre> genresForCategory(final String category) {
        return null;
    }
}
