package repository;

import domain.Entrega;
import domain.Grupo;
import domain.Medio;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.emptyList;

/**
 * Si bien se explica que hay TP y actividades de clase, su comportamiento es el mismo
 * por lo tanto, se modelara una sola clase para ambas
 */
public class Asignaciones {

  private String titulo;

  // Inyección de dependencias
  private final Medio medio;

  //Utilizo el patron Commands
  private List<Entrega> entregas = emptyList();

  //Utilizo el patron Strategy
  private List<Asignaciones> asignaciones = emptyList();

  public Asignaciones(String titulo, Medio medio) {
    this.titulo=titulo;
    this.medio=medio;
  }

  public void otorgarAccesosSiCorresponden(Grupo grupo) {
    List<Entrega> entregaAHabilitar =
        entregas.stream().filter(
            entrega -> entrega.noHabilitada() && entrega.esTiempoDeHabilitar())
            .collect(Collectors.toList());
  }

}
