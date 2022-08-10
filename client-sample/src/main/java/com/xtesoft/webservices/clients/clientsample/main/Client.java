package com.xtesoft.webservices.clients.clientsample.main;

import com.xtesoft.webservices.clients.clientsample.WebServiceTest;
import com.xtesoft.webservices.clients.clientsample.WebServiceTestService;

import java.net.URL;


public class Client {


            static WebServiceTestService service;

    public static void main(String[] args) {


        try{

            service = new WebServiceTestService(new URL("http://blitzthinkw2:8080/EjemploWebServiceIntelliJIDEA-1.0-SNAPSHOT/WebServiceTestService?wsdl"));
            WebServiceTest port = service.getWebServiceTestPort();
            String saludo = port.test("Julian Rivera Pineda 3");

            System.out.println("Salida: "+ saludo);

        }catch(Exception ex){
            ex.printStackTrace();
        }

    }
}
