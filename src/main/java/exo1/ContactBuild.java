package exo1;

public class ContactBuild{
    //pas sur comment uttiliser la liste mais faut qu'il a les meme attribue que contact
    //private List<Contact> lesContact = new ArrayList<>();
    private String numero;
    private String firstName;
    private String nom;
    private String address;
    private String ville;
    private String mail;
    private String dateNaissance;

    public ContactBuild(){

        this.nom ="";
        this.numero = "";
        this.firstName = "";
        this.address = "";
        this.ville = "";
        this.mail = "";
        this.dateNaissance = "";
    }

    public ContactBuild addNumero(String numero){
        this.numero = numero;
        return this;
    }
    public ContactBuild addNom(String nom){
        this.nom = nom;
        return this;
    }
    public ContactBuild addPrenom(String prenom){
        this.firstName = prenom;
        return this;
    }
    public ContactBuild addVille(String ville){
        this.ville = ville;
        return this;
    }
    public ContactBuild addMail(String mail){
        this.mail = mail;
        return this;
    }
    public ContactBuild addAddress(String address){
        this.address = address;
        return this;
    }
    public ContactBuild addDateNaissance(String dateNaissance){
        this.dateNaissance = dateNaissance;
        return this;
    }

    public String toString(){
        return "Numero:"+this.numero+" Nom:"+this.nom+" prenom:"+this.firstName+" ville:"+this.ville+" address:"+this.address+" mail:"+this.mail+" dateNaissance:"+this.dateNaissance;
    }

    public Contact build(String nom, String numero,String prenom, String ville, String mail, String dateNaissance, String address) {
        Contact contact = new Contact(nom, numero);
        this.nom = nom;
        this.numero = numero;
        this.firstName = prenom;
        this.ville = ville;
        this.mail = mail;
        this.dateNaissance = dateNaissance;
        this.address = address;
        contact.setAutreInfoContact(this);
        return contact;
    }
}
