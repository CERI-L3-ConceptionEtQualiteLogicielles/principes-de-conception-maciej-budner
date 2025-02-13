package exo1;

public interface ContactService {
    void ajouteContact(Contact contact);
    void supprimeContact(Contact contact);
    //void envoiEmail(Contact contact, String message);//c'est pas contact qui s'occupe mais il a une methode envoie

    void afficheContacts();

    void envoi(ContactService methodeEnvoi,Contact envoyeur, Contact destinataire, String message);
    //void envoiSMS(Contact contact, String massege);
}