public class Medico {
    private int CRM;
    private String nome;
    private String especialidade;

    public Medico(int CRM, String nome, String especialidade) {
        this.CRM = CRM;
        this.nome = nome;
        this.especialidade = especialidade;
    }
//setters
    public void setCRM(int CRM){
        this.CRM = CRM;
    }

    
    public void setNome(String nome){
        this.nome = nome;
    }

    
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
//getters
    public int getCRM() {
        return this.CRM;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public String toString() {
        return "CRM: " + this.CRM + ", Nome: " + this.nome + ", Especialidade: " + this.especialidade;
    }

}