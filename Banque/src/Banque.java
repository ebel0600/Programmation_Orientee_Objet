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

    public void addCompte(String _nom, double _solde, double _decouvert){
        Compte _Compte = new Compte(_nom,_solde,_decouvert);
        this.Comptes.add(_Compte);
    }

    public boolean setCompte(long _num, String _nomProp, double _solde, double _decouvert){
        for (Compte compte : Comptes) {
            if(_num == compte.getNUMID()){
                if(compte.setnomProprietaire(_nomProp)){
                    compte.setSolde(_solde);
                    compte.setDecouvert(_decouvert);
                    return true;
                }
            }
        }
        return false;
    }

    public Compte compteSup(){
        Compte res= new Compte();
        for (Compte compte : Comptes) {
            if(compte.getSolde()>res.getSolde()){
                res = compte;
            }
        }
        return res;
    }

    public Compte rendCompte(long _num){
        for (Compte compte : Comptes) {
            if(_num == compte.getNUMID()){
                return compte;
            }
        }
        return null;
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
    
    public boolean transferer(long _numCompte, long _numAutreCompte, double _montant){
        for (Compte compte : Comptes) {
            if(_numCompte==compte.getNUMID())
                for (Compte compte2 : Comptes) {
                    if(_numAutreCompte==compte2.getNUMID())
                        return compte.transferer(_montant, compte2);
                }
        }
        return false;
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
