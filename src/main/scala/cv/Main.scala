package cv

import cv.page.Page
import org.scalajs.dom
import org.scalajs.dom.document
import scalatags.JsDom.all._

import scala.scalajs.js.annotation.{JSExport, JSExportTopLevel}

@JSExportTopLevel("Main")
object Main {

  val pages = Seq(
    Page(
      button("Overview", `class` := "pure-button").render,
      h1("Header of my nice cv")
    ),
    Page(
      button("Experience", `class` := "pure-button").render,
      h1("My super job history")
    )
  )

  val content = div(pages(0).pageContent).render

  pages.foreach { case Page(b, c) =>
    b.addEventListener(
      "click",
      { (e: dom.MouseEvent) =>
        content.innerHTML = ""
        content.appendChild(c.render)
      }
    )
  }

  val panel = div(
    pages.map(_.button),
    style := "display: inline-flex;"
  )

  val page = div(
    panel,
    content
  )

  @JSExport
  def main(): Unit = {
    document.body.appendChild(page.render)
  }
}
