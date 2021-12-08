package domain;

import repository.Estudiantes;

/**
 * Req 1. Como docente, deseo poder crear N grupos de trabajo de un tamaño ideal M, vacíos, para permitir
 * la inscripción de estudiantes a cada grupo
 *
 * Req 2. Como estudiante, deseo poder inscribirme o darme de baja instantáneamente de un grupo abierto.
 *
 * Req 3.
 */
public class Grupo {

  private final String nombre;
  private final int tamanno;
  private Estado estado;

  /**
   *
   * @param tamanno tamaño ideal de estudiantes dentro del grupo.
   * @param nombre nombre del grupo.
   */
  Grupo (int tamanno, String nombre){
    this.tamanno = tamanno;
    this.nombre = nombre;
    this.estado = Estado.ABIERTO;
  }

  public void inscripcion (Estudiante estudiante) throws RuntimeException{
    if (Estudiantes.getInstancia().cantidadInscriptos(this) <= tamanno) {
      Estudiantes.getInstancia().alta(this, estudiante);
    } else throw new RuntimeException("No hay cupo");
  }

  public void desinscripcion (Estudiante estudiante){
    Estudiantes.getInstancia().baja(this,estudiante);
  }

  public void cerrarGrupo() {
    estado.CERRADO();
  }
}
