public class Paciente {
    private int codigo;
    private String nome;

    public Paciente(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
//setters
    public void setCodigo (int codigo){
        this.codigo = codigo;
    } 
    public void setNome (String nome){
        this.nome = nome;
    }
//getters
    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome;
    }
}
