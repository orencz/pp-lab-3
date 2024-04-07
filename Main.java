public class Main {
    public static void main(String[] args) {
    
        Point center = new Point(0, 0);
        
        Circle circle = new Circle(center, 9); 
        
        System.out.println("Centrum: x = " + circle.getCenter().getX() + ", y = " + circle.getCenter().getY());
        System.out.println("Promień: " + circle.getRadius());
        System.out.println("Obwód: " + circle.calculatePerimeter());
        System.out.println("Pole powierzchni: " + circle.getArea()); }}
