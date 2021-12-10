package domain.command;

import domain.Consulta;
import domain.Pregunta;

import java.util.List;

public class PreguntaBinaria implements Pregunta {
  @Override
  public void asociarConsulta(Consulta consulta) {

  }

  @Override
  public List<Consulta> obtenerListadoDeConsultasAsociadas() {
    return null;
  }

  @Override
  public void quitarConsulta(Consulta consulta) {

  }

  @Override
  public void respuesta(Consulta consulta, String respuesta) {

  }
}
