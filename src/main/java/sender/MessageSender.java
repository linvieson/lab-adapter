package sender;

import user.User;

public class MessageSender {
    public boolean send(String text, User user, String country) {
        if (user.getTime() != null && country.equals(user.getCountry())) {
            System.out.println("Message <<" + text + ">> was sent to" + user + ", " + country + ".");
            return true;
        } else {
            System.out.println("Failed to send a message.");
            return false;
        }
    }
}
