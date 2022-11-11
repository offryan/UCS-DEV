

public class Faculdade {
    private String nome;
    private String CNPJ;
    private Professor professor;
    private AlunoPresencial alunoPresencial;

    public Faculdade() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public AlunoPresencial getAlunoPresencial() {
        return alunoPresencial;
    }

    public void setAlunoPresencial(AlunoPresencial alunoPresencial) {
        this.alunoPresencial = alunoPresencial;
    }
    
    

public static void main (String[] args){

Faculdade unicsul = new Faculdade ();
unicsul.setNome("Universidade Cruzeiro do Sul");
unicsul.setCNPJ("123122/0001-10");
AlunoPresencial maria = new AlunoPresencial(20, "Manhã");
unicsul.setAlunoPresencial(maria);

Professor professor = new Professor ("Leonardo", 18, 200, 5);
unicsul.setProfessor(professor);

unicsul.getProfessor().calcularBonificacao();


    









