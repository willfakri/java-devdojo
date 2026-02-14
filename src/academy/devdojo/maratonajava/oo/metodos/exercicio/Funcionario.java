package academy.devdojo.maratonajava.oo.metodos.exercicio;

import java.util.Calendar;
import java.util.Date;

public class Funcionario {
    private String nome;
    private Date dataNascimento;
    private double[] salarios;

    public Funcionario(String nome, Date dataNascimento, double[] salarios) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public int getIdade() {
        if (this.dataNascimento == null) {
            return 0;
        }
        Calendar nascimento = Calendar.getInstance();
        nascimento.setTime(this.dataNascimento);
        Calendar hoje = Calendar.getInstance();

        int idade = hoje.get(Calendar.YEAR) - nascimento.get(Calendar.YEAR);

        // Ajusta se ainda não fez aniversário este ano
        if (hoje.get(Calendar.MONTH) < nascimento.get(Calendar.MONTH)
                || (hoje.get(Calendar.MONTH) == nascimento.get(Calendar.MONTH)
                && hoje.get(Calendar.DAY_OF_MONTH) < nascimento.get(Calendar.DAY_OF_MONTH))) {
            idade--;
        }
        return idade;
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
        double soma = 0;
        for (double salario : this.salarios) {
            soma += salario;
        }
        double media = soma / this.salarios.length;
        System.out.println("Média Salarial: R$" + media);
    }
}
