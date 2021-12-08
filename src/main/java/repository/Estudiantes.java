package repository;

import domain.Estudiante;
import domain.Grupo;
import domain.Accion;

import java.util.HashMap;

public class Estudiantes {
  private static HashMap<Grupo, Estudiante> listado;
  private static final Estudiantes instancia = new Estudiantes();

  private Estudiantes(){
      listado = new HashMap<>();
  }

  public static Estudiantes getInstancia(){
    return instancia;
  }

  public void alta(Grupo grupo, Estudiante estudiante){

    listado.put(grupo,estudiante);

    listado.entrySet().stream()
        .filter( map -> map.getKey() == grupo)
        .forEach(map -> map.getValue().notificar(Accion.ALTA,estudiante));

  }

  public void baja(Grupo grupo, Estudiante estudiante){

    listado.remove(grupo,estudiante);

    listado.entrySet().stream()
        .filter( map -> map.getKey() == grupo)
        .forEach(map -> map.getValue().notificar(Accion.BAJA,estudiante));
  }

  public long cantidadInscriptos(Grupo grupo){
    return listado.entrySet().stream().filter(map->map.getKey().equals(grupo)).count();
  }

}
