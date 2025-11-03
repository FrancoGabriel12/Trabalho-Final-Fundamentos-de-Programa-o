public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
//setters
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
//getters
    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }
//verificação da data
    public boolean dataValida() {
        if (mes < 1 || mes > 12){
            return false;
        }
        if (dia < 1){
         return false;   
        } 

        int diasMes;

        if (mes == 2) { // Fevereiro
            if (anoBissexto()) {
                diasMes = 29;
            } else {
                diasMes = 28;
            }   
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            diasMes = 30; // Meses com 30 dias
        } else {
            diasMes = 31; // Meses com 31 dias
        }
        return dia <= diasMes;
    }
//método anoBI
    private boolean anoBissexto() {
        int ano = this.ano;

        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
              }
        } else {
            return false;
          }
    }
    public String toString() {
        return "dia: " + this.dia + ", mes: " + this.mes + ", ano: " + this.ano;
    }
}