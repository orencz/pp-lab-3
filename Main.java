import geometry.Point;
import geometry.Circle;
import geometry.ColoredCircle;

public class Main {
    public static void main(String[] args) {

        Circle[] circles = new Circle[3];
        
        circles[0] = new Circle(new Point(5, 5), 6); 
        circles[1] = new ColoredCircle(new Point(6, 6), 7, "Zielony");
        circles[2] = new Circle(new Point(7, 7), 8); 

        
        for (Circle circle : circles) {
            System.out.println("Pole powierzchni kola: " + circle.getArea());}}}
