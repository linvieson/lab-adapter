package adapter;

import facebook.FacebookUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TestFacebookAdapter{
    FacebookUser user;
    FacebookAdapter adapter;

    @BeforeEach
    void setUp() {
        user = new FacebookUser("myemail@gmail.com", "UK", new Date());
        adapter = new FacebookAdapter(user);
    }

    @Test
    void testGetEmail() {
        assertTrue(user.getEmail().equals(adapter.getEmail()));
    }

    @Test
    void testGetCountry() {
        assertTrue(user.getUserCountry().equals(adapter.getCountry()));
    }

    @Test
    void testGetTime() {
        assertTrue(user.getUserActiveTime().equals(adapter.getTime()));
    }
}