package domain;

import java.util.List;

/**
 * Cada pregunta sabe a que tipo de Consulta corresponde.
 * Cada pregunta sabe si es Obligatoria o No.
 * Cada pregunta sabe a que Consulta corresponde. Es decir, puede ocurrir que una pregunta este
 * repetida en varias Consultas. Tomo este criterio, porque dado que puede ser util al momento
 * de realizar un reporte por pregunta.
 *
 */
public interface Pregunta {

  public void asociarConsulta(Consulta consulta);
  public List<Consulta> obtenerListadoDeConsultasAsociadas();
  void quitarConsulta(Consulta consulta);
  public void respuesta(Consulta consulta, String respuesta);

}
