package hys.ejb_logger.persistance;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;

@Path("/obtain/")
public interface MessagePersistanceResource {

	@POST
	@Consumes({"application/json"})
	@Produces({"application/json"})
	public Message getMessage(MessageRequest request);
	
}
