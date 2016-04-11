package com.test.testmart.business;

import com.test.testmart.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CMI-USER on 2/19/2016.
 */
public class ProductServiceImpl {

    List<String> bookList = new ArrayList<>();
    List<String> musicList = new ArrayList<>();
    List<String> movieList = new ArrayList<>();

    public ProductServiceImpl() {
        bookList.add("Book1");
        bookList.add("Book2");
        bookList.add("Book3");

        musicList.add("Music1");
        musicList.add("Music2");
        musicList.add("Music3");

        movieList.add("Movie1");
        movieList.add("Movie2");
        movieList.add("Movie3");
    }

    public List<String> getProductCategories() {
        List<String> categories = new ArrayList<>();
        categories.add("Books");
        categories.add("Music");
        categories.add("Movies");
        return categories;
    }

    public List<String> getProducts(String category) {
        switch (category.toLowerCase()){
            case "books": return bookList;
            case "music": return musicList;
            case "movies": return movieList;
        }
        return null;
    }


    public boolean addProduct(String category, String product){
        switch (category.toLowerCase()){
            case "books": bookList.add(product); break;
            case "music": musicList.add(product); break;
            case "movies": movieList.add(product); break;
            default: return false;
        }
        return true;
    }


    public List<Product> getProductsv2(String category) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Java Book 1" , "1234", 9999.99));
        productList.add(new Product("Java Book 2" , "ABC", 12.50));
        return productList;
    }
}
