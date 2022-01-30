package domain;

import java.util.List;

public class PremioBuilder {

  private String descripcion;
  private List<Jurado> jurados;
  private List<Sponsor> sponsors;
  private Categoria categoria;
  private Edicion edicion;

  public PremioBuilder agregarDescrpción(String description) {
    this.descripcion = description;
    return this;
  }

  public PremioBuilder agregarJurados(List<Jurado> jurados) {
    this.jurados = jurados;
    return this;
  }

  public PremioBuilder agregarSponsors(List<Sponsor> sponsors) {
    this.sponsors = sponsors;
    return this;
  }

  public PremioBuilder agregarCategoria(Categoria categoria) {
    this.categoria = categoria;
    return this;
  }

  public PremioBuilder agregarEdicion(Edicion edicion){
    this.edicion = edicion;
    return this;
  }

  public Premio crearPremio(){
    return new Premio(descripcion,categoria,jurados,sponsors,edicion);
  }

}