package domain.command;

import domain.Consulta;
import domain.Pregunta;

import java.util.List;

public class PreguntaMultivaluada implements Pregunta {


  @Override
  public boolean esObligatoria() {
    return false;
  }

  @Override
  public void respuesta(String respuesta) {

  }
}
