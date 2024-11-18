public class AnimaisParaAdocao extends Animal {
  private boolean castrado;

  public AnimaisParaAdocao(String especie, String nomeAnimal, int idadeAnimal, String historicoDeSaude, boolean castrado){
    super(especie, nomeAnimal, idadeAnimal, historicoDeSaude);
    this.castrado = castrado;

  }
  public boolean getCastrado() {
    return castrado;
  }

  public void setCastrado(boolean castrado) {
    this.castrado = castrado;
  }

      }