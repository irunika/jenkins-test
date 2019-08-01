package org.irunika.jenkins.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/test")
public class TestService {

    @Path("/hello")
    @GET
    public String sayHello() {
        return "Hello world";
    }
}
