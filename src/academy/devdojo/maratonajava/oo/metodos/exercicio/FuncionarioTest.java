package academy.devdojo.maratonajava.oo.metodos.exercicio;

import java.util.Date;

public class FuncionarioTest {

        public static void main(String[] args) {

            Funcionario[] funcionarios = new Funcionario[]{
                    new Funcionario("Peteco Salarios", new Date(95, 5, 15), new double[]{3000.0, 3200.0, 3500.0}),
                    new Funcionario("Simba Zero", new Date(90, 3, 1), new double[]{}),
                    new Funcionario("Smeagol Nulo", new Date(82, 11, 24), null)
            };

            for (Funcionario funcionario : funcionarios) {
                funcionario.imprimirInformacoes();
                funcionario.mediaSalarios();
                System.out.println("-----------------------------");
            }
        }
}
