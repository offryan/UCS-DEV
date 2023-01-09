
public class AlunoPresencial extends Aluno { 
    
    private int QtdDiasAulas;
    private String periodo;

    public AlunoPresencial() {
    }

    public AlunoPresencial(int QtdDiasAulas, String periodo) {
        this.QtdDiasAulas = QtdDiasAulas;
        this.periodo = periodo;
    }

    public int getQtdDiasAulas() {
        return QtdDiasAulas;
    }

    public void setQtdDiasAulas(int QtdDiasAulas) {
        this.QtdDiasAulas = QtdDiasAulas;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
}

    

    