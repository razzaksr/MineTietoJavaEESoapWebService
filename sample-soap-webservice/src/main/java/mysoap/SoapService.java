package mysoap;

import app.mybank.entity.CreditCard;
import app.mybank.middleware.DatabaseTarget;
import app.mybank.remotes.StorageTarget;
import app.mybank.services.CreditCardServices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import java.util.List;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class SoapService {
    CreditCardServices services;
    public SoapService(){
        StorageTarget storageTarget=new DatabaseTarget();
        services=new CreditCardServices(storageTarget);
    }

    @WebMethod
    public void saveService(@WebParam(name="CreditCard") CreditCard creditCard){
        services.callSave(creditCard);
    }

    @WebMethod
    @WebResult(name = "ListCreditCard")
    public ListCreditCard listService(){
        ListCreditCard lists=new ListCreditCard();
        lists.getCreditCards().addAll(services.callFindAll());
        return lists;
    }
}
