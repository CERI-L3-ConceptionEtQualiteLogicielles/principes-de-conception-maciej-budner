package exo1;

public class ServiceEnvoieContact {

    //envoie un SMS ou Mail selon la methode
    public void envoiMessage(Object methodeEnvoi, Contact envoyeur, Contact destinataire, String message) {

        envoi(methodeEnvoi, envoyeur, destinataire, message);
    }

    public void envoi(Mail mail , Contact envoyeur, Contact destinataire, String message) {
        //on fait se qui faut pour envoyer un mail
        /* envoyeur.getNom(), destinataire.getNom(), envoyeur.getNom() + " vous envoie un mail", message
            et on fait la function envoie mail
         */
    }

    public void envoi(SMS sms , Contact envoyeur, Contact destinataire, String message) {
        //pour envoyer un sms on a besoin du num du destinataire, et du message
        /* destinataire.getNumero(), message
            et on fait la function envoie SMS
         */
    }
}
