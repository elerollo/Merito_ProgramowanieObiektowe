public class Message {
    private String text;

    public Message(String text) {
        this.text = text;
    }

    public int getLength() {
        return text.length();
    }
    
    public boolean isEmpty() {
        if (text == "") {
            return true;
        } else {
            return false;
        }
    }
}
