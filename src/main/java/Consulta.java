public class Consulta extends Servico {

    private String motivoConsulta;

    public Consulta(String nomePetConsultado, int idConsulta, String motivoConsulta, String dataConsulta, int horaConsulta) {
        super(nomePetConsultado, idConsulta, dataConsulta, horaConsulta);
        this.motivoConsulta = motivoConsulta;
    }


    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    @Override
    public void prontuario() {
        System.out.println("Prontuário de Consulta");
        System.out.println("    ");
        super.prontuario();  
        System.out.println("Motivo da consulta: " + motivoConsulta);
        System.out.println("    ");
    }
}