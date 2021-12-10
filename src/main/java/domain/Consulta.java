package domain;

import java.util.List;

public class Consulta {

  private Configuracion configuracion;
  private Tipo tipo;
  private List<Usuarios> consultados;
  private Link link;

  Consulta (Configuracion configuracion, Tipo tipo, Link link){
    this.configuracion = configuracion;
    configuracion.asociarConsulta(this);
    this.tipo = tipo;
    this.link = link;
  }

  public void iniciarConsulta(){
    configuracion.iniciar();
  }

  public void pausarConsulta(){
    configuracion.pausar();
  }

  public void finalizarConsulta(){
    configuracion.finalizar();
    notificarEncuestaCerrada();
  }

  public String obtenerLink(){
    return link.obtenerURL();
  }

  public Tipo obtenerTipo(){
    return tipo;
  }

  public void notificarEncuestaCerrada(){
    consultados.stream().forEach(
        usuarios -> usuarios.notificar("Encuesta Cerrada")
    );
  }

}
