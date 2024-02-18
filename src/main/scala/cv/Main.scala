package cv

import cv.page._
import org.scalajs.dom
import org.scalajs.dom.{document, window}
import scalatags.JsDom.all._

import scala.scalajs.js.annotation.{JSExport, JSExportTopLevel}
import scala.scalajs.js.timers._

@JSExportTopLevel("Main")
object Main {

  val pages = Seq(
    AboutMePage.page,
    EducationPage.page,
    ExperiencePage.page,
    AchievementsPage.page
  )

  val pageBreaks: Set[Int] = Set(1, 2)

  val content = div(pages(0).pageContent).render

  pages.foreach { case Page(b, c) =>
    b.addEventListener(
      "click",
      { (_: dom.MouseEvent) =>
        content.setAttribute("class", "fade-out")
        setTimeout(300) {
          content.innerHTML = ""
          content.appendChild(c.render)
          content.setAttribute("class", "fade-in")
        }
      }
    )
  }

  val printButton = li(
    `class` := "pure-menu-item",
    a("Print", href := "#", `class` := "pure-menu-link")
  ).render

  printButton.addEventListener(
    "click",
    { (_: dom.MouseEvent) =>
      content.innerHTML = ""
      panel.render.remove()
      pages.zipWithIndex.foreach { case (Page(_, c), i) =>
        content.appendChild(c.render)
        if (pageBreaks.contains(i))
          content.appendChild(div(`class` := "page-break").render)
      }
      window.print()
      document.body.innerHTML = ""
      document.body.appendChild(page.render)
      content.innerHTML = ""
      content.appendChild(pages(0).pageContent.render)
    }
  )

  val panel = div(
    `class` := "pure-menu-horizontal menu",
    style := "display: inline-flex;",
    span(`class` := "pure-menu-heading", "Curriculum vitae"),
    div(
      `class` := "pure-u-12-24",
      ul(`class` := "pure-menu-list", pages.map(_.button))
    ),
    div(
      style := "text-align: right;",
      `class` := "pure-u-12-24",
      ul(
        `class` := "pure-menu-list",
        printButton
      )
    )
  )

  val page = div(
    style := "font-family: monospace; font-size: 1.25em",
    panel,
    content
  )

  @JSExport
  def main(): Unit = {
    document.body.appendChild(page.render)
  }
}
