public abstract class Funcionario {

    private String nome;
    private String cpf;
    private double salario;

    public abstract double getBonificacao();

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }



}
