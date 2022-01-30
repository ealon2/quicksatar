package controller;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class LoginController {

  public ModelAndView show(Request request, Response response) {
    return new ModelAndView(null,"login.html.hbs");
  }

  public ModelAndView login(Request request, Response response) {
    //TODO: Validar el POST con los datos para iniciar sesión
    return null;
  }

  public ModelAndView showSignUp(Request request, Response response) {
    return new ModelAndView(null,"signup.html.hbs");
  }

  public ModelAndView signUp(Request request, Response response) {
    //TODO: Validar el POST con los datos a registrase
    return null;
  }

  public ModelAndView logout(Request req, Response res) {
    req.session().attribute("user_id", null);
    res.redirect("/");
    return null;
  }
}
