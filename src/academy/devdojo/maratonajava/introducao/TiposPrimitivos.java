package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

/**
 * Prática
 * <p>
 * Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
 * <p>
 * Eu <nome>, morando no endereço <endereço>,
 * confirmo que recebi o salário de <salario>, na data <data>
 */
public class TiposPrimitivos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia da semana (1 a 7):");
        int diaSemana = Integer.parseInt(scanner.nextLine());

        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }


        System.out.println("Digite seu nome:");
        var nome = scanner.nextLine();

        System.out.println("Digite seu endereço:");
        var endereco = scanner.nextLine();

        System.out.println("Digite seu salário:");
        var salario = Double.parseDouble(scanner.nextLine());

        System.out.println("Digite a data:");
        var data = scanner.nextLine();

        var mensagem = String.format("Eu %s, morando no endereço %s,\n" +
                "confirmo que recebi o salário de R$%.2f, na data %s.", nome, endereco, salario, data);

        System.out.println(mensagem);
    }
}
