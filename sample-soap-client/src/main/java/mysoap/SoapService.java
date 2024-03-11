
package mysoap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SoapService", targetNamespace = "http://mysoap/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SoapService {


    /**
     * 
     * @return
     *     returns mysoap.ListCreditCard
     */
    @WebMethod
    @WebResult(name = "ListCreditCard", partName = "ListCreditCard")
    @Action(input = "http://mysoap/SoapService/listServiceRequest", output = "http://mysoap/SoapService/listServiceResponse")
    public ListCreditCard listService();

    /**
     * 
     * @param creditCard
     */
    @WebMethod
    @Action(input = "http://mysoap/SoapService/saveServiceRequest", output = "http://mysoap/SoapService/saveServiceResponse")
    public void saveService(
        @WebParam(name = "CreditCard", partName = "CreditCard")
        CreditCard creditCard);

}