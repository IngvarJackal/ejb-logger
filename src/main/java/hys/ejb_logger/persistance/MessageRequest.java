package hys.ejb_logger.persistance;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MessageRequest {
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public MessageRequest() {}
	public MessageRequest(Integer id) {
		this.id = id;
	}
}
