package domain;

import persistence.PersistenceObject;

import javax.persistence.*;
import java.util.List;

@Entity
public class Personaje extends PersistenceObject {

  private String nombre;
  private int moneda;

  @OneToMany
  @JoinColumn(name="item_id")
  private List<Item> items;

  @ManyToMany
  @OrderColumn (name="orden_visitas")
  private List <Ubicacion> ubicacionesVisitadas;

  @OneToOne
  private Arma arma;

  @Enumerated
  private TipoPersonaje tipo;

  public Personaje(){

  }

}
