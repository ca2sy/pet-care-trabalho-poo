public class Exame {

    private String nomeDonoDoPetExaminado;
    private String nomePetExaminado;
    private int idExame;
    private String tipoExame; 
    private String dataExame;
    private int horaExame;
    private String resultadoExame;
    private Boolean resultadoDisponivel;  

    public Exame(String nomePetExaminado, String nomeDonoDoPetExaminado, int idExame, String tipoExame, String dataExame, int horaExame) {
        this.nomePetExaminado = nomePetExaminado;
        this.nomeDonoDoPetExaminado = nomeDonoDoPetExaminado;
        this.idExame = idExame;
        this.tipoExame = tipoExame;
        this.dataExame = dataExame;
        this.horaExame = horaExame;
        this.resultadoDisponivel = false;  
    }

    public String getNomePetExaminado(){
        return nomePetExaminado;
    }

    public void setNomePetExaminado(String nomePetExaminado){
        this.nomePetExaminado = nomePetExaminado;
    }

    public String getNomeDonoDoPetExaminado() {
        return nomeDonoDoPetExaminado;
    }

    public void setNomeDonoDoPetExaminado(String nomeDonoDoPetExaminado) {
        this.nomeDonoDoPetExaminado = nomeDonoDoPetExaminado;
    }

    public int getIdExame() {
        return idExame;
    }

    public void setIdExame(int idExame) {
        this.idExame = idExame;
    }

    public String getTipoExame() {
        return tipoExame;
    }

    public void setTipoExame(String tipoExame) {
        this.tipoExame = tipoExame;
    }

    public String getDataExame() {
        return dataExame;
    }

    public void setDataExame(String dataExame) {
        this.dataExame = dataExame;
    }

    public int getHoraExame() {
        return horaExame;
    }

    public void setHoraExame(int horaExame) {
        this.horaExame = horaExame;
    }

    public String getResultadoExame() {
        return resultadoExame;
    }

    public void setResultadoExame(String resultadoExame) {
        this.resultadoExame = resultadoExame;
    }

    public Boolean getResultadoDisponivel() {
        return resultadoDisponivel;
    }

    public void setResultadoDisponivel(Boolean resultadoDisponivel){
        this.resultadoDisponivel = resultadoDisponivel;
    }

    public void atualizarResultado(){
        int operadorResultado;
        do {
            operadorResultado = Entrada.lerInt("Pressione 1 para Normal, 2 para Alterado, 3 para Positivo e 4 para Negativo");
        } while (operadorResultado < 1 || operadorResultado > 4);
        switch (operadorResultado) {
            case 1:
                System.out.println(resultadoExame = "Normal");
                resultadoDisponivel = true; 
                break;
            case 2:
                System.out.println(resultadoExame = "Alterado");
                resultadoDisponivel = true;  
                break;
            case 3:
                System.out.println(resultadoExame = "Positivo");
                resultadoDisponivel = true;
                break;
            case 4:
                System.out.println(resultadoExame = "Negativo");
                resultadoDisponivel = true;  
                break;
            default:
                System.out.println("Resultado do exame inválido. Tente novamente.");
                atualizarResultado();
                break;
        }
    }

    public void informacoesExame() {
        System.out.println("Nome do pet: " + nomePetExaminado);
        System.out.println("Nome do dono: " + nomeDonoDoPetExaminado);
        System.out.println("ID do exame: " + idExame);
        System.out.println("Tipo do exame: " + tipoExame);
        System.out.println("Data do exame: " + dataExame);
        System.out.println("Hora do exame: " + horaExame);
        if (resultadoDisponivel == false) {
            System.out.println("Resultado do exame está indisponível. Aguardando atualização");
        } else if (resultadoDisponivel == true) {
            System.out.println("Resultado disponível: " + resultadoExame);
        }
    }


}