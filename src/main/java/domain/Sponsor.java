package domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.awt.*;

@Data
@AllArgsConstructor
public class Sponsor {
  private String nombre;
  private Image image;

}
