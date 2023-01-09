
public class Professor {
    String nome;
    int idade;
    double salario;
    int TempoServico; 
    private int tempoServiço;

    public Professor() {
    }

    public Professor(String nome, int idade, double salario, int TempoServico) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.TempoServico = TempoServico;
    }

    Professor(String leonardo, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getTempoServico() {
        return TempoServico;
    }

    public void setTempoServico(int TempoServico) {
        this.TempoServico = TempoServico;
    }
    public void calcularBonificacao(){
        double bonificacao = 0;
        
        if (tempoServiço >= 2){
            bonificacao = (salario * 12 ) * 0.10;
                    
        }
        System.out.println("A bonificacao é " + bonificacao);
    }
}