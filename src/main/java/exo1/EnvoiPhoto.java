package exo1;

//cette classe va nous permetre de uttiliser la class ServiceEnvoiPhoto
public class EnvoiPhoto extends ServiceEnvoiPhoto{

    //suposant que message soit un String qui est l'url de notre image
    public void envoi(ContactService methodeEnvoi,Contact envoyeur, Contact destinataire, String message){
        this.envoiPhoto(destinataire, message);
    }
}
