import java.util.ArrayList;

public class Turma {
    private int id;
    private String nome;
    public Professor professor;
    private Aluno[] alunos;
    private int contaAlunos;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Turma(int id, String nome, Professor professor, int numeroAlunos) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        alunos = new Aluno[numeroAlunos];
        this.contaAlunos = 0;
    }
    public void inserirAluno(Aluno aluno) {
        if(contaAlunos < alunos.length) {
            this.alunos[contaAlunos] = aluno;
            contaAlunos++;
        }else{
            System.out.println("Turma lotada");
        }
    }
    public void listarAlunos(){
        System.out.println("Alunos da turma " + nome + ":");
        for (int i = 0; i < contaAlunos; i++){
            System.out.println("- " + alunos[i]);
        }
    }
}
