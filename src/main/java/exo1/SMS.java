package exo1;

public class SMS extends Contact{
    public SMS() {
        super(" ", " ");
    }
    public void envoi(ContactService methodeEnvoi,Contact envoyeur, Contact destinataire, String message){
        //on uttilise le num du destinataire et le message que on veut envoyer
        System.out.println("SMS envoyer");
    }
}
