package domain;

/**
 * Cada pregunta sabe si es Obligatoria o No.
 */
public interface Pregunta {
  boolean esObligatoria();
  void respuesta(String respuesta);
}
