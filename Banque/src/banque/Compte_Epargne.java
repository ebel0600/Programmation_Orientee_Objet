package banque;
public class Compte_Epargne extends Compte {

    private double taux;

    public Compte_Epargne(String _nomProp, double _solde, double _taux) {
        super(_nomProp, _solde, 0);
        taux = _taux;
    }

    public Compte_Epargne() {
        taux = 0;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double _taux) {
        taux = _taux;
    }

    public void calculerInterets(double[] _tabMontants) {
        double res = 0;
        for (double d : _tabMontants) {
            res += ((d * (this.taux / 100)) / 24);
        }
        this.crediter(res);
    }

    @Override
    public String toString() {
        return super.toString().substring(0, super.toString().length() - 2) + ". Taux d'intérêt : " + taux + "%.";
    }

}
