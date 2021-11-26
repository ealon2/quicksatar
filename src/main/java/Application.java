import org.uqbarproject.jpa.java8.extras.export.JpaSchemaExport;
import server.Router;
import spark.Spark;
import spark.debug.DebugScreen;

public class Application {
  public static void main(String[] args) throws Exception {
    Spark.port(8080);
    JpaSchemaExport.execute("db", "schema.sql", true, true);
    DebugScreen.enableDebugScreen();
    Router.configure();
  }
}
