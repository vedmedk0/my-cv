package cv.page

import scalatags.JsDom.all.{h4, _}

object AchievementsPage {

  private val content = div(
    style := "padding-left: 5em; padding-right: 5em;",
    h1(style := "text-align: center;", "Achievements"),
    h4("Wolt"),
    ul(
      li(
        "Developed solution for monitoring data warehouse tasks, ETL and dashboard, increasing visibility"
      ),
      li(
        "Introduced proof of concept project that layered foundation for future datalake solution"
      ),
      li(
        "Heavily contributed to streaming platform foundation and modules architecture"
      )
    ),
    h4("Kryptonite"),
    ul(
      li(
        "Improved a geospatial data aggregation algorithm, made it more accurate."
      ),
      li(
        "Made experiments with different solutions for embedding indexation. Analyzed the result, and picked the most effective solution. Made this solution production-ready."
      ),
      li(
        "Conducted interviews for interns. Chose the best candidate, led and mentored them, strengthened the development team."
      )
    ),
    h4("OJSC \"Trading System Administrator\""),
    ul(
      li(
        "Made the system of tags and filters for the catalog of analytical variables in data warehouse more convenient for end-user."
      ),
      li(
        "Proposed and implemented testing framework for data mart loader. As a result, the quality of the code used in production has improved."
      ),
      li(
        "Proposed CRUD application project for data mart loading, required to replace an existing proprietary CRUD application. Created working prototype."
      )
    ),
    h4("LLC \"Inform-podderzhka\""),
    ul(
      li(
        "Developed a graphical interface for visualizing the result of the algorithm in the static problem of cargo assignment."
      ),
      li(
        "Developed a dynamic model of cargo transportation to test the effectiveness of various cargo assignment algorithms."
      ),
      li(
        "Developed framework for loading data into factor analysis module."
      )
    ),
    h4("Institute of Control Sciences"),
    ul(
      li(
        "Developed adaptive controller with predicting model of vertical position of math model of plasma in tokamak T-15."
      ),
      li(
        "Developed controller with predicting model for controlling form of plasma in math model of tokamak Globus-M."
      ),
      li(
        "Published 3 papers, made a report at the international Pyatnitsky conference."
      )
    )
  )

  val page = Page("Achievements", content)

}
