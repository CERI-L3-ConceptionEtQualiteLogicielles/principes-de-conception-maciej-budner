
import exo1.Contact;
import exo1.EnvoiPhoto;
import exo1.EnvoiMail;
import exo1.EnvoiSMS;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    public void testAjoueContactDansLaListe(){
        contactEnvoyeur.ajouteContact(contactDestinataire);
        contactEnvoyeur.afficheContacts();
    }

    @Test
    public void testEnvoieMail(){

        EnvoiMail mail = new EnvoiMail();
        contactEnvoyeur.envoi(mail, contactEnvoyeur, contactDestinataire, "test envoie mail");
    }

    @Test
    public void testEnvoieSMS(){
        EnvoiSMS sms = new EnvoiSMS();
        contactEnvoyeur.envoi(sms, contactEnvoyeur, contactDestinataire, "test envoie sms");
    }

    @Test
    public void testEnvoiePhoto(){
        EnvoiPhoto envoiPhoto = new EnvoiPhoto();
        contactEnvoyeur.envoi(envoiPhoto, contactEnvoyeur, contactDestinataire, "urlphoto");
    }

    @Test
    public void testAjoueAutreInformationContact(){
        Contact contact = new Contact("Pierre", "06");

        contact.addVille("Volle");
        contact.addAddress("Rue du seum");
        contact.addMail("gmail");
        contact.addDateNaissance("11/11/1911");
        contact.addPrenom("Martin");
        System.out.println(contact.toStringPlusInfoContact());
    }
}
