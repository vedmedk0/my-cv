package cv.page

import cv.components.PeriodItem
import scalatags.JsDom.all._

object EducationPage {

  private val content =
    div(
      style := "padding-left: 10em; padding-right: 10em; margin-top: 2em;",
      PeriodItem(
        "Header",
        "SubHeader",
        "2020",
        "2050",
        div(style := "color:red;", "some content")
      ).toElement
    )

  val page = Page("Experience", content)

}
