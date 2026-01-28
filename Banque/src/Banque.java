import java.util.ArrayList;
import java.util.List;

public class Banque {
    private String nomBanque;
    private List<Compte> Comptes;

    public Banque(String _nomBanque){
        this.nomBanque = _nomBanque;
        this.Comptes = new ArrayList<>();
    }

    public Banque(){
        this.nomBanque = "Anonyme";
        this.Comptes = new ArrayList<>();
    }

    public String getNomBanque(){
        return nomBanque;
    }

    public void setNomBanque(String _nom){
        nomBanque = _nom;
    }

    public void addCompte(Compte _Compte){
        this.Comptes.add(_Compte);
    }

    public void removeCompte(Compte _Compte){
        for (Compte compte : Comptes) {
            if(compte.getNUMID()==_Compte.getNUMID())
            {
                Comptes.remove(compte);
                break;
            }
        }
    }

    @Override
    public String toString(){
        String res = "Bienvenue à la banque "+nomBanque+"\n";
        for (Compte compte : Comptes) {
            res+=compte.toString();
        }
        return res;
    }


}
