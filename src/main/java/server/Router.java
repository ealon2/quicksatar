package server;

import controller.HomeController;
import controller.LoginController;
import controller.PremioController;
import spark.Spark;
import spark.template.handlebars.HandlebarsTemplateEngine;

public class Router {
  public static void configure() {
    Spark.staticFileLocation("/public");
    HandlebarsTemplateEngine engine = new HandlebarsTemplateEngine();

    HomeController home = new HomeController();
    PremioController premioController = new PremioController();
    LoginController loginController = new LoginController();

    //Rutas generales
    Spark.get("/", home::index, engine);
    Spark.get("/login", loginController::show, engine);
    Spark.post("/login", loginController::login, engine);
    Spark.get("/logout", loginController::logout, engine);
    Spark.get("/signup", loginController::showSignUp, engine);
    Spark.post("/signup", loginController::signUp, engine);
    Spark.get("/error", home::error, engine);
  }
}
