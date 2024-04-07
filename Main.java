public class Main {
    public static void main(String[] args) {
    
        Point center = new Point(0, 0);
        
        ColoredCircle coloredCircle = new ColoredCircle(center, 9, "pomarańczowy "); 
        
        System.out.println("Wartość: x = " + coloredCircle.getCenter().getX() + ", y = " + coloredCircle.getCenter().getY());
        System.out.println("Promień: " + coloredCircle.getRadius());
        System.out.println("Obwód: " + coloredCircle.calculatePerimeter());
        System.out.println("Pole: " + coloredCircle.getArea());
        System.out.println("Kolor: " + coloredCircle.getColor());}}
