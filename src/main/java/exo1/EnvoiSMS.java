package exo1;

public class EnvoiSMS extends Contact{
    public EnvoiSMS() {
        super(" ", " ");
    }
    public void envoi(ContactService methodeEnvoi,Contact envoyeur, Contact destinataire, String message){
        //on uttilise le num du destinataire et le message que on veut envoyer
        System.out.println("SMS envoyer");
    }
}
