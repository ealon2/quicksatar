package controller;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HomeController {
  public ModelAndView index(Request request, Response response) {
    return new ModelAndView(obtenerSesion(request, response), "home.html.hbs");
  }

  public Map<String, Object> obtenerSesion(Request request, Response response) {
    Map<String, Object> model = new HashMap<>();
    model.put("sesioniniciada", !Objects.isNull(request.session().attribute("user_id")));
    model.put("user", request.session().attribute("user"));
    return model;
  }
  public ModelAndView error(Request request, Response response) {
    return new ModelAndView(null,"error.html.hbs");
  }
}
