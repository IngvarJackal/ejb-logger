package hys.ejb_logger.persistance;

import org.apache.camel.builder.RouteBuilder;

public class MessagePersistanceServiceRoute extends RouteBuilder {

	/**
	 * The Camel route is configured via this method.  The from endpoint is required to be a SwitchYard service.
	 */
	public void configure() {
		// TODO Auto-generated method stub
		from("switchyard://MessagePersistanceService")
			.log("Received message for 'MessagePersistanceService' : ${body}")
			.to("switchyard://PersistanceRef");
	}

}
