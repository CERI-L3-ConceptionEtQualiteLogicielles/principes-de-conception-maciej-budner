package exo1;

import java.util.ArrayList;
import java.util.List;


public class Contact implements ContactService {
    private List<Contact> lesContacts = new ArrayList<>();
    private static ContactBuild autreInfoContact = new ContactBuild();
    private String nom;
    private String numero;

    public Contact(String nom, String numero) {
        this.nom = nom;
        this.numero = numero;
        this.addNom(nom);
        this.addNumero(numero);
        lesContacts.add(this);
    }

    public String getNom() {
        return nom;
    }

    public String getNumero() {
        return numero;
    }

    public String getInfoContact() {
        return "Nom: " + this.getNom() + ", Numéro: " + this.getNumero();
    }

    public void ajouteContact(Contact contact) {
        lesContacts.add(contact);
    }

    public void supprimeContact(Contact contact) {
        lesContacts.remove(contact);
    }

    public void afficheContacts() {
        for (Contact contact : lesContacts) {
            System.out.println(contact);
        }
    }

    @Override
    public void envoi(ContactService methodeEnvoi,Contact envoyeur, Contact destinataire, String message) {
        //mais fait rien, elle est ici car faut respecter le cahier de charge
        methodeEnvoi.envoi(methodeEnvoi,envoyeur,destinataire,message);
    }

    public void sauvegardeEnBD() {
        // Logique pour sauvegarder les contacts dans une base de données
    }

    /* single service, contact s'occupe pas de ça
    public void envoiEmail(Contact contact, String message) {

        //maintenant on peut envoyer un mail
        //fonctionEnvoieMail(Envoyeur, destinataire, objet, message);
    }
    */
    @Override
    public String toString() {
        return "Nom: " + this.getNom() + ", Numéro: " + this.getNumero();
    }


    //je suis obliger de mettre tout les add
    public void addNumero(String numero){
        this.autreInfoContact = this.autreInfoContact.addNumero(numero);

    }
    public void addNom(String nom){
        this.autreInfoContact = this.autreInfoContact.addNom(nom);
    }
    public void addPrenom(String prenom){
        this.autreInfoContact = this.autreInfoContact.addPrenom(prenom);
    }
    public void addVille(String ville){
        this.autreInfoContact = this.autreInfoContact.addVille(ville);
    }
    public void addMail(String mail){
        this.autreInfoContact = this.autreInfoContact.addMail(mail);
    }
    public void addAddress(String address){
        this.autreInfoContact = this.autreInfoContact.addAddress(address);
    }
    public void addDateNaissance(String dateNaissance){
        this.autreInfoContact = this.autreInfoContact.addDateNaissance(dateNaissance);
    }

    public static void setAutreInfoContact(ContactBuild autreInfoContact) {
        Contact.autreInfoContact = autreInfoContact;
    }

    public String toStringPlusInfoContact(){
        return this.autreInfoContact.toString();
    }

    public void  build(String nom, String numero,String prenom, String ville, String mail, String dateNaissance, String address){
        this.ajouteContact(this.autreInfoContact.build(nom, numero,prenom,ville, mail, dateNaissance, address));
    }

    public int returnLeNombreDeContactDansNotreRepertoire(){
        return this.lesContacts.size();
    }
}

