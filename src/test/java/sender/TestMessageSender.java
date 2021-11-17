package sender;

import adapter.FacebookAdapter;
import adapter.TwitterAdapter;
import facebook.FacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twitter.TwitterUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMessageSender {
    MessageSender messageSender;
    FacebookAdapter facebookAdapter;
    FacebookAdapter falseUser;
    TwitterAdapter twitterAdapter;

    @BeforeEach
    void setUp() {
        facebookAdapter = new FacebookAdapter(new FacebookUser("notemail@gmail.com", "China", new Date()));
        twitterAdapter = new TwitterAdapter(new TwitterUser("myemail@gmail.com", "UK", new Date()));
        falseUser = new FacebookAdapter(new FacebookUser("notemail@gmail.com", "China", null));
        messageSender = new MessageSender();
    }

    @Test
    void testSender() {
        assertTrue(messageSender.send("Hello from UK!", twitterAdapter, "UK"));
        assertFalse(messageSender.send("Hello from China!", facebookAdapter, "Ukraine"));
        assertFalse(messageSender.send("Hello!", falseUser, "Ukraine"));

    }
}
