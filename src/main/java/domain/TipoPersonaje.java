package domain;

public enum TipoPersonaje {
  HECHICERO {
    @Override
    public void comerciar(Item item, TipoPersonaje otro) {
      //TODO
    }

    @Override
    public void pelear(TipoPersonaje otro) {
      //TODO
    }

    @Override
    public void buscarItem(Ubicacion ubicacion) {
      //TODO
    }
  },
  COMERCIANTE {
    @Override
    public void comerciar(Item item, TipoPersonaje otro) {
      //TODO
    }

    @Override
    public void pelear(TipoPersonaje otro) {
      //TODO
    }

    @Override
    public void buscarItem(Ubicacion ubicacion) {
      //TODO
    }
  },
  GUERRERO {
    @Override
    public void comerciar(Item item, TipoPersonaje otro) {
      //TODO
    }

    @Override
    public void pelear(TipoPersonaje otro) {
      //TODO
    }

    @Override
    public void buscarItem(Ubicacion ubicacion) {
      //TODO
    }
  };
  public abstract void comerciar(Item item,TipoPersonaje otro);
  public abstract void pelear(TipoPersonaje otro);
  public abstract void buscarItem(Ubicacion ubicacion);
}
