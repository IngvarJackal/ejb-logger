package hys.ejb_logger.logging;

import hys.ejb_logger.persistance.Message;
import hys.ejb_logger.persistance.MessageDAO;

import org.switchyard.component.bean.Service;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

@Service(LoggingService.class)
public class LoggingServiceBean implements LoggingService {
	
	private static final Logger logger = LogManager.getLogger(LoggingServiceBean.class);
	private MessageDAO msgDAO = new MessageDAO();
	
	@Override
	public void logMessage(Message message) {
		logger.info(message.getMsg());
	}
	

}
