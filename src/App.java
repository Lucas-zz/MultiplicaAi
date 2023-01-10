import java.util.*;

public class App {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Insira um número: ");
            int num = sc.nextInt();

            System.out.println("Tabela de multiplicação de " + num);

            for (int i = 1; i <= 10; i++) {
                String strFormatada = String.format("%d x %d: %d", num, i, num * i);
                System.out.println(strFormatada);
            }
        }
    }
}
