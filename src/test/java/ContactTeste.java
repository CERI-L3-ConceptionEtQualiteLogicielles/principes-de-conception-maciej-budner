
import exo1.*;
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

    @Test
    public void testDeFonctionBuildCantatactQuiCrerNouveauCantact(){
        Contact contact = new Contact("Pierre", "06");

        contact.build("Martin", "06", "Martin", "", "", "", "");

        int nbContact = contact.returnLeNombreDeContactDansNotreRepertoire();
        System.out.println("vous avez "+nbContact+" contact");
    }

    @Test
    public void testDeFormaGetInfoContact(){
        Contact contact = new Contact("Pierre", "06");
        FormaInfoContactJSON json = new FormaInfoContactJSON(contact.getNom(), contact.getNumero());
        FormaInfoCantactXML xml = new FormaInfoCantactXML(contact.getNom(), contact.getNumero());

        System.out.println(contact.getInfoContact());
        System.out.println(json.getInfoContact());
        System.out.println(xml.getInfoContact());

    }

    @Test
    public void testGestionnaireDeContact(){
        GestionnaireDeContacts gestionContact;

        //si je fait new sa plente car il est privet
        //GestionnaireDeContacts gestion = new GestionnaireDeContacts();

    }
}
