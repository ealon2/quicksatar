package domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.awt.*;

@Data
@AllArgsConstructor
public class Jurado {
  private String nombre;
  private String apellido;
  private Cargo cargo;
  private String link;
  private Image image;

}
