package w3schools;

public class Casting {
    public static void main(String [] args) {
        // implicit casting
        // byte > short > int > long > float > double
        short x = 1;
        int y = x + 2;
        System.out.println(y);
        double a = 1.1;
        double b = x + 2;
        System.out.println(b);
        double c = 1.1;
        int d = (int)c + 2; // explicit casting = can only happen between compatible types
        System.out.println(d);
        String e = "1";
        int f = Integer.parseInt(e) + 2;// integer is the wrapper class for the int primitive type
        System.out.println(f);

       String ab = "1.1"; // grija la ghilimele , in string trebuie sa le pui tot timpul
       double bc = Double.parseDouble(ab) + 2;
        System.out.println(bc);
    }
}
