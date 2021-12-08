package domain;

public class Estudiante implements Notificacion,Usuario {

  private final Medio medio;
  private final String nombre;

  public Estudiante(Medio medio, String nombre){
    this.medio = medio;
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void notificar (Accion accion, Estudiante estudiante){
    medio.enviar("El estudiante " + estudiante.getNombre() + "se dio de " + accion);
  }

}
