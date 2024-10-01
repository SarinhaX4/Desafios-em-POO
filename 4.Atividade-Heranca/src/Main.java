
class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Matrícula: " + matricula);
    }
}

class Professor extends Pessoa {
    private double salario;

    public Professor(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Salário: " + salario);
    }
}

class Heranca {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Sara", 19, "2024S@SARA");
        Professor professor = new Professor("Victor", 30, 7000.00);

        System.out.println("Informações do Aluno:");
        aluno.exibirInfo();

        System.out.println("\nInformações do Professor:");
        professor.exibirInfo();
    }
}
