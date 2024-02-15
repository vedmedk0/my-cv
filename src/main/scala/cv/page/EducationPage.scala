package cv.page

import cv.components.PeriodItem
import scalatags.JsDom.all._

object EducationPage {

  private val content =
    div(
      h1(style := "text-align: center;", "Education"),
      style := "padding-left: 6em; padding-right: 6em; margin-top: 2em;",
      PeriodItem(
        "Master's degree",
        "Moscow State University",
        "2016",
        "2018",
        div(
          "Faculty of Physics, Division of Applied Mathematics, Department of Physical-Mathematical Control Methods, Specialization \"System analysis, mathematical modeling and control theory\""
        )
      ).toElement,
      PeriodItem(
        "Bachelor's degree",
        "Moscow State University",
        "2012",
        "2016",
        div(
          "Faculty of Physics, Specialization \"Physics\""
        )
      ).toElement
    )

  val page = Page("Education", content)

}
