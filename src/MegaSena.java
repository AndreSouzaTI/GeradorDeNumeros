//import java.util.Random;
//
//public class MegaSena {
//    public static void main(String[] args) {
//        Random generate = new Random();
//
//        int i = 0;
//        while(i < 6) {
//            int number = generate.nextInt(60);
//            System.out.println(number);
//            i++;
//        }
//    }
//}

import java.util.Random;
import java.util.HashSet;
import java.util.Set;

public class MegaSena {
    public static void main(String[] args) {
        Random generate = new Random();
        Set<Integer> numeros = new HashSet<>();

        while(numeros.size() < 6) {
            int number = generate.nextInt(61) + 1;
            numeros.add(number);
        }

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
