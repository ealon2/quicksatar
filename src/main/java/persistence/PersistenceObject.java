package persistence;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class PersistenceObject {
  @Id
  @GeneratedValue
  protected long id;

  public long getId() {
    return id;
  }
}
