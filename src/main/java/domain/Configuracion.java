package domain;

public interface Configuracion {

  public void start();
  public void stop();
  public void pause();

  void asociarConsulta(Consulta consulta);
}
