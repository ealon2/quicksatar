package domain.command;

import domain.Pregunta;

public class PreguntaTextoLibre implements Pregunta {

  @Override
  public boolean esObligatoria() {
    return false;
  }

  @Override
  public void respuesta(String respuesta) {

  }
}
