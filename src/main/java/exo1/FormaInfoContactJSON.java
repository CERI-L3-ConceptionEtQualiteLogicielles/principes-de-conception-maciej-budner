package exo1;

public class FormaInfoContactJSON extends Contact{

    public FormaInfoContactJSON(String nom, String num) {super(nom,num);}

    public String getInfoContact(){

        return "{ \"nom\": \"" + this.getNom() + "\", \"numero\": \"" + this.getNumero() + "\" }";
    }
}
