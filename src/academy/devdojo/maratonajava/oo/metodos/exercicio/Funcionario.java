package academy.devdojo.maratonajava.oo.metodos.exercicio;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class Funcionario {
    private String nome;
    private LocalDate dataNascimento;
    private BigDecimal[] salarios;

    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal[] salarios) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public BigDecimal[] getSalarios() {
        return salarios;
    }

    public int getIdade() {
        if (this.dataNascimento == null) return 0;
        return Period.between(this.dataNascimento, LocalDate.now()).getYears();
    }

    public void imprimirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.getIdade());

        if(salarios == null || salarios.length == 0) {
            System.out.println("Nenhum salário registrado.");
            return;
        }
        for (int i = 0; i < this.salarios.length; i++) {
            System.out.println("Salário " + (i+1) + ": R$" + this.salarios[i]);
        }
    }

    public void mediaSalarios() {
        if(salarios == null || salarios.length == 0) {
            System.out.println("Nenhum salário registrado.");
            return;
        }
        BigDecimal soma = BigDecimal.valueOf(0.0);
        for (BigDecimal salario : this.salarios) {
            soma.add(salario);
        }
        BigDecimal media = soma.divide(BigDecimal.valueOf(this.salarios.length), 2, java.math.RoundingMode.HALF_UP);        System.out.println("Média Salarial: R$" + media);
    }
}
