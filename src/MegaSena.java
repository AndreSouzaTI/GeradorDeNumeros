import java.util.Random;
import java.util.HashSet;
import java.util.Set;

public class MegaSena {
    public static void main(String[] args) {
        // Inicializa um objeto Random para gerar números aleatórios
        Random generate = new Random();
        // Cria um conjunto para armazenar os números gerados
        Set<Integer> numeros = new HashSet<>();

        // Gera números únicos até alcançar 6 números
        while(numeros.size() < 6) {
            // Gera um número aleatório entre 1 e 60
            int number = generate.nextInt(60) + 1;
            // Adiciona o número ao conjunto
            numeros.add(number);
        }

        // Exibe os números gerados
        System.out.println("Números da Mega Sena:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
