package exo1;

public class GestionnaireDeContacts {


    private static GestionnaireDeContacts gestionContact = new GestionnaireDeContacts();

    private GestionnaireDeContacts(){

    }

    public static GestionnaireDeContacts getGestionContact() {
        return gestionContact;
    }


}
