package domain;

import java.util.List;

public class Consulta {

  private Configuracion configuracion;
  private Tipo tipo;
  private List<Usuarios> consultados;
  private String link;

  Consulta (Configuracion configuracion, Tipo tipo){
    this.configuracion = configuracion;
    configuracion.asociarConsulta(this);
    this.tipo = tipo;
  }

  public void iniciarConsulta(){
    configuracion.start();
  }

  public void pausarConsulta(){
    configuracion.pause();
  }

  public void finalizar(){
    configuracion.stop();
    notificarEncuestaCerrada();
  }

  public String obtenerLink(){
    return link;
  }

  public Tipo obtenerTipo(){
    return tipo;
  }

  public void notificarEncuestaCerrada(){
    consultados.stream().forEach(usuarios -> usuarios.notificar("Encuesta Cerrada"));
  }

}
