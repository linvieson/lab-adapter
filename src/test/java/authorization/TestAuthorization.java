package authorization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import db.DataBase;

import static org.junit.jupiter.api.Assertions.*;

class TestAuthorization{
    Authorization auth;
    DataBase db;

    @BeforeEach
    void setUp() {
        db = new DataBase();
        auth = new Authorization();
    }

    @Test
    void testAuthorization() {
        assertTrue(auth.authorize(db));
    }
}