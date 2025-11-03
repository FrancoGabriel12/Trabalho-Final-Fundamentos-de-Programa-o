public class Consulta {
    private int nro;
    private Data data;
    private Medico medico;
    private Paciente paciente;
    private double valor;

    public Consulta(int nro, Data data, Medico medico, Paciente paciente, double valor) {
        this.nro = nro;
        this.data = data;
        this.medico = medico;
        this.paciente = paciente;
        this.valor = valor;
    }
//setters
     public void setNro(int nro) {
        this.nro = nro;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
 //getters
    public int getNro() {
        return this.nro;
    }

    public Data getData() {
        return this.data;
    }

    public Medico getMedico() {
        return this.medico;
    }

    public Paciente getPaciente() {
        return this.paciente;
    }

    public double getValor() {
        return this.valor;
    }

    public String toString(){
         return "Número: " + this.nro + "Data: " + this.data + "Médico " + this.medico + "Paciente: " + this.paciente + "Valor: " + this.valor;
    }
}
