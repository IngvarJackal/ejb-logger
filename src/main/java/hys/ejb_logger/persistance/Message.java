package hys.ejb_logger.persistance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="message")
public class Message {
	@XmlElement(name = "msg", required=true)
	private String msg;
	
	@XmlElement(name = "id", required=false)
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public Message() {}
	public Message(String msg) {
		this.msg = msg;
	}
	public Message(Integer id, String msg) {
		this.msg = msg;
		this.id = id;
	}
}
