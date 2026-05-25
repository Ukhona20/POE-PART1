import java.util.List;

    public class MessageStorage {
        public static void printSentMessages(List<Message> messages) {
            for (Message m : messages) {
                if ("Sent".equals(m.getStatus())) {
                    System.out.println(m.printMessage());

                }
            }
        }
        public static void storeAsText(Message msg) {
            System.out.println("Message stored: " + msg.getMessageID());
        }
    }
