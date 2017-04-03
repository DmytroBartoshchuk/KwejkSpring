package pl.akademiakodu.model;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by DmytroBartoshchuk on 03.04.2017.
 */
@Component
public class CategoryRepository {
    private static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1, "funny"),
            new Category(2, "sport"),
            new Category(3, "it")
    );

    public List<Category> getAllCategories() {
        return ALL_CATEGORIES;
    }

    public Category findById(int id){
        for (Category category: ALL_CATEGORIES){
            if (category.getId() == id)
                return category;
        }
        return null;
    }
}
