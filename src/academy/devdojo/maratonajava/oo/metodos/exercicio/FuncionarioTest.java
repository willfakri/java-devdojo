package academy.devdojo.maratonajava.oo.metodos.exercicio;

import java.util.Date;

public class FuncionarioTest {

        public static void main(String[] args) {

            Funcionario funcionario = new Funcionario("João", new Date(90, 5, 15), new double[]{3000.0, 3200.0, 3500.0});

            funcionario.imprimirInformacoes();
            funcionario.mediaSalarios();
        }
}
