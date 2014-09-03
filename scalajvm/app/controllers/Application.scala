package controllers

import play.api._
import play.api.mvc._
import shared.SharedMessages
import java.io.File

object Application extends Controller {

  def index = Action {
    Ok(views.html.index(SharedMessages.itWorks))
  }

  def scalajsFile(file: String) = Action {
    Ok.sendFile(new File(s"scalajs/$file"))
  }
}
