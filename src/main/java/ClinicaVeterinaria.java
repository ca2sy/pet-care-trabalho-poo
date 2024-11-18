import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class ClinicaVeterinaria {
    private List<Dono> listaDeDonos;
    private List<Animal> listaDeAnimais;
    private List<AnimaisParaAdocao> listaDeAnimaisParaAdocao;
    private ArrayList<Animal> animaisDoDono;
    private ArrayList<CampanhaVacinacao>listaDeCampanhas;
    private ArrayList<Consulta> listaDeProntuariosConsulta;
    private ArrayList <Cirurgia> listaDeProntuariosCirurgia;
    private ArrayList <Exame> listaDeExames;

    public ClinicaVeterinaria() {
        listaDeDonos = new ArrayList<>();
        animaisDoDono = new ArrayList<>();
        listaDeAnimais = new ArrayList<>();
        listaDeAnimaisParaAdocao = new ArrayList<>();
        listaDeCampanhas = new ArrayList<>();
        listaDeProntuariosConsulta = new ArrayList<>();
        listaDeProntuariosCirurgia = new ArrayList<>();
        listaDeExames = new ArrayList<>();
    }
//métodos para cadastro
    public void cadastrarDonoComSeusPets() {
        int operadorVIP;
        int operadorPlano;
        String tipoPlano = "";
        boolean vip;
        String nome = Entrada.lerTexto("Digite o nome do dono");
        int telefone = Entrada.lerInt("Digite o telefone do dono");

        do {
            operadorVIP = Entrada.lerInt("Digite 1 para operador VIP e 0 para não operador VIP");
        } while (operadorVIP < 0 || operadorVIP > 1);

        if (operadorVIP == 1) {
            vip = true;
        } else {
            vip = false;
        }

        do {
            operadorPlano = Entrada.lerInt("Digite 1 para plano anual, 2 para plano mensal e 3 para não ter plano");
            System.out.println("    ");
        } while (operadorPlano < 1 || operadorPlano > 3);

        if (operadorPlano == 1) {
            tipoPlano = "Plano anual";
        } else if (operadorPlano == 2) {
            tipoPlano = "Plano mensal";
        } else {
            tipoPlano = "Sem plano";
        }

        Dono dono = new Dono(nome, telefone, vip, tipoPlano);
        listaDeDonos.add(dono);

        System.out.println("Dono cadastrado com sucesso!");
        System.out.println("Agora, realizaremos o cadastro dos pets do dono.");



        int quantidadePets = Entrada.lerInt("Digite a quantidade de pets que o dono possui.");
        System.out.println("    ");
        for (int i = 0; i < quantidadePets; i++) {
            String nomePet = Entrada.lerTexto("Digite o nome do pet");
            int idadePet = Entrada.lerInt("Digite a idade do pet");
            String especiePet = Entrada.lerTexto("Digite a espécie do pet");
            String historicoSaudePet = Entrada.lerTexto("Digite o histórico de saúde do pet");

            Animal animal = new Animal(especiePet, nomePet, idadePet, historicoSaudePet);
             animaisDoDono.add(animal);
            listaDeAnimais.add(animal);
            System.out.println("Pet cadastrado com sucesso!");
        }
    }

    public void cadastrarAnimalParaAdocao(){
        String nomePet = Entrada.lerTexto("Digite o nome do pet");
        int idadePet = Entrada.lerInt("Digite a idade do pet");
        String especiePet = Entrada.lerTexto("Digite a espécie do pet");
        String historicoSaudePet = Entrada.lerTexto("Digite o histórico de saúde do pet");


        int operadorCastrado;
        boolean castrado; 
        do {
            operadorCastrado = Entrada.lerInt("Digite 1 para castrado e 0 para não castrado");
            System.out.println("    ");
        } while (operadorCastrado < 0 || operadorCastrado > 1);

        if (operadorCastrado == 1) {
            castrado = true;
        } else {
            castrado = false;
        }

        AnimaisParaAdocao animalParaAdocao = new AnimaisParaAdocao(especiePet, nomePet, idadePet, historicoSaudePet, castrado);
        listaDeAnimaisParaAdocao.add(animalParaAdocao); 

        System.out.println("Animal para adoção cadastrado com sucesso!");

    }

    //métodos para procurar algo que foi cadastrado
    public Dono buscarDono(String nomeDono) {
        if(listaDeDonos.isEmpty()){
            System.out.println("Não há donos cadastrados.");

        } else {
        for (Dono dono : listaDeDonos) {  
            if (dono.getNomeDono().equalsIgnoreCase(nomeDono)) {
                return dono;
            }
        }  
    }
        return null;
    }
    public Animal buscarAnimal(String nomeAnimal){
        if (listaDeAnimais.isEmpty()){
            System.out.println("Não há animais cadastrados.");
        }
        for (Animal animal : listaDeAnimais) {
            if (animal.getNomeAnimal().equalsIgnoreCase(nomeAnimal)) {
                return animal;
            }
        }
         return null;
        }




    public AnimaisParaAdocao buscarAnimalParaAdocao(String nomeAnimal){
        if (listaDeAnimaisParaAdocao.isEmpty()){
            System.out.println("Não há animais para adoção cadastrados.");
        } else {
        for (AnimaisParaAdocao animal : listaDeAnimaisParaAdocao){
            if (animal.getNomeAnimal().equalsIgnoreCase(nomeAnimal)){
                return animal;
            }
        }
        }
        return null;
    }

    //métodos para listar tudo o que foi cadastrado

    public void listarDonos(){
        System.out.println("Lista de donos cadastrados:");
        System.out.println("    ");
        for (Dono dono : listaDeDonos){
            System.out.println("Nome: " + dono.getNomeDono());
            System.out.println("Telefone: " + dono.getNumeroTelefoneDono());
            System.out.println("VIP: " + dono.getVip());
            System.out.println("Tipo de plano: " + dono.getTipoPlano());
            System.out.println("Animais do dono:");
            System.out.println("    ");
            for (Animal animal : animaisDoDono){
                System.out.println("Espécie: " + animal.getEspecie());
                System.out.println("Nome: " + animal.getNomeAnimal());
                System.out.println("Idade: " + animal.getIdadeAnimal());

            }
        }
    }

    public void listarAnimais(){
        System.out.println("Lista de animais cadastrados:");
        for (Animal animal : listaDeAnimais){
            System.out.println("Nome: " + animal.getNomeAnimal());
            System.out.println("Espécie: " + animal.getEspecie());
            System.out.println("Idade: " + animal.getIdadeAnimal());
            System.out.println("Histórico de saúde: " + animal.getHistoricoDeSaude());
            System.out.println("    ");
            animal.exibirHistoricoVisitas();
        }
    }

    public void listarAnimaisParaAdocao(){
        System.out.println("Lista de animais para adoção cadastrados:");
        for (AnimaisParaAdocao animalParaAdocao : listaDeAnimaisParaAdocao){
            System.out.println("Nome: " + animalParaAdocao.getNomeAnimal());
            System.out.println("Espécie: " + animalParaAdocao.getEspecie());
            System.out.println("Idade: " + animalParaAdocao.getIdadeAnimal());
            System.out.println("Histórico de saúde: " + animalParaAdocao.getHistoricoDeSaude());
            System.out.println("    ");
            animalParaAdocao.exibirHistoricoVisitas();

        }
    }

    //métodos para remover algo que foi cadastrado

    public void removerDono(){
        String nomeDono;
         nomeDono = Entrada.lerTexto("Digite o nome do dono que deseja");
        Dono donoRemovido = buscarDono(nomeDono);
        if (donoRemovido != null){
            listaDeDonos.remove(donoRemovido);
            System.out.println("Dono removido com sucesso!");
        } else {
            System.out.println("Dono não encontrado.");
        }
    }

    public void removerAnimal(){
        String nomeAnimal;
         nomeAnimal = Entrada.lerTexto("Digite o nome do animal");
        Animal animalRemovido = buscarAnimal(nomeAnimal);
        if (animalRemovido != null){
            listaDeAnimais.remove(animalRemovido);
            System.out.println("Animal removido com sucesso!");
            System.out.println("Animal não encontrado.");

        }
    }    

    public void removerAnimalParaAdocao(){
        String nomeAnimal;
        nomeAnimal = Entrada.lerTexto("Digite o nome do animal para remover da lista de animais para adoção");
        AnimaisParaAdocao animalParaAdocaoRemovido = buscarAnimalParaAdocao(nomeAnimal);
        if (animalParaAdocaoRemovido != null){
            listaDeAnimaisParaAdocao.remove(animalParaAdocaoRemovido);
            System.out.println("Animal para adoção removido com sucesso!");
        } else {
            System.out.println("Animal para adoção não encontrado.");
        }
    }

    //métodos para agendar (vacinação, exame, consulta e cirurgia)

    public void agendarCampanhaVacinacao(){
        String nomeAnimalParaReceber;
        String nomeCampanha = Entrada.lerTexto("Digite o nome da campanha");
        String nomeVacina = Entrada.lerTexto("Digite o nome da vacina que será aplicada nessa campanha.");
        String data = Entrada.lerTexto("Qual dia a campanha vai acontecer?");
        int horaInicio = Entrada.lerInt("Qual horário deseja iniciar a campanha? Diga em números inteiros, de 00 - 24");
        int horaFim = Entrada.lerInt("Qual horário deseja encerrar a campanha? Diga em números inteiros, de 00 - 24" );

        CampanhaVacinacao campanhaVacinacao = new CampanhaVacinacao(nomeCampanha, nomeVacina, data, horaInicio, horaFim);
            listaDeCampanhas.add(campanhaVacinacao); 

        int quantidadeVacinas = Entrada.lerInt("Quantas vacinas serão aplicadas? Essa informação é necessária para realizar a lista de animais que receberão a vacina.");
         for (int i = 0; i < quantidadeVacinas; i++) {
                 nomeAnimalParaReceber = Entrada.lerTexto("Digite o nome do animal que receberá a vacina.");

Animal animal = buscarAnimal(nomeAnimalParaReceber); 
                if (animal == null) {
                    System.out.println("Animal não encontrado.");
                    return;

                } else {
                    campanhaVacinacao.adicionarNecessitadoDeVacina(animal); 
                }
            }
        }

    public CampanhaVacinacao ProcurarCampanhaVacinacaoPorNome(){
        if (listaDeCampanhas.isEmpty()) {
            System.out.println("Não há campanhas cadastradas.");
        } else {
        String nomeCampanha = Entrada.lerTexto("Digite o nome da campanha que deseja procurar");
        for (CampanhaVacinacao campanhaVacinacao : listaDeCampanhas){
            if (campanhaVacinacao.getNomeCampanha().equals(nomeCampanha)){
                return campanhaVacinacao;
            }
        }  
    }
        return null; 
    }

    public void emitirCertificadoVacina(){
        String nomeCampanha;
        String nomeAnimalCertificar;


        nomeAnimalCertificar = Entrada.lerTexto("Digite o nome do animal que se vacinou e receberá o certificado");
        Animal animal = buscarAnimal(nomeAnimalCertificar); 

        if (animal == null) {
            System.out.println("Animal não encontrado.");
        } else {

            CampanhaVacinacao campanhaVacinacao = ProcurarCampanhaVacinacaoPorNome();

            if (campanhaVacinacao != null) {

                campanhaVacinacao.removerNecessitadoDeVacina(animal);


                System.out.println("================ CERTIFICADO DE VACINAÇÃO =====================");
                System.out.println("Certificamos que o(a) pet abaixo foi vacinado(a): ");
                System.out.println("Nome do Pet: " + nomeAnimalCertificar);
                System.out.println("Vacina tomada: " + campanhaVacinacao.getNomeVacina());
                System.out.println("Data de emissão do certificado: " + LocalDate.now());
                System.out.println("=================================================================");
            } else {
                System.out.println("Campanha de vacinação não encontrada.");
            }
        }
    } //metodo de gerenciar

    public void exibirCampanhas(){
        System.out.println("Lista de campanhas de vacinação:");
        for (CampanhaVacinacao campanhaVacinacao : listaDeCampanhas){
            System.out.println("Nome da campanha: " + campanhaVacinacao.getNomeCampanha());
            System.out.println("Nome da vacina: " + campanhaVacinacao.getNomeVacina());
            System.out.println("Data da campanha: " + campanhaVacinacao.getDataInicio());
            System.out.println("Horário de início: " + campanhaVacinacao.getHoraInicio());
            System.out.println("Horário de término: " + campanhaVacinacao.getHoraTermino());
            }

        }


    public void agendarConsulta(){
         String nomePetConsultado = Entrada.lerTexto("Digite o nome do pet que será consultado.");
         int idConsulta = Entrada.lerInt("Digite o ID da consulta.");     
         String motivoConsulta = Entrada.lerTexto("Digite o motivo da consulta."); 
         String dataConsulta = Entrada.lerTexto("Digite a data da consulta."); 
         int horaConsulta = Entrada.lerInt("Digite a hora da consulta, apenas em números inteiros."); 

        Animal animalConsultado = buscarAnimal(nomePetConsultado); 
        if (animalConsultado == null) {
            System.out.println("Animal não encontrado. Tente novamente.");
            agendarConsulta();} 

        Consulta consulta = new Consulta(nomePetConsultado, idConsulta, motivoConsulta, dataConsulta, horaConsulta);

        listaDeProntuariosConsulta.add(consulta);

        consulta.prontuario();
    }

    public void exibirProntuariosConsulta() {
        System.out.println("Prontuários de Consultas:");
        if (listaDeProntuariosConsulta.isEmpty()) {
            System.out.println("Nenhum prontuário de consulta registrado.");
        } else {
            for (Consulta consulta : listaDeProntuariosConsulta) {
                System.out.println("\nProntuário da Consulta - ID: " + consulta.getIdServico());
                consulta.prontuario(); 
            }
        }
    } //metodo de gerenciar

    public void agendarCirurgia() {

        String nomePetCirurgiado = Entrada.lerTexto("Digite o nome do pet que será cirurgiado.");
        int idCirurgia = Entrada.lerInt("Digite o ID da cirurgia.");
        String tipoCirurgia = Entrada.lerTexto("Digite o tipo da cirurgia.");
        String dataCirurgia = Entrada.lerTexto("Digite a data da cirurgia.");
        int horaCirurgia = Entrada.lerInt("Digite a hora da cirurgia, apenas em números inteiros.");
        int diasParaRecuperacao = Entrada.lerInt("Digite o número de dias para recuperação após a cirurgia.");


        Animal animalCirurgiado = buscarAnimal(nomePetCirurgiado);
        if (animalCirurgiado == null) {
            System.out.println("Animal não encontrado. Tente novamente.");

        }


        Cirurgia cirurgia = new Cirurgia(nomePetCirurgiado, idCirurgia, tipoCirurgia, dataCirurgia, horaCirurgia, diasParaRecuperacao);
        cirurgia.setNomePet(nomePetCirurgiado); 


        listaDeProntuariosCirurgia.add(cirurgia);


        cirurgia.prontuario();
    }

    public void exibirProntuariosCirurgia() {
        System.out.println("Exibindo todos os prontuários de cirurgias:\n");
        if (listaDeProntuariosCirurgia.isEmpty()) {
            System.out.println("Nenhum prontuário de cirurgia registrado.");
        } else {
           for (Cirurgia cirurgia : listaDeProntuariosCirurgia) {
                System.out.println("\nProntuário da Cirurgia - ID: " + cirurgia.getIdServico());
                cirurgia.prontuario();  
            }
        }
    } //metodo de gerenciar

     public void agendarExame(){
         String nomePetExaminado = Entrada.lerTexto("Digite o nome do pet que será examinado.");
            String nomeDonoDoPetExaminado = Entrada.lerTexto("Digite o nome do Dono desse pet.");
         int idExame = Entrada.lerInt("Digite o ID do exame.");
         String tipoExame = Entrada.lerTexto("Digite o tipo de exame.");
         String dataExame = Entrada.lerTexto("Digite a data do exame.");
         int horaExame = Entrada.lerInt("Digite a hora do exame."); 
            Exame exame = new Exame(nomePetExaminado,nomeDonoDoPetExaminado, idExame, tipoExame, dataExame, horaExame);
            listaDeExames.add(exame);
                }

    public void exibirExames(){
        System.out.println("Exibindo todos os exames:\n");
        if (listaDeExames.isEmpty()) {
            System.out.println("Nenhum exame registrado.");
        } else {
            for (Exame exame : listaDeExames) {
                System.out.println("\nExame - ID: " + exame.getIdExame());
                exame.informacoesExame();
            }
        }
    } //metodo de gerenciar

    public Exame procurarExamePorId(int idExame) {
        for (Exame exame : listaDeExames) {
            if (exame.getIdExame() == idExame) {
                return exame; 
            }
        }
        return null; 
    }

    public void alterarResultadoExame() {
        if (listaDeExames.isEmpty()) { 
            System.out.println("Nenhum exame registrado.");
        } else {
        int idExame;
            idExame = Entrada.lerInt("Digite o ID do exame que deseja alterar");
        procurarExamePorId(idExame).atualizarResultado();
        }
    } //metodo de gerenciar

    public void HistoricoVisita(){
        String nomeAnimal = Entrada.lerTexto("Digite o nome do animal");
        Animal animal = buscarAnimal(nomeAnimal);

        if (animal != null) {
            int escolha;
            do {
                System.out.println("O que você deseja fazer?");
                System.out.println("1 - Adicionar visita ao histórico de visitas");
                System.out.println("2 - Ver histórico de visitas");
                escolha = Entrada.lerInt("Digite a opção desejada:");
            } while (escolha < 1 || escolha > 2);

            if (escolha == 1) {
                animal.adicionarVisitaHistorico();
                System.out.println("Visita adicionada ao histórico com sucesso!");
            } else if (escolha == 2) {
                animal.exibirHistoricoVisitas();
            }
        } else {
            System.out.println("Animal não encontrado.");
        }
    } //metodo de gerenciar

    public void adotarAnimal(){
        if (listaDeAnimaisParaAdocao.isEmpty()){
            System.out.println("Não há animais disponíveis para adoção.");
            return;
        }

        System.out.println("Animais para adoção:");
        for (AnimaisParaAdocao animal : listaDeAnimaisParaAdocao){
            System.out.println("Nome: " + animal.getNomeAnimal());
            System.out.println("Espécie: " + animal.getEspecie());
            System.out.println("Idade: " + animal.getIdadeAnimal());
            System.out.println("Histórico de saúde: " + animal.getHistoricoDeSaude());
        }

        String nomeAnimal = Entrada.lerTexto("Digite o nome do animal que deseja adotar:");
        AnimaisParaAdocao animalParaAdotar = buscarAnimalParaAdocao(nomeAnimal);
        if (animalParaAdotar != null){
            listaDeAnimaisParaAdocao.remove(animalParaAdotar);
            System.out.println("Parabéns pela adoção! " + animalParaAdotar.getNomeAnimal() + " está em boas mãos com a sua nova família.");
        } else {
            System.out.println("Animal não encontrado na lista de adoção.");
        }
    } //adotar

    public void pagarPlano(){
        String nomeDono;
        nomeDono = Entrada.lerTexto("Digite o nome do dono do plano de saúde");
        Dono dono = buscarDono(nomeDono);
        if (dono != null){
            if (dono.getTipoPlano().equals("Plano anual")){
                if (dono.getVip()){
                    double valorPlano = 1000;
                    double desconto = valorPlano * 0.15;
                    valorPlano -= desconto;
                    System.out.println("O valor do plano anual com desconto de 15% para clientes VIP é: " + valorPlano);
                    System.out.println("Agradecemos pelo pagamento!");
                } else{
                    System.out.println("O valor do plano anual é: 1000");
                }
            } else if (dono.getTipoPlano().equals("Plano mensal")){
                if (dono.getVip()){
                    double valorPlano = 100;
                    double desconto = valorPlano * 0.15;
                    valorPlano -= desconto;
                    System.out.println("O valor do plano mensal com desconto de 15% para clientes VIP é: " + valorPlano);
                    System.out.println("Agradecemos pelo pagamento!");
                } else{
                    System.out.println("O valor do plano mensal é: 100");
                    System.out.println("Agradecemos pelo pagamento!");
                }
            } else{
                System.out.println("O dono não possui plano.");
            }
        } else {
            System.out.println("Dono não encontrado.");
        }
    } //pagar


}