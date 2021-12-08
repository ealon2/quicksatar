package domain.command;

import domain.Estudiante;
import domain.Grupo;
import domain.Solicitud;

public class SolicitudAlta implements Solicitud {

  private final Grupo grupo;
  private final Estudiante estudiante;

  SolicitudAlta(Grupo grupo, Estudiante estudiante){
    this.grupo = grupo;
    this.estudiante = estudiante;
  }

  @Override
  public void ejecutar() {
    this.grupo.desinscripcion(estudiante);
    //TODO: Bajarlo de Github
  }
  
}
