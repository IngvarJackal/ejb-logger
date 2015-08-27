package hys.ejb_logger.persistance;

import java.util.HashMap;
import java.util.Map;

public class MessageDAO {
	
	private static Map<Integer, Message> messages = new HashMap<Integer, Message>();
	
	{
		messages.put(1, new Message(1, "foo"));
		messages.put(2, new Message(2, "bar"));
	}
	
	public Message getMsgByID(Integer id) {
		Message msg = messages.get(id);
		if (msg == null)
			msg = new Message("NOT FOUND");
		return msg;
	}
}
