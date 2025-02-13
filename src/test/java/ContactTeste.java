
import exo1.Contact;
import exo1.Mail;
import exo1.SMS;
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

    @Test
    public void testEnvoieMail(){
        Contact contactEnvoyeur, contactDestinataire;
        contactEnvoyeur = new Contact("testMail", "06");
        contactDestinataire = new Contact("destinataire", "07");

        Mail mail = new Mail();
        contactEnvoyeur.envoi(mail, contactEnvoyeur, contactDestinataire, "test envoie mail");
    }


}
