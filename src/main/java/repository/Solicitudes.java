package repository;

import domain.Solicitud;
import domain.Usuario;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Implemento patron Singleton para la generación de la clase.
 * Hago uso del patron Command para la ejecución de las acciones.
 */
public class Solicitudes {
  private static Solicitudes instancia = new Solicitudes();
  private HashMap<Usuario,Solicitud> solicitudes;

  private Solicitudes(){
    this.solicitudes=new HashMap<>();
  }

  public static Solicitudes instancia(){
    return instancia;
  }

  public void agregar(Usuario usuario,Solicitud solicitud){
    solicitudes.put(usuario,solicitud);
  }

  public void quitar(Usuario usuario,Solicitud solicitud){
    solicitudes.remove(usuario,solicitud);
  }

  /**
   * @param usuario el usuario es quien desea aprobar la solicitud
   * @param solicitud la solicitud puede ser de diferentes tipos, creado tanto por estudiantes/docentes
   * @throws RuntimeException
   */
  public void aprobar(Usuario usuario, Solicitud solicitud) throws RuntimeException{
    solicitud.ejecutar(); // falta validar que el usuario sea distinto
    quitar(usuario,solicitud);
  }

  /**
   * @param usuario el usuario es quien desea aprobar la solicitud
   * @param solicitud la solicitud puede ser de diferentes tipos, creado tanto por estudiantes/docentes
   * @throws RuntimeException
   */
  public void rechazar(Usuario usuario,Solicitud solicitud) throws RuntimeException{
    quitar(usuario,solicitud);
  }

  public List<Solicitud> misSolicitudes(Usuario usuario){
    return solicitudes.entrySet().stream()
        .filter(map->map.getKey().equals(usuario))
        .map(m->m.getValue())
        .collect(Collectors.toList());
  }

}
