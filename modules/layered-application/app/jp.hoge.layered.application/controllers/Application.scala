package jp.hoge.layered.application.controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("this is a test page."))
  }

}