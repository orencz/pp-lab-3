public class Main {
    public static void main(String[] args) {
    
        Point center = new Point(0, 0);
        
        ColoredCircle coloredCircle = new ColoredCircle(center, 9, "zielony"); 
        
        System.out.println("Wartosc: x = " + coloredCircle.getCenter().getX() + ", y = " + coloredCircle.getCenter().getY());
        System.out.println("r: " + coloredCircle.getRadius());
        System.out.println("obw: " + coloredCircle.calculatePerimeter());
        System.out.println("P: " + coloredCircle.getArea());
        System.out.println("Kolor: " + coloredCircle.getColor());}}
