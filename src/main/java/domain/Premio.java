package domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Premio {

  private String descripcion;
  private Categoria categoria;
  private List<Jurado> jurados;
  private List<Sponsor> sponsors;
  private Edicion edicion;

}
