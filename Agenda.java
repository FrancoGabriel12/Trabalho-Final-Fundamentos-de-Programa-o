public class Agenda {
    private Consulta[] consultas;

    public Agenda() {
        this.consultas = new Consulta[40];
    }

    public Consulta[] getConsultas() {
        return this.consultas;
    }
}
