package exo1;

//cette classe va nous permetre de uttiliser la class ServiceEnvoiPhoto
public class EnvoiPhoto extends Contact{

    public EnvoiPhoto() {
        super(" ", " ");
    }
    
    //suposant que message soit un String qui est l'url de notre image
    public void envoi(ContactService methodeEnvoi,Contact envoyeur, Contact destinataire, String message){
        ServiceEnvoiPhoto serviceEnvoiPhoto = new ServiceEnvoiPhoto();
        serviceEnvoiPhoto.envoiPhoto(destinataire, message);
        System.out.println("Photo envoyer");
    }
}
