package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hola mundo generacion de kubernetes.yml automatico para formacion de Quarkus en Indra";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/2")
    public String hello2() {
        return "Hola comunidad Java del DN";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/3")
    public String hello3() {
        return "Hola mundo #3 de la comunidad Java del DN";
    } 
}
