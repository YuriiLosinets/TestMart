package com.test.testmart;

import com.test.testmart.business.ProductServiceImpl;
import com.test.testmart.model.Product;

import javax.jws.WebService;
import java.util.List;

/**
 * Created by CMI-USER on 2/19/2016.
 */
@WebService(endpointInterface = "com.test.testmart.ProductCatalogInterface",
        portName = "TestMartCatalogPort", serviceName = "TestMartCatalogService")
public class ProductCatalog implements ProductCatalogInterface {

    ProductServiceImpl productService = new ProductServiceImpl();

    @Override
    public List<String> getProductCategories(){
        return productService.getProductCategories();
    }

    @Override
    public List<String> getProducts(String category){
        return productService.getProducts(category);
    }

    @Override
    public boolean addProduct(String category, String product){
       return productService.addProduct(category, product);
    }

    @Override
    public List<Product> getProductsv2(String category){
        return productService.getProductsv2(category);
    }
}
