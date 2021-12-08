package domain.command;

import domain.Grupo;
import domain.Solicitud;

public class SolicitudCerrarGrupo implements Solicitud {

  private Grupo grupo;

  //Inyección de dependencia
  public SolicitudCerrarGrupo(Grupo grupo){
    this.grupo = grupo;
  }

  @Override
  public void ejecutar() {
    grupo.cerrarGrupo();
    //TODO: Crear URL GITHUB
  }

}
