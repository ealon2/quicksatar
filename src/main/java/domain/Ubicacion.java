package domain;

import persistence.PersistenceObject;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
public class Ubicacion extends PersistenceObject{

  @Embedded
  private Coordenadas coordenadas;
  private String nombre;

  public Ubicacion(){

  }

}
