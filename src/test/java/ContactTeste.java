
import exo1.Contact;
import exo1.EnvoiPhoto;
import exo1.Mail;
import exo1.SMS;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContactTeste {
    Contact contactEnvoyeur, contactDestinataire;

    @BeforeEach
    void setUp(){

        contactEnvoyeur = new Contact("testMail", "06");
        contactDestinataire = new Contact("destinataire", "07");
    }

    @Test
    public void testAfficheContact(){

        contactEnvoyeur.afficheContacts();
    }

    @Test
    public void testEnvoieMail(){

        Mail mail = new Mail();
        contactEnvoyeur.envoi(mail, contactEnvoyeur, contactDestinataire, "test envoie mail");
    }

    @Test
    public void testEnvoieSMS(){
        SMS sms = new SMS();
        contactEnvoyeur.envoi(sms, contactEnvoyeur, contactDestinataire, "test envoie sms");
    }

    @Test
    public void testEnvoiePhoto(){
        EnvoiPhoto envoiPhoto = new EnvoiPhoto();
        contactEnvoyeur.envoi(envoiPhoto, contactEnvoyeur, contactDestinataire, "urlphoto");
    }
}
