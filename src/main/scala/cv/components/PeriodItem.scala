package cv.components

import org.scalajs.dom.html._
import scalatags.JsDom
import scalatags.JsDom.all._

case class PeriodItem(
    header: String,
    subHeader: String,
    startInterval: String,
    endInterval: String,
    content: JsDom.TypedTag[Div]
) {
  def toElement: JsDom.TypedTag[Table] = table(
    `class` := "pure-table pure-table-horizontal",
    style := "width: 100%; margin-top: 0.5em; margin-bottom: 0.5em",
    thead(
      tr(th(header))
    ),
    tbody(
      tr(
        td(
          h3(style := "margin-top: 0; margin-bottom: 0.2em", subHeader),
          div(
            `class` := "pure-g",
            div(`class` := "pure-u-1-5", startInterval + " - " + endInterval),
            div(`class` := "pure-u-4-5", content)
          )
        )
      )
    )
  )
}
