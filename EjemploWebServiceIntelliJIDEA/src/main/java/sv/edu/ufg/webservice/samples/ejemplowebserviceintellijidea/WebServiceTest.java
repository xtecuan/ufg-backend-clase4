package sv.edu.ufg.webservice.samples.ejemplowebserviceintellijidea;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;

@WebService
public class WebServiceTest {

    @WebMethod(operationName = "test")
    public String test(@WebParam(name = "apodo") String apodo){

        System.out.println("Apodo: "+apodo);
        return "Hello "+apodo+" fecha: "+new Date();
    }

}
