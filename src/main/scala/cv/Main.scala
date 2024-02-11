package cv

import cv.page._
import org.scalajs.dom
import org.scalajs.dom.document
import scalatags.JsDom.all._

import scala.scalajs.js.annotation.{JSExport, JSExportTopLevel}

@JSExportTopLevel("Main")
object Main {

  val pages = Seq(
    Page(
      "Overview",
      h1("Header of my nice cv")
    ),
    AboutMePage.page,
    ExperiencePage.page
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
    `class` := "pure-menu-horizontal",
    style := "display: inline-flex;",
    span(`class` := "pure-menu-heading", "Curriculum vitae"),
    ul(`class` := "pure-menu-list", pages.map(_.button))
  )

  val page = div(
    style := "font-family: monospace",
    panel,
    content
  )

  @JSExport
  def main(): Unit = {
    document.body.appendChild(page.render)
  }
}
