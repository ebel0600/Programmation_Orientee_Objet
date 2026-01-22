public class Point {

    private double x;
    private double y;

    // Constructors
    public Point() {
        x = 0;
        y = 0;
    }

    public Point(double _X, double _Y) {
        x = _X;
        y = _Y;
    }

    // Getters and Setters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double _newVal) {
        x = _newVal;
    }

    public void setY(double _newVal) {
        y = _newVal;
    }

    // Behaviors
    public void seDeplacer(double _newX, double _newY) {
        this.x += _newX;
        this.y += _newY;
    }

    public Point symAbcisse() {
        Point newPoint = new Point(this.x, -this.y);
        return newPoint;
    }

    public Point symOrdonnee() {
        Point newPoint = new Point(-this.x, this.y);
        return newPoint;
    }

    public Point symOrigine() {
        Point newPoint = new Point(-this.x, -this.y);
        return newPoint;
    }

    public void permuter() {
        double temp = this.getX();
        this.setX(this.getY());
        this.setY(temp);
    }

    public double calculSegment(Point _autrePoint){
        double res = Math.pow((_autrePoint.getX()-this.x),2)+ Math.pow((_autrePoint.getY()-this.y), 2);
        // res = Math.sqrt(res);
        return res;
    }

    public String toString() {
        return "Ce point a pour coordonnées\n" + this.x + " en abcisse\n" + this.y + " en ordonnée";
    }

}
