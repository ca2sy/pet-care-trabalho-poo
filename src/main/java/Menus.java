public class Menus {
ClinicaVeterinaria clinica = new ClinicaVeterinaria();


  public void menuPrincipal(){
    int operadorMenuPrincipal;
    System.out.println("                                              ");
    System.out.println("+--------------------------------------------+");
    System.out.println("|            Menu Principal                  |");
    System.out.println("+--------------------------------------------+");
    System.out.println("| 1 - Menu Cadastros | 2- Agendar            |");
    System.out.println("+--------------------------------------------+");
    System.out.println("| 3 - Gerenciar      | 4 - Pagamento         |");
    System.out.println("+--------------------------------------------+");    
    System.out.println("| 5 - Adotar um pet  | 6 - Sair              |");
    System.out.println("+--------------------------------------------+");
    System.out.println("                                               ");
    do {  
    operadorMenuPrincipal = Entrada.lerInt("Digite o número correspondente a sua escolha: ");
    } while (operadorMenuPrincipal< 1 || operadorMenuPrincipal > 6);
    switch (operadorMenuPrincipal){
      case 1: 
        menuCadastro();
         System.out.println("");
        break;
      case 2:
        menuAgendar();
         System.out.println("");
        break;
      case 3:
        menuGerenciar();
         System.out.println("");
        break;
      case 4:
        clinica.pagarPlano();
         System.out.println("");
        int voltarMenuPrincipal = Entrada.lerInt("Digite qualquer número para voltar para o menu principal: ");
        menuPrincipal();
        break;

      case 5:
        clinica.adotarAnimal();
        System.out.println("");
        voltarMenuPrincipal = Entrada.lerInt("Digite qualquer número para voltar para o menu principal: ");
        menuPrincipal();
        break;
      case 6:
        System.out.println("Obrigado por usar nosso sistema!");
        break;


  }

  }

public void menuCadastro(){
int operadorMenuCadastro;
  System.out.println("O menu de cadastros contém as seguintes fuções: cadastrar, listar e remover.");
System.out.println("                                          ");
System.out.println("+----------------------------------------+");
System.out.println("|            Menu de Cadastros           |");
System.out.println("+----------------------------------------+");
System.out.println("| 1- Lista de cadastrados | 2- Cadastro  |");
System.out.println("+----------------------------------------+");
System.out.println("| 3- Remover Cadastro     | 4 - Voltar   |");
System.out.println("+----------------------------------------+");
System.out.println("                                          ");
do {  
operadorMenuCadastro = Entrada.lerInt("Digite o número correspondente a sua escolha: ");
} while (operadorMenuCadastro < 1 || operadorMenuCadastro > 4);
switch (operadorMenuCadastro){
  case 1: opcoesListarCadastros();
    break;
  case 2: opcoesCadastrar();
    break;
  case 3: opcoesRemoverCadastro();
    break;
      case 4: menuPrincipal();
    break;
  default: System.out.println("Opção inválida. Tente novamente.");
    menuCadastro();
    break;





}

}

  public void opcoesListarCadastros(){
    int operadorListar;
    System.out.println("+----------------------------------+");
    System.out.println("|Qual cadastro você quer listar?   |");
    System.out.println("+----------------------------------+");
    System.out.println("|1- Donos                         |");   
    System.out.println("+----------------------------------+");
    System.out.println("|2- Pets                           |");
    System.out.println("+----------------------------------+");
    System.out.println("|3- Pets para adoção               |");
    System.out.println("+----------------------------------+");
    System.out.println("|4- Voltar ao menu de Cadastro     |");
    System.out.println("+----------------------------------+");

    do {  
    operadorListar = Entrada.lerInt("Digite o número correspondente a sua escolha: ");
    } while (operadorListar < 1 || operadorListar > 4);
    switch (operadorListar){
      case 1:
        clinica.listarDonos();  
          int voltarListagem = Entrada.lerInt("Digite qualquer número para voltar para as opções de listagem: ");
        opcoesListarCadastros();
        break;
      case 2: 
        clinica.listarAnimais();
        voltarListagem = Entrada.lerInt("Digite qualquer número para voltar para o menu de listagem: ");
        opcoesListarCadastros();
        break;
      case 3: 
        clinica.listarAnimaisParaAdocao();
         voltarListagem = Entrada.lerInt("Digite qualquer número para voltar para o menu de listagem: ");
        opcoesListarCadastros();
        break;
      case 4: menuCadastro();
        break;
      default: System.out.println("Opção inválida. Tente novamente.");
        opcoesListarCadastros();
        break;

    } 


    }

  public void opcoesCadastrar(){
    int operadorCadastro;
    System.out.println("+----------------------------------------------+");
    System.out.println("|Qual das seguintes opções você quer cadastrar?|");
    System.out.println("+----------------------------------------------+");
    System.out.println("|1- Donos e seus pets.                         |");
    System.out.println("+----------------------------------------------+");
    System.out.println("|2- Pets para adoção                           |");
    System.out.println("+----------------------------------------------+");
    System.out.println("|3- Voltar ao menu de Cadastro                 |");
    System.out.println("+----------------------------------------------+");

    do{
       operadorCadastro = Entrada.lerInt("Digite o número correspondente a sua escolha: ");
    } while (operadorCadastro < 1 || operadorCadastro > 3);
    switch(operadorCadastro){
      case 1: 
        clinica.cadastrarDonoComSeusPets();
        int voltarOpcoesCadastrar = Entrada.lerInt("Digite qualquer número para voltar para as opções de cadastro: ");
        opcoesCadastrar();
        break;
      case 2: 
        clinica.cadastrarAnimalParaAdocao();
        voltarOpcoesCadastrar = Entrada.lerInt("Digite qualquer número para voltar para as opções de cadastro:");
        opcoesCadastrar();
        break;
      case 3:
        menuCadastro();
        break;
        default: System.out.println("Opção inválida. Tente novamente.");
        opcoesCadastrar();
        break;
    }


  }

  public void opcoesRemoverCadastro(){
    int operadorRemoverCadastro;
    System.out.println("+----------------------------------------------+");
    System.out.println("Qual das seguintes opções você quer remover |");
    System.out.println("+----------------------------------------------+");
    System.out.println("|1- Donos                                      |");
    System.out.println("+----------------------------------------------+");
    System.out.println("|2- Pets                                       |");
    System.out.println("+----------------------------------------------+");
    System.out.println("|3- Pets para adoção                           |");
    System.out.println("+----------------------------------------------+");
    System.out.println("|4- Voltar ao menu de Cadastro                 |");
    System.out.println("+----------------------------------------------+");

    do {  
    operadorRemoverCadastro = Entrada.lerInt("Digite o número correspondente a sua escolha: ");
    } while (operadorRemoverCadastro < 1 || operadorRemoverCadastro > 4);
    switch(operadorRemoverCadastro){
      case 1:
        clinica.removerDono();
        int voltarOpcoesRemover = Entrada.lerInt("Digite qualquer número para voltar para as opções de remover cadastro: ");
        opcoesRemoverCadastro();
        break;
        case 2:
        clinica.removerAnimal();
       voltarOpcoesRemover = Entrada.lerInt("Digite qualquer número para voltar para as opções de remover cadastro: ");
        opcoesRemoverCadastro();
        break;
        case 3:
        clinica.removerAnimalParaAdocao();
        voltarOpcoesRemover = Entrada.lerInt("Digite qualquer número para voltar para as opções de remover cadastro: ");
        opcoesRemoverCadastro();
        break;
      case 4:
        menuCadastro();
        break;
        default: System.out.println("Opção inválida. Tente novamente.");
        opcoesRemoverCadastro();
        break;


    }


  }


  public void menuAgendar(){
    int operadorMenuAgendar;
    System.out.println("                                              ");
    System.out.println("+--------------------------------------------+");
    System.out.println("|              Menu Agendar                  |");
    System.out.println("+--------------------------------------------+");
    System.out.println("| 1 - Agendar Campanha de Vacinação          |");
    System.out.println("+--------------------------------------------+");
    System.out.println("| 2 - Agendar Consulta                       |");
    System.out.println("+--------------------------------------------+");
    System.out.println("| 3 - Agendar Exame                          |");
    System.out.println("+--------------------------------------------+");
    System.out.println("| 4 - Agendar Cirurgia                       |");
    System.out.println("+--------------------------------------------+");
    System.out.println("| 5 - Voltar ao Menu Principal               |");
    System.out.println("+--------------------------------------------+");
    System.out.println("                                               ");
    do {  
    operadorMenuAgendar = Entrada.lerInt("Digite o número correspondente a sua escolha: ");
    } while (operadorMenuAgendar< 1 || operadorMenuAgendar > 5);
    switch (operadorMenuAgendar){
      case 1: 
        clinica.agendarCampanhaVacinacao();
        int voltarOpcoesAgendar = Entrada.lerInt("Digite qualquer número para voltar para as opções de agendamento: ");
        menuAgendar();
        break;
      case 2: 
        clinica.agendarConsulta();
        voltarOpcoesAgendar = Entrada.lerInt("Digite qualquer número para voltar para as opções de agendamento: ");
        menuAgendar();
        break;
      case 3: 
        clinica.agendarExame();
        System.out.println("");
        voltarOpcoesAgendar = Entrada.lerInt("Digite qualquer número para voltar para as opções de agendamento: ");
        System.out.println("");
        menuAgendar();
        break;
      case 4: 
        clinica.agendarCirurgia();
        System.out.println("");
        voltarOpcoesAgendar = Entrada.lerInt("Digite qualquer número para voltar para as opções de agendamento: ");
        System.out.println("");
        menuAgendar();

        break;
      case 5:
        System.out.println("");
        menuPrincipal();
        break;

      default: System.out.println("Opção inválida. Tente novamente.");
        menuAgendar();
        break;
    }
  }

  public void menuGerenciar() {
      int operadorMenuGerenciar;

      System.out.println("                                              ");
      System.out.println("+--------------------------------------------+");
      System.out.println("|              Menu Gerenciar                 |");
      System.out.println("+--------------------------------------------+");
      System.out.println("| 1 - Gerenciar Consulta                     |");
      System.out.println("+--------------------------------------------+");
      System.out.println("| 2 - Gerenciar Cirurgia                     |");
      System.out.println("+--------------------------------------------+");
      System.out.println("| 3 - Gerenciar Exame                        |");
      System.out.println("+--------------------------------------------+");
      System.out.println("| 4 - Gerenciar Campanha de Vacinação        |");
      System.out.println("+--------------------------------------------+");
      System.out.println("| 5 - Gerenciar Histórico de visita          |");
      System.out.println("+--------------------------------------------+");
      System.out.println("| 6 - Voltar ao menu principal               |");
      System.out.println("+--------------------------------------------+");

      do {
          operadorMenuGerenciar = Entrada.lerInt("Digite o número correspondente a sua escolha: ");
      } while (operadorMenuGerenciar < 1 || operadorMenuGerenciar > 6);

      switch (operadorMenuGerenciar) {
          case 1:
              System.out.println("Exibindo prontuários de consutlas.");
              clinica.exibirProntuariosConsulta();
          System.out.println("");
          int voltarMenuGerenciar = Entrada.lerInt("Digite qualquer número para voltar para o menu de gerenciar: ");
          System.out.println("");
          menuGerenciar();
              break;
          case 2:
              System.out.println("Exibindo prontuários de cirurgias");
              clinica.exibirProntuariosCirurgia();
          System.out.println("");
          voltarMenuGerenciar = Entrada.lerInt("Digite qualquer número para voltar para o menu de gerenciar: ");
          System.out.println("");
          menuGerenciar();
              break;
          case 3:
              int operadorEscolhaExame = 0; 
              System.out.println("Escolha 1 para exibir os exames realizados e 2 para atualizar o resultado de um exame específico");
              while (operadorEscolhaExame < 1 || operadorEscolhaExame > 2) {
                  operadorEscolhaExame = Entrada.lerInt("Digite o número correspondente a sua escolha");
                  if (operadorEscolhaExame == 1) {
                      System.out.println("Exibindo exames realizados");
                      clinica.exibirExames();
                  } else {
                      System.out.println("Atualizando resultado de um exame específico");
                      clinica.alterarResultadoExame();

                  }
              }
          System.out.println("");
          voltarMenuGerenciar = Entrada.lerInt("Digite qualquer número para voltar para o menu de gerenciar: ");
          System.out.println("");
          menuGerenciar();
              break;
          case 4:
              System.out.println("Escolha 1 para exibir as campanhas de vacinação e 2 para emitir certificado para algum animal que foi vacinado na campanha");
              int operadorEscolhaCampanha = 0; 
              while (operadorEscolhaCampanha < 1 || operadorEscolhaCampanha > 2) {
                  operadorEscolhaCampanha = Entrada.lerInt("Digite o número correspondente a sua escolha");
                  if (operadorEscolhaCampanha == 1) {
                      System.out.println("Exibindo campanhas de vacinação");
                      clinica.exibirCampanhas();
                  } else {
                      System.out.println("Emitindo certificado para algum animal que foi vacinado na campanha");
                      clinica.emitirCertificadoVacina();

                  }
              }
          System.out.println("");
          voltarMenuGerenciar = Entrada.lerInt("Digite qualquer número para voltar para o menu de gerenciar: ");
          System.out.println("");
          menuGerenciar();
              break;

          case 5:
              clinica.HistoricoVisita();
          System.out.println("");
          voltarMenuGerenciar = Entrada.lerInt("Digite qualquer número para voltar para menu de gerenciar");
          System.out.println("");
          menuGerenciar();
              break;
          case 6:
          System.out.println("");
          menuPrincipal();
          break;
          default:
              System.out.println("Opção inválida. Tente novamente.");
              menuGerenciar();
              break;

      }
  }

}