public class Servico {

    private String nomePet;
    private int idServico;     
    private String dataServico; 
    private int horaServico; 


    public Servico(String nomePet, int idServico, String dataServico, int horaServico) {
        this.nomePet = nomePet;
        this.idServico = idServico;
        this.dataServico = dataServico;
        this.horaServico = horaServico;
    }


    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public int getIdServico() {
        return idServico;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }

    public String getDataServico() {
        return dataServico;
    }

    public void setDataServico(String dataServico) {
        this.dataServico = dataServico;
    }

    public int getHoraServico() {
        return horaServico;
    }

    public void setHoraServico(int horaServico) {
        this.horaServico = horaServico;
    }


    public void prontuario() {
        System.out.println("Nome do pet: " + nomePet);
        System.out.println("ID: " + idServico);
        System.out.println("Data: " + dataServico);
        System.out.println("Horário: " + horaServico);
    }
}