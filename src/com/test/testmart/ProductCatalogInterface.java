package com.test.testmart;

import com.test.testmart.model.Product;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by CMI-USER on 2/22/2016.
 */
@WebService(name = "TestMartCatalog", targetNamespace = "https://www.testmart.com")
public interface ProductCatalogInterface {
    @WebMethod(action = "fetch_categories", operationName = "fetchCategories")
    List<String> getProductCategories();

    @WebMethod
    List<String> getProducts(String category);

    @WebMethod
    boolean addProduct(String category, String product);

    @WebMethod
    @WebResult(name = "Product")
    List<Product> getProductsv2(String category);
}
