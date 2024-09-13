package cv.behaviour

import cv.page.Page
import org.scalajs.dom
import org.scalajs.dom.html.Div
import org.scalajs.dom.{HTMLElement, document, html, window}
import scalatags.JsDom
import scalatags.JsDom.all._

import scala.scalajs.js.timers.setTimeout

object PageBehaviour {

  def changePageBehaviour(pages: Seq[Page], content: HTMLElement): Unit =
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

  private val pageBreaks: Set[Int] = Set(1, 2)

  def printBehaviour(
      fullPage: JsDom.TypedTag[Div],
      printButton: html.LI,
      panel: JsDom.TypedTag[Div],
      pages: Seq[Page],
      content: html.Div
  ): Unit = printButton.addEventListener(
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
      document.body.appendChild(fullPage.render)
      content.innerHTML = ""
      content.appendChild(pages(0).pageContent.render)
    }
  )

}
