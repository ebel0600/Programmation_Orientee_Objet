
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Double> entreprise = new ArrayList<>();
        String enonce = "2100, 2150, 2200, 2250, 2300, 2350, 2400, 2450, 2500, 2550, 2600, 2650, 2700, 2750, 2800, 2900, 2950, 2950, 3000, 3000, 3000, 3000, 3100, 3100, 3150, 3150, 3200, 3200, 3250, 3250, 3300, 3300, 3350, 3350, 3400, 3400, 3450, 3500, 3550, 3600, 3650, 3700, 3750, 3800, 3850, 3900, 3900, 3950, 3950, 4000, 4100, 4150, 4200, 4250, 4300, 4350, 4400, 4450, 4500, 4550, 4600, 4650, 4700, 4750, 4800, 4850, 4900, 4950, 5000, 5050, 5100, 5150, 5200, 5250, 5300, 5350, 5400, 5450, 5500, 5500, 5600, 5700, 5800, 5900, 6000, 6100, 6200, 6300, 6400, 6500, 6700, 6900, 7100, 7400, 7700, 8000, 8300, 8700, 9100, 9500";
        String [] lesdonnees = enonce.split(", ");
        double elem;
        
        for (String string : lesdonnees) {
            elem = Double.parseDouble(string);
            entreprise.add(elem);
        }

        Statistiques stats = new Statistiques(entreprise);
        System.out.println(stats);        
    }
}
