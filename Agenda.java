public class Agenda {

    private Consulta[] consultas;
    private int qtdConsultas;

    public Agenda() {
        this.consultas = new Consulta[40]; 
        this.qtdConsultas = 0;
    }

    // 1) Adicionar consulta
    public boolean adicionarConsulta(Consulta consulta) {
        if (qtdConsultas < 40) {
            consultas[qtdConsultas] = consulta;
            qtdConsultas++;
            return true;
        }
        return false;
    }

    // 2) remover consulta
    public boolean removerConsulta(int nro) {
        int pos = buscarPosicao(nro);
        if (pos != -1) {
            // remover e reorganizar vetor
            for (int i = pos; i < qtdConsultas - 1; i++) {
                consultas[i] = consultas[i + 1];
            }
            consultas[qtdConsultas - 1] = null;
            qtdConsultas--;
            return true;
        }
        return false;
    }

    // 3) buscar consulta por número
    public Consulta buscarConsultaPorNro(int nro) {
        int pos = buscarPosicao(nro);
        if (pos != -1) {
            return consultas[pos];
        }
        return null;
    }

    // 4) buscar posição 
    public int buscarPosicao(int nro) {
        for (int i = 0; i < qtdConsultas; i++) {
            if (consultas[i].getNro() == nro) {
                return i;
            }
        }
        return -1;
    }

    // 5) buscarConsultaMedico
    public Consulta[] buscarConsultaMedico(String nomeMedico) {
        // Primeiro acha o médico
        Medico medicoEncontrado = null;
        for (int i = 0; i < qtdConsultas; i++) {
            if (consultas[i].getMedico().getNome().equalsIgnoreCase(nomeMedico)) {
                medicoEncontrado = consultas[i].getMedico();
                break;
            }
        }
        if (medicoEncontrado == null) return new Consulta[0];

        // Conta quantas consultas esse médico tem
        int count = 0;
        for (int i = 0; i < qtdConsultas; i++) {
            if (consultas[i].getMedico().getCRM() == medicoEncontrado.getCRM()) {
                count++;
            }
        }

        // Cria vetor e preenche
        Consulta[] resultado = new Consulta[count];
        int idx = 0;
        for (int i = 0; i < qtdConsultas; i++) {
            if (consultas[i].getMedico().getCRM() == medicoEncontrado.getCRM()) {
                resultado[idx++] = consultas[i];
            }
        }
        return resultado;
    }

    // 6) buscarConsultaPaciente
    public Data buscarConsultaPaciente(int codPaciente) {
        for (int i = 0; i < qtdConsultas; i++) {
            if (consultas[i].getPaciente().getCodigo() == codPaciente) {
                return consultas[i].getData();
            }
        }
        return null;
    }

    // 7) buscarConsultaData
    public Consulta[] buscarConsultaData(int dia, int mes, int ano) {
        int count = 0;
        for (int i = 0; i < qtdConsultas; i++) {
            Data d = consultas[i].getData();
            if (d.getDia() == dia && d.getMes() == mes && d.getAno() == ano) {
                count++;
            }
        }

        Consulta[] resultado = new Consulta[count];
        int idx = 0;
        for (int i = 0; i < qtdConsultas; i++) {
            Data d = consultas[i].getData();
            if (d.getDia() == dia && d.getMes() == mes && d.getAno() == ano) {
                resultado[idx++] = consultas[i];
            }
        }
        return resultado;
    }

    // 8) buscarValorConsultasPorEspecialidadeMedica
    public double buscarValorConsultasPorEspecialidadeMedica(String esp) {
        double soma = 0;
        for (int i = 0; i < qtdConsultas; i++) {
            if (consultas[i].getMedico().getEspecialidade().equalsIgnoreCase(esp)) {
                soma += consultas[i].getValor();
            }
        }
        return soma;
    }

    // 9) alterarMedico
    public void alterarMedico(int nroConsulta, Medico novoMedico) {
        int pos = buscarPosicao(nroConsulta);
        if (pos != -1) {
            consultas[pos].setMedico(novoMedico);
        }
    }

    // 10) buscarConsultaMaisBarata
    public Consulta buscarConsultaMaisBarata() {
        if (qtdConsultas == 0) return null;

        Consulta maisBarata = consultas[0];

        for (int i = 1; i < qtdConsultas; i++) {
            if (consultas[i].getValor() < maisBarata.getValor()) {
                maisBarata = consultas[i];
            }
        }
        return maisBarata;
    }

    // 11) mostraAgenda
    public void mostraAgenda() {
        for (int i = 0; i < qtdConsultas; i++) {
            System.out.println(consultas[i]);
        }
    }
}