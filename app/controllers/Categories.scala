package controllers

import play.api._
import play.api.mvc._

class Categories extends Controller {

  def index = Action {
    Ok("Ok")
  }

  def store = Action {
    Ok("Ok")
  }

  def view(id: Long) = Action {
    Ok("Ok")
  }

  def update(id: Long) = Action {
    Ok("Ok")
  }

  def destroy(id: Long) = Action {
    Ok("Halo" + id)
  }

}
