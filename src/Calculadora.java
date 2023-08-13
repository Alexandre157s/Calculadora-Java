import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textoInicial =
                """
                \nPara prosseguir digite a operação matemática desejada:
                1- Soma(+)
                2- Subtração(-)
                3- Divisão(/)
                4- Multiplicação(*)
                """;
        int x=0;

        while(x==0){
            System.out.println(textoInicial);
            double opcapInicial;
            opcapInicial = scanner.nextDouble();

            if (opcapInicial==1){
                System.out.println("Digete o primeiro valor a ser somado :");
                double primeiroValorSoma;
                primeiroValorSoma = scanner.nextDouble();
                System.out.println("Digete o segundo valor a ser somado :");
                double segundoValorSoma;
                segundoValorSoma = scanner.nextDouble();
                System.out.println("O valor da soma é : " + (primeiroValorSoma+segundoValorSoma));
            }
            else if (opcapInicial==2){
                System.out.println("Digete o primeiro valor a ser subtraido :");
                double primeiroValorSub;
                primeiroValorSub = scanner.nextDouble();
                System.out.println("Digete o segundo valor a ser subtraido :");
                double segundoValorSub;
                segundoValorSub = scanner.nextDouble();
                System.out.println("O valor da subtração é : " + (primeiroValorSub-segundoValorSub));
            }
            else if (opcapInicial==3){
                System.out.println("Digete o primeiro valor a ser dividido :");
                double primeiroValorDiv;
                primeiroValorDiv = scanner.nextDouble();
                System.out.println("Digete o segundo valor a ser somado :");
                double segundoValorDiv;
                segundoValorDiv = scanner.nextDouble();
                System.out.println("O valor da divisão é : " + (primeiroValorDiv/segundoValorDiv));
            }
            else if (opcapInicial==4){
                System.out.println("Digete o primeiro valor a ser multiplicado :");
                double primeiroValorMult;
                primeiroValorMult = scanner.nextDouble();
                System.out.println("Digete o segundo valor a ser multiplicado :");
                double segundoValorMult;
                segundoValorMult = scanner.nextDouble();
                System.out.println("O valor da multiplicação é : " + (primeiroValorMult*segundoValorMult));
            }
            else if (opcapInicial<0){
                System.out.println("\nEstá opção não é válida, por favor tente novamente");
            }
            else if (opcapInicial>4){
                System.out.println("\nEstá opção não é válida, por favor tente novamente");
            }
            else {
                break;
            }
        }
    }
}