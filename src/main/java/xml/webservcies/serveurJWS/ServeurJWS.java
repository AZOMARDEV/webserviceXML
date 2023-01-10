package xml.webservcies.serveurJWS;

import jakarta.xml.ws.Endpoint;
import xml.webservcies.services.ReleveServices;

public class ServeurJWS {
	public static void main(String[] args) {
		Endpoint.publish("http://0.0.0.0:9191/",new ReleveServices());
        System.out.println("web service déployé sur http://0.0.0.0:9191/");
	}
}
