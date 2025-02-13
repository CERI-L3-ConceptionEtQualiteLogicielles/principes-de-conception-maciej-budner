
import exo1.Contact;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContactTeste {

    @Test
    public void testAfficheContact(){

        Contact contact;
        contact = new Contact("test","06");
        contact.afficheContacts();

    }


}
