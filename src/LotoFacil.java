import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LotoFacil {
    public static void main(String[] args) {
        Random generate = new Random();
        Set<Integer> numeros = new HashSet<>();

        while (numeros.size() < 15) {
            int number = generate.nextInt(26);
            numeros.add(number);
        }

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}

