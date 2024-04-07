public class Main {
    public static void main(String[] args) {
    
        Point center = new Point(0, 0);
        
        ColoredCircle coloredCircle = new ColoredCircle(center, 9, "zielony"); 
        
        System.out.println("Wartosc: x = " + coloredCircle.getCenter().getX() + ", y = " + coloredCircle.getCenter().getY());
        System.out.println("Promien: " + coloredCircle.getRadius());
        System.out.println("Obwod: " + coloredCircle.calculatePerimeter());
        System.out.println("Pole: " + coloredCircle.getArea());
        System.out.println("Kolor: " + coloredCircle.getColor());}}
