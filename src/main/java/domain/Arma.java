package domain;

import javax.persistence.Entity;

@Entity
public class Arma extends Item {

  private int costo;
  private int defensa;
  private int ataque;
  private String nombre;

  public Arma(){

  }

}
