package com.test.testmart;

import javax.xml.ws.Endpoint;

/**
 * Created by CMI-USER on 2/23/2016.
 */
public class TestMartPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:1234/productcatalog", new ProductCatalog());
    }
}
