package adapter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import twitter.TwitterUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TestTwitterAdapter{
    TwitterUser user;
    TwitterAdapter adapter;

    @BeforeEach
    void setUp() {
        user = new TwitterUser("myemail@gmail.com", "UK", new Date());
        adapter = new TwitterAdapter(user);
    }

    @Test
    void testGetEmail() {
        assertTrue(user.getUserMail().equals(adapter.getEmail()));
    }

    @Test
    void testGetCountry() {
        assertTrue(user.getCountry().equals(adapter.getCountry()));
    }

    @Test
    void testGetTime() {
        assertTrue(user.getLastActiveTime().equals(adapter.getTime()));
    }
}