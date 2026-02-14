package academy.devdojo.maratonajava.oo.metodos.exercicio;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FuncionarioTest {

        public static void main(String[] args) {

            Funcionario[] funcionarios = new Funcionario[]{
                    new Funcionario("Peteco Salarios", LocalDate.of(1995, 5, 15), new BigDecimal[]{BigDecimal.valueOf(3000.0), BigDecimal.valueOf(3200.0), BigDecimal.valueOf(3500.0)}),
                    new Funcionario("Simba Zero", LocalDate.of(1990, 3, 1), new BigDecimal[]{}),
                    new Funcionario("Smeagol Nulo", LocalDate.of(1982, 11, 24), null)
            };

            for (Funcionario funcionario : funcionarios) {
                funcionario.imprimirInformacoes();
                funcionario.mediaSalarios();
                System.out.println("-----------------------------");
            }
        }
}
