package pl.akademiakodu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.akademiakodu.model.Category;
import pl.akademiakodu.model.CategoryRepository;
import pl.akademiakodu.model.GifRepository;

/**
 * Created by DmytroBartoshchuk on 03.04.2017.
 */
@Controller
public class CategoriesController {

    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private GifRepository gifRepository;

    @GetMapping("/categories")
    public  String listCategories(ModelMap modelMap){
        modelMap.addAttribute("categories", categoryRepository.getAllCategories());
        return "/categories";
    }

    @GetMapping("/category/{idcategory}")
    public String showCategory(@PathVariable int idcategory, ModelMap modelMap){
        Category category = categoryRepository.findById(idcategory);
        modelMap.addAttribute("category", category);
        modelMap.addAttribute("gifs", gifRepository.findById(idcategory));
        return "/category";
    }
}
