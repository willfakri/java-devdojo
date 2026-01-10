package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

/**
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data <data>
 */
public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
