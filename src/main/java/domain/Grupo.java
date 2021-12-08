package domain;

import repository.Estudiantes;

import java.util.EmptyStackException;

/**
 * Req 1. Como docente, deseo poder crear N grupos de trabajo de un tamaño ideal M, vacíos, para permitir
 * la inscripción de estudiantes a cada grupo
 *
 * Req 2. Como estudiante, deseo poder inscribirme o darme de baja instantáneamente de un grupo abierto.
 *
 * Req 3.
 */
public class Grupo {

  private int tamanno;

  /**
   *
   * @param tamanno limite superior de estudiantes que puede admitir el grupo.
   */
  Grupo (int tamanno){

  }

  public void inscripcion (Estudiante estudiante){
    estudiante.inscribirme(this);
    Estudiantes.getInstancia().alta(this,estudiante);
  }

  public void desinscripcion (Estudiante estudiante){
    estudiante.desinscribirme(this);
    Estudiantes.getInstancia().baja(this,estudiante);
  }

}
