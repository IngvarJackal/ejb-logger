package hys.ejb_logger.logging;

import hys.ejb_logger.persistance.Message;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/")
public interface LoggingResource {

	@POST
	@Path("/")
    @Consumes({"application/json"})
    public void logMessage(Message message);
}
