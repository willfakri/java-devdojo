package academy.devdojo.maratonajava.oo.metodos.exercicio;

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

    public Date getIdade() {
        Date dataAtual = new Date();
        long idadeEmMilissegundos = dataAtual.getTime() - this.dataNascimento.getTime();
        return new Date(idadeEmMilissegundos);
    }

    public void imprimirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.getIdade());
        for (int i = 0; i < this.salarios.length; i++) {
            System.out.println("Salário " + (i+1) + ": R$" + this.salarios[i]);
        }
    }

    public void mediaSalarios() {
        double soma = 0;
        for (double salario : this.salarios) {
            soma += salario;
        }
        double media = soma / this.salarios.length;
        System.out.println("Média Salarial: R$" + media);
    }
}
