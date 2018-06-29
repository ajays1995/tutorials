
public class Message {
	
	private String id;
	private String messageType;
	private String messageInfo;
	
	public String getId() {
		return id;
	}
	

	public void setId(String id) {
		this.id = id;
	}
	

	public String getMessageType() {
		return messageType;
	}
	

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	

	public String getMessageInfo() {
		return messageInfo;
	}
	

	public void setMessageInfo(String messageInfo) {
		this.messageInfo = messageInfo;
	}
	

	public Message(String id,String messageType,String messageInfo){
		
		this.id = id;
		this.messageInfo = messageInfo;
		this.messageType = messageType;
	}

}
