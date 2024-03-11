package mysoap;

import javax.xml.ws.Endpoint;

public class SoapServiceEndPoint {
    private static String url="http://localhost:8085/credits";
    public static void main(String[] args) {
        SoapService soapService=new SoapService();
        System.out.println("Soap webservice running on "+url);
        Endpoint.publish(url,soapService);
    }
}
