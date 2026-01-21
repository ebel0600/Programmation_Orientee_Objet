public class Point {

    private double x;
    private double y;

    //Constructors
    public Point() {
        x = 0;
        y = 0;
    }
    public Point(double _X, double _Y){
        x = _X;
        y = _Y;
    }

    //Getters and Setters
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public void setX(double _newVal){
        x = _newVal;
    }
    public void setY(double _newVal){
        y = _newVal;
    }

    //Behaviors
    public void seDeplacer(double _newX, double _newY){
        this.x = _newX;
        this.y = _newY;
    }
    public Point symAbcisse(){
        Point newPoint = new Point(this.getX(), this.getY()*(-1));
        return newPoint;
    }
    public Point symOrdonnee(){
        Point newPoint = new Point(this.getX()*(-1), this.getY());
        return newPoint;
    }
    public Point symOrigine(){
        Point newPoint = new Point(this.getX()*(-1), this.getY()*(-1));
        return newPoint;
    }
    public void permuter(){
        double temp = this.getX();
        this.setX(this.getY());
        this.setY(temp);
    }
    public String toString(){
        return "Ce point a pour coordonnees\n"+this.getX()+" en abcisse\n"+this.getY()+" en ordonnée";
    }

}
