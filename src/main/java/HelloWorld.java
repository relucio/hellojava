package com.ibm.esr.microservice.helloworld; // you can change the package name

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.util.ArrayList;

@Path("/helloworld") // you can change the path to your microservice
public class HelloWorld {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response example() {
    	System.out.println(System.getenv());
        return Response.ok("Hello World, you have reached host " + System.getenv("HOSTNAME")).build();
    }

}
