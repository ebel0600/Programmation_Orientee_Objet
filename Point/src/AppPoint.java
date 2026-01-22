
import java.util.Scanner;

public class AppPoint {
    public static void main(String[] args) throws Exception {
        Scanner entree = new Scanner(System.in);

        //test constructeurs
        Point unPoint = new Point();
        //System.out.println(unPoint.toString());
        //Point unPoint2 = new Point(5, 7);
        //System.out.println(unPoint2.toString());

        //test setters / getters
        double x;
        double y;
        System.out.println("Veuillez entrer les coordonnées du point");
        x = entree.nextDouble();
        y = entree.nextDouble();
        entree.nextLine();
        unPoint.setX(x);
        unPoint.setY(y);
        System.out.println("Présentation à deux phases :\nAvec getX et getY "+unPoint.getX()+" en abcisse et "+ unPoint.getY() +" en ordonnee puis (toString)\n"+  unPoint.toString());

        //test comportements
        System.out.println("Ou souhaitez vous déplacer votre point ? (abcisse puis ordonnee)");
        x = entree.nextDouble();
        y = entree.nextDouble();
        entree.close();

        unPoint.seDeplacer(x, y);
        System.out.println("Test de la fonction \"se déplacer\" :\n"+unPoint.toString());
        System.out.println("------------");

        Point symX = unPoint.symAbcisse();
        System.out.println("Symétrie axiale à l'abcisse :\n" + symX.toString());
        System.out.println("------------");

        Point symY = unPoint.symOrdonnee();
        System.out.println("Symétrie axiale à l'ordonnee :\n" + symY.toString());
        System.out.println("------------");

        Point symCent = unPoint.symOrigine();
        System.out.println("Symétrie centrale :\n" + symCent.toString());
        System.out.println("------------");

        unPoint.permuter();
        System.out.println("Test de permutation :\n"+unPoint.toString());
        System.out.println("------------\nProgramme terminé !");


    }
}
