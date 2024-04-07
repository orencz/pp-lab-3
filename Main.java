public class Main { 
    public static void main(String[] args) {
       
        Square square = new Square(9.0); 
        
        System.out.println("P: " + square.calculateArea());
        System.out.println("Obw " + square.calculatePerimeter());
    }
}
