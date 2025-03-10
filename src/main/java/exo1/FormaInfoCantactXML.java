package exo1;

public class FormaInfoCantactXML extends Contact{

    public FormaInfoCantactXML(String nom, String num) {super(nom,num);}

    public String getInfoContact(){

        return "<contact><nom>" + this.getNom() + "</nom><numero>" + this.getNumero() + "</numero></contact>";
    }
}
