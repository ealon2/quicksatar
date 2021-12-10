package domain;

import java.util.List;

public class RepositorioDeConsultas {
  private List<Consulta> repositorio;
  private final static RepositorioDeConsultas instances = new RepositorioDeConsultas();


  private RepositorioDeConsultas(){
  }

  private static RepositorioDeConsultas instance(){
    return instances;
  }

  private void agregarConsulta(Consulta consulta){
    repositorio.add(consulta);
  }

  private void quitarConsulta(Consulta consulta){
    repositorio.remove(consulta);
  }

  private Consulta buscarConsulta(String link){
    return repositorio.stream()
        .filter(c -> c.obtenerLink().equals(link))
        .findFirst()
        .get();
  }


}
