package grupo.jung;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/publico")
public class Publico {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String recursoPublico() {
        return "Recurso publico!";
    }
}
