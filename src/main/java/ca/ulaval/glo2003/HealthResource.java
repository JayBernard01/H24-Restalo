package ca.ulaval.glo2003;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("")
public class HealthResource {

    @GET
    @Path("health")
    @Produces(MediaType.APPLICATION_JSON)
    public Response health() {
        return Response.ok(new HealthResponse("healthOk")).build();
    }

    @GET
    @Path("products")
    @Produces(MediaType.APPLICATION_JSON)
    public Response products() {
        return Response.ok(new HealthResponse("productsOk")).build();
    }

    @GET
    @Path("/products/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response productsById(@PathParam("id") String id) {
        return Response.ok(new HealthResponse("productsByIdOk")).build();
    }
}
