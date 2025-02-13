package exo1;

public class Mail extends Contact{
    public Mail() {
        super(" ", " ");
    }

    public void envoi(ContactService methodeEnvoi, Contact envoyeur, Contact destinataire, String message){
        //on uttilise le num du destinataire et le message que on veut envoyer
        System.out.println("mail envoyer");
    }
}
