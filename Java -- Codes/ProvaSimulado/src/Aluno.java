
public abstract class Aluno {
    private String Nome;
    private String Rgm;
    private int Idade;
    private int CPF;

    public Aluno() {
    } 

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getRgm() {
        return Rgm;
    }

    public void setRgm(String Rgm) {
        this.Rgm = Rgm;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }
}


    