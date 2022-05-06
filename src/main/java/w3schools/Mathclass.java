package w3schools;

public class Mathclass {
    public static void main(String[] args) {
       int result =  Math.round(1.1F);
        System.out.println(result);
        int x = Math.max(1,2); // cel mai mare numar din sir , cu Math.min primesti cel mai mic nr din sir
        System.out.println(x);
        double y = Math.round(Math.random() * 100);
        System.out.println(y);
    }
}
