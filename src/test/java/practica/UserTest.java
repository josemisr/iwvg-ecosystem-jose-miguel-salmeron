package practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;

    @BeforeEach
    void before() {
        this.user = new User(1, "GEMMA","URBANOS");
    }

    @Test
    void testFullName() {
        assertEquals("Gemma Urbanos", this.user.fullName());
    }

    @Test
    void testInitials() {
        assertEquals("G.", this.user.initials());
    }

    @Test
    void testGetNumber() {
        assertEquals(1, this.user.getNumber());
    }

    @Test
    void testGetName() {
        assertEquals("Gemma", this.user.getName());
    }

    @Test
    void testGetFamilyName() {
        assertEquals("Urbanos", this.user.getFamilyName());
    }

    @Test
    void testUpperFullName() {
        assertEquals("GEMMA URBANOS", this.user.getUpperFullName());
    }
}