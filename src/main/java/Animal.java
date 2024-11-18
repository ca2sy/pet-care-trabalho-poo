import java.util.ArrayList;
import java.util.Scanner;   

public class Animal {
    private String especie;
    private String nomeAnimal; 
    private int idadeAnimal;
    private String historicoDeSaude;
    private ArrayList<String> historicoVisitas;
    private ArrayList<Exame> examesRealizados;

    public Animal(String especie, String nomeAnimal, int idadeAnimal, String historicoDeSaude) {
        this.nomeAnimal = nomeAnimal;
        this.especie = especie;
        this.idadeAnimal = idadeAnimal;
        this.historicoDeSaude = historicoDeSaude;
        this.historicoVisitas = new ArrayList<>();
        this.examesRealizados = new ArrayList<>();
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public int getIdadeAnimal() {
        return idadeAnimal;
    }

    public void setIdadeAnimal(int idadeAnimal) {
        this.idadeAnimal = idadeAnimal;
    }

    public String getHistoricoDeSaude() {
        return historicoDeSaude;
    }

    public void setHistoricoDeSaude(String historicoDeSaude) {
        this.historicoDeSaude = historicoDeSaude;
    }

    public ArrayList<String> getHistoricoVisitas() {
        return historicoVisitas;
    }

    public void adicionarVisitaHistorico() {
        Scanner entrada = new Scanner(System.in); 
        int TipoDeVisita = Entrada.lerInt("Informe o tipo de visita. Pressione 1 para Tratamentos, 2 para Exames e 3 para Cirurgias");
        while (TipoDeVisita != 1 && TipoDeVisita != 2 && TipoDeVisita != 3) {
            System.out.println("Tipo de visita inválida. Por favor, digite 1, 2 ou 3.");
            TipoDeVisita = Entrada.lerInt("Informe o tipo de visita. Pressione 1 para Tratamentos, 2 para Exames e 3 para Cirurgias");
        }

        if (TipoDeVisita == 1) {
            historicoVisitas.add("Tratamento" + nomeAnimal + " adicionado ao histórico em " + java.time.LocalDate.now());
        } else if (TipoDeVisita == 2) {
            historicoVisitas.add("Exame de" + nomeAnimal + " adicionado ao histórico em " + java.time.LocalDate.now());
        } else if (TipoDeVisita == 3) {
            historicoVisitas.add("Cirurgia" + nomeAnimal + "adicionado ao histórico em " + java.time.LocalDate.now());
        }
        }

    public void exibirHistoricoVisitas(){
        System.out.println("Histórico de visitas do animal:");
        for (String visita : historicoVisitas) {
            System.out.println(visita);
        }
    }





    }