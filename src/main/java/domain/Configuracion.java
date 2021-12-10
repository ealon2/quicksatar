package domain;

public interface Configuracion {

  void iniciar();
  void finalizar();
  void pausar();

  void asociarConsulta(Consulta consulta);
}
