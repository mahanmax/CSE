
public class Message {

	private String sender;
	private String recipient;
	private String text;

	private final String send = "From: ";
	private final String receive = "\\nTo: ";

	public Message(String sender, String recipient) {
		this.setSender(sender);
		this.setRecipient(recipient);
	}

	public void append(String text) {

		text = " \n" + text + " \n ";
	}

	public String toString() {
		return send + sender + receive + recipient + text;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
