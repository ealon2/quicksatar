package domain;

import javax.persistence.Entity;

@Entity
public class Accesorio extends Item{

  private int costo;
  private String nombre;

  public Accesorio(){

  }

}
