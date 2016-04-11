package com.test.testmart;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Created by CMI-USER on 2/22/2016.
 */

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class ShopInfo {

    @WebMethod
    @WebResult(partName = "lookupOutput")
    public String getShopInfo(@WebParam(partName = "lookupInput") String property) throws InvalidInputException {
        String response = null;
        if ("shopName".equals(property))
            response = "Test Mart";
        else if ("since".equals(property))
            response = "since 2012";
        else throw new InvalidInputException("Invalid Input", property + "is not valid input");
        return response;
    }
}
