package be.swsb.tl.rest.taxonomy;

import be.swsb.tl.domain.taxonomy.Category;
import be.swsb.tl.domain.taxonomy.Genre;
import be.swsb.tl.service.taxonomy.TaxonomyService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("taxonomy")
public class TaxonomyController {

    private TaxonomyService taxonomyService;

    public TaxonomyController(final TaxonomyService taxonomyService) {
        this.taxonomyService = taxonomyService;
    }

    @GetMapping("/genre")
    public List<Genre> allGenres() {
        return taxonomyService.genres();
    }

    @GetMapping("/genre")
    public List<Genre> allGenresByCategory(@RequestParam("category") String category) {
        return taxonomyService.genresForCategory(category);
    }

    @GetMapping("/category")
    public List<Category> allCategories() {
        return taxonomyService.categories();
    }

    @GetMapping("/category")
    public List<Category> allCategoriesForGenre(@RequestParam("genre") String genre) {
        return taxonomyService.categoriesForGenre(genre);
    }
}
