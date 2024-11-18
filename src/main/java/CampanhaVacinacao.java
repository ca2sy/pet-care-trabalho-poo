import java.util.ArrayList;
import java.util.List;

public class CampanhaVacinacao {
    private String nomeCampanha;
    private String nomeVacina;
    private String dataInicio;
    private int horaInicio;
    private int horaTermino;
    private List<Animal> necessitadosDeVacina;

    public CampanhaVacinacao(String nomeCampanha, String nomeVacina, String dataInicio, int horaInicio, int horaTermino) {
        this.nomeCampanha = nomeCampanha;
        this.nomeVacina = nomeVacina;
        this.dataInicio = dataInicio;
        this.horaInicio = horaInicio;
        this.horaTermino = horaTermino;
        this.necessitadosDeVacina = new ArrayList<>();
    }

    public String getNomeCampanha() {
        return nomeCampanha;
    }

    public void setNomeCampanha(String nomeCampanha){
        this.nomeCampanha = nomeCampanha;
    }

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getHoraTermino() {
        return horaTermino;
    }

    public void setHoraTermino(int horaTermino) {
        this.horaTermino = horaTermino;
    }

    public List<Animal> getNecessitadosDeVacina() {
        return necessitadosDeVacina;
    }

    public void setNecessitadosDeVacina(List<Animal> necessitadosDeVacina) {
        this.necessitadosDeVacina = necessitadosDeVacina;
    }

    public void adicionarNecessitadoDeVacina(Animal necessitado) {
        necessitadosDeVacina.add(necessitado);
    }

    public void removerNecessitadoDeVacina(Animal necessitado){
        necessitadosDeVacina.remove(necessitado);
    }

}