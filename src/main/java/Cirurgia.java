public class Cirurgia extends Servico {

    private String tipoCirurgia;
    private int diasParaRecuperacao;

    public Cirurgia(String nomePetCirurgiado, int idCirurgia, String tipoCirurgia, String dataCirurgia, int horaCirurgia, int diasParaRecuperacao) {

        super(nomePetCirurgiado, idCirurgia, dataCirurgia, horaCirurgia);
        this.tipoCirurgia = tipoCirurgia;
        this.diasParaRecuperacao = diasParaRecuperacao;
    }


    public String getTipoCirurgia() {
        return tipoCirurgia;
    }

    public void setTipoCirurgia(String tipoCirurgia) {
        this.tipoCirurgia = tipoCirurgia;
    }

    public int getDiasParaRecuperacao() {
        return diasParaRecuperacao;
    }

    public void setDiasParaRecuperacao(int diasParaRecuperacao) {
        this.diasParaRecuperacao = diasParaRecuperacao;
    }

    @Override
    public void prontuario() {
        System.out.println("Protuário Cirúrgico");
        System.out.println("    ");
        super.prontuario();  
        System.out.println("Tipo de cirurgia: " + tipoCirurgia);
        System.out.println("    ");
        System.out.println("Tempo de recuperação: " + diasParaRecuperacao + " dias");
        System.out.println("    ");
    }
}