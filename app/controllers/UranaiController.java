package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.top;

public class UranaiController extends Controller {

    public Result showTop() {
        return ok(top.render());
    }
}
