package ws;

import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:7000/",new BanqueService());
        System.out.println("Web service deploye sur http://0.0.0.0:7000/");
    }
}
