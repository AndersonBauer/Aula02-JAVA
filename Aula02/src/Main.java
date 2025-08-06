//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor("Carlos", "carlos@escola.com");
        prof.logar();

        Aluno a1 = new Aluno("João", "joao@email.com");
        Aluno a2 = new Aluno("Maria", "maria@email.com");

        a1.logar();
        a2.logar();

        Turma turma = new Turma(1, "POO", prof, 10);
        turma.inserirAluno(a1);
        turma.inserirAluno(a2);

        turma.listarAlunos();

    }
}