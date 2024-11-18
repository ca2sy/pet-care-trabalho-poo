import java.util.ArrayList;

public class Dono {
  private String nomeDono;  
  private int numeroTelefoneDono;
  private boolean Vip;
  private String tipoPlano;


  public Dono(String nomeDono, int numeroTelefoneDono, boolean Vip, String tipoPlano) {
    this.nomeDono = nomeDono;
    this.numeroTelefoneDono = numeroTelefoneDono;
    this.Vip = Vip;
    this.tipoPlano = tipoPlano;

  }

  public String getNomeDono() {
    return nomeDono;
  }

  public void setNomeDono(String nomeDono) {
    this.nomeDono = nomeDono;
  }

  public int getNumeroTelefoneDono() {
    return numeroTelefoneDono;
  }

  public void setNumeroTelefoneDono(int numeroTelefoneDono) {
    this.numeroTelefoneDono = numeroTelefoneDono;
  }

  public boolean getVip() {
    return Vip;
  }

  public void setVip(boolean vip) {
    Vip = vip;
  }

  public String getTipoPlano() {
    return tipoPlano;
  }

  public void setTipoPlano(String tipoPlano) {
    this.tipoPlano = tipoPlano;
  }


}