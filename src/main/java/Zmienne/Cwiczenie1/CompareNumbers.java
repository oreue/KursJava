package Zmienne.Cwiczenie1;

import java.util.Random;

public class CompareNumbers {

    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(100);
        int y = rand.nextInt(100);

        System.out.println("x=" + x + ", y=" + y);

        // Czy x jest większe od y?
        boolean result = x > y;
        System.out.println("x > y =  " + result);

        // Czy x pomnożone przez 2 jest większe od y?
        result = x * 2 > y;
        System.out.println("x*2 > y =  " + result);

        // Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o
        // 2?
        result = (y < x + 3) && (y > x - 2);
        System.out.println("(y < x+3) && (y > x-2) = " + result);

        // Czy iloczyn liczb x i y jest parzysty? (Wykorzystaj do sprawdzenia operację
        // modulo)
        result = ((x * y) % 2 == 0);
        System.out.println("Czy x*y jest parzyste? " + result);
    }

}