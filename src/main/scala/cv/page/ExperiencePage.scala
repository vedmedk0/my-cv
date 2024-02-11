package cv.page

import scalatags.JsDom.all._

object ExperiencePage {

  private val content =
    div(
      table(
        `class` := "pure-table",
        thead(
          tr(th("HEAD"))
        )
      ),
      tbody(tr(td("BODY")))
    )

  val page = Page("Experience", content)

}
