import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String continuar;
        do {
            System.out.println("Escolha uma operação");
            System.out.println("1. Soma (+)");
            System.out.println("2. Subtração (-)");
            System.out.println("3. Multiplicação (*)");
            System.out.println("4. Divisão (/)");
            System.out.println("Digite o número correspondente à operação desejada:");

            int opcao = sc.nextInt();

            System.out.println("Digite o primeiro numero:");
            double n1 = sc.nextDouble();

            System.out.println("Digite o segundo numero:");
            double n2 = sc.nextDouble();


            double resultado = 0;
            boolean operacaoValida = true;


            switch (opcao) {
                case 1:
                    resultado = n1 + n2;
                    break;
                case 2:
                    resultado = n1 - n2;
                    break;
                case 3:
                    resultado = n1 * n2;
                    break;
                case 4:
                    if (n2 != 0) {
                        resultado = n1 / n2;
                    } else {
                        System.out.println("ERRO: Divisão por zero não é permitido");
                        operacaoValida = false;
                    }
                    break;
                default:
                    System.out.println("Operador inválido.");
                    operacaoValida = false;

            }
            if (operacaoValida) {
                System.out.println("O resultado é: " + resultado);
            }

            System.out.println("Deseja realizar outro cálculo (s/n):");
            continuar = sc.next();


        } while (continuar.equalsIgnoreCase("s"));
        System.out.println("Encerrando o programa. Até a próxima!");
        sc.close();
    }
}