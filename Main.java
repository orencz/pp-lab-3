public class Main {
    public static void main(String[] args) {
    
        Point center = new Point(0, 0);
        
        Circle circle = new Circle(center, 9); 
        
        System.out.println("Wartosc: x = " + circle.getCenter().getX() + ", y = " + circle.getCenter().getY());
        System.out.println("Promien: " + circle.getRadius());
        System.out.println("Obwod: " + circle.calculatePerimeter());
        System.out.println("Pole powierzchni: " + circle.getArea()); }}
