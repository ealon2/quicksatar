package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PremiosTest {
  private PremioBuilder premioBuilder;

  @BeforeEach
  public void setup(){
    premioBuilder = new PremioBuilder();
  }

  @Test
  public void generarUnPremioTest(){
    Premio premio = premioBuilder
                      .agregarCategoria(Categoria.CIENCIA)
                      .agregarJurados(new ArrayList<Jurado>())
                      .agregarSponsors(new ArrayList<Sponsor>())
                      .agregarDescrpción("Test")
                      .agregarEdicion(Edicion.EDICION_2019)
                      .crearPremio();
  }
}
