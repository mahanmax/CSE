import java.util.ArrayList;

class Mailbox {
	ArrayList<String> mails = new ArrayList<String>();
	Message m = new Message("Han", "Chris");

	public Mailbox() {
		System.out.println("empty mailbox");
	}

	public void addMessage(Message m) {

	}

	public Message getMessage(int i) {
		return m;

	}

	public void removeMessage(int i) {

	}
}
