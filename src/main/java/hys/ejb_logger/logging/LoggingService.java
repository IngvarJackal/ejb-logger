package hys.ejb_logger.logging;

import hys.ejb_logger.persistance.Message;

public interface LoggingService {
	public void logMessage(Message message);
}
