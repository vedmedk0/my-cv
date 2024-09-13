package cv

import cv.behaviour.PageBehaviour
import cv.page._
import org.scalajs.dom.document
import org.scalajs.dom.html.Div
import scalatags.JsDom
import scalatags.JsDom.all._

import scala.scalajs.js.annotation.{JSExport, JSExportTopLevel}

@JSExportTopLevel("Main")
object Main {

  val pages = Seq(
    AboutMePage.page,
    EducationPage.page,
    ExperiencePage.page,
    AchievementsPage.page
  )

  val content: Div = div(pages(0).pageContent).render

  PageBehaviour.changePageBehaviour(pages, content)

  val printButton = li(
    `class` := "pure-menu-item",
    a("Print", href := "#", `class` := "pure-menu-link")
  ).render

  val panel: JsDom.TypedTag[Div] = div(
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

  val fullPage: JsDom.TypedTag[Div] = div(
    style := "font-family: monospace; font-size: 1.25em",
    panel,
    content
  )

  PageBehaviour.printBehaviour(fullPage, printButton, panel, pages, content)

  @JSExport
  def main(): Unit = {
    document.body.appendChild(fullPage.render)
  }
}
