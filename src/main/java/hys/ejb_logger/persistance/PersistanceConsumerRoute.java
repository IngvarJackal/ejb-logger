package hys.ejb_logger.persistance;

import org.apache.camel.builder.RouteBuilder;

public class PersistanceConsumerRoute extends RouteBuilder {

	/**
	 * The Camel route is configured via this method.  The from endpoint is required to be a SwitchYard service.
	 */
	public void configure() {
		// TODO Auto-generated method stub
		from("switchyard://PersistanceConsumer").log(
				"Received message for 'PersistanceConsumer' : ${body}")
				.to("bean:MessageDAOServiceBean");
	}

}
