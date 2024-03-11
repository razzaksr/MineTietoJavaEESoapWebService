package org.example;

import mysoap.CreditCard;
import mysoap.ListCreditCard;
import mysoap.SoapService;
import mysoap.SoapServiceService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SoapServiceService soapServiceService=new SoapServiceService();
        SoapService soapService=soapServiceService.getSoapServicePort();
        ListCreditCard listCreditCard=soapService.listService();
        for (CreditCard creditCard:listCreditCard.getCreditCards()){
            System.out.println(creditCard.getCardHolder());
        }
    }
}
