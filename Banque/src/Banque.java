import java.util.ArrayList;
import java.util.List;

public class Banque {
    private String nomBanque;
    private List<Compte> Comptes;
    private Integer position;

    public Banque(String _nomBanque) {
        this.nomBanque = _nomBanque;
        this.Comptes = new ArrayList<>();
    }

    public void initaliser() {
        this.setNomBanque("Crédit Agricole");
        Compte c1 = new Compte("toto", 1000, -500);
        Compte c2 = new Compte("titi", 2000, -1000);
        Compte c3 = new Compte("dupond", 1500, -1500);
        Compte c4 = new Compte("durand", 1200, -500);
        Compte c5 = new Compte("dubois", -200, -500);
        Compte c6 = new Compte("duval", 750, -2000);
        this.addCompte(c1);
        this.addCompte(c2);
        this.addCompte(c3);
        this.addCompte(c4);
        this.addCompte(c5);
        this.addCompte(c6);
    }

    public Banque() {
        this.nomBanque = "Anonyme";
        this.Comptes = new ArrayList<>();
    }

    public String getNomBanque() {
        return nomBanque;
    }

    public Integer getPosition() {
        return this.position;
    }

    public void setNomBanque(String _nom) {
        nomBanque = _nom;
    }

    public void addCompte(Compte _Compte) {
        this.Comptes.add(_Compte);
    }

    public void addCompte(String _nom, double _solde, double _decouvert) {
        Compte _Compte = new Compte(_nom, _solde, _decouvert);
        this.Comptes.add(_Compte);
    }

    public boolean setCompte(long _num, String _nomProp, double _solde, double _decouvert) {
        for (Compte compte : Comptes) {
            if (_num == compte.getNUMID()) {
                if (compte.setnomProprietaire(_nomProp)) {
                    compte.setSolde(_solde);
                    compte.setDecouvert(_decouvert);
                    return true;
                }
            }
        }
        return false;
    }

    public Compte compteSup() {
        Compte compteMax = Comptes.get(0);
        for (int i = 0; i < Comptes.size(); i++) {
            if (compteMax.getSolde() < Comptes.get(i).getSolde()) {
                compteMax = Comptes.get(i);
            }
        }
        return compteMax;
    }

    public Compte compteInf() {
        Compte compteMin = Comptes.get(0);
        for (int i = 0; i < Comptes.size(); i++) {
            if (compteMin.getSolde() > Comptes.get(i).getSolde()) {
                compteMin = Comptes.get(i);
            }
        }
        return compteMin;
    }

    public Compte rendCompte(long _num) {// , Integer _position){
        for (Compte compte : Comptes) {
            if (_num == compte.getNUMID()) {
                // this.position =Comptes.indexOf(compte);
                // _position = this.position;
                return compte;
            }
        }
        return null;
    }

    public boolean removeCompte(long _num) {
        for (Compte compte : Comptes) {
            if (compte.getNUMID() == _num && compte.getSolde() == 0) {
                Comptes.remove(compte);
                return true;
            }
        }
        return false;
    }

    public boolean transferer(long _numCompteDebit, long _numCompteCredit, double _montant) {
        Compte Comptedebiteur = this.rendCompte(_numCompteDebit);
        Compte CompteCrediteur = this.rendCompte(_numCompteCredit);
        if (Comptedebiteur != null && CompteCrediteur != null)
            return Comptedebiteur.transferer(_montant, CompteCrediteur);
        else
            return false;
    }

    @Override
    public String toString() {
        String res = "Bienvenue à la banque " + nomBanque + "\n";
        for (Compte compte : Comptes) {
            res += compte.toString();// .substring(0,18)+"***** "+compte.toString().substring(31, 36)+"****\n";
        }
        return res;
    }

}
