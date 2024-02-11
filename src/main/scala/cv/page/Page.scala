package cv.page

import org.scalajs.dom
import org.scalajs.dom.html
import scalatags.JsDom
import scalatags.JsDom.all._

case class Page(button: html.LI, pageContent: JsDom.TypedTag[dom.Element])

object Page {
  def apply(text: String, content: JsDom.TypedTag[dom.Element]): Page = Page(
    li(
      a(text, href := "#", `class` := "pure-menu-link"),
      `class` := "pure-menu-item"
    ).render,
    content
  )
}
