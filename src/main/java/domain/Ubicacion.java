package domain;

import persistence.PersistenceObject;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Ubicacion extends PersistenceObject{

  @Embedded
  private Coordenadas coordenadas;
  private String nombre;

  @OneToMany
  @JoinColumn(name = "ubicacion_id")
  private Set<Item> items;

  public Ubicacion(){

  }

}
