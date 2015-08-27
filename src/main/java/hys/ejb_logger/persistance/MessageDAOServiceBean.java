package hys.ejb_logger.persistance;

import javax.inject.Named;

import org.switchyard.component.bean.Service;

@Named("MessageDAOServiceBean")
@Service(MessageDAOService.class)
public class MessageDAOServiceBean implements MessageDAOService {

	MessageDAO dao = new MessageDAO();
	
	@Override
	public Message getMessage(MessageRequest request) {
		System.out.println(dao.getMsgByID(request.getId()).getMsg());
		return dao.getMsgByID(request.getId());
	}

}
