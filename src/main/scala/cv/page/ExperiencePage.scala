package cv.page

import cv.components.PeriodItem
import scalatags.JsDom.all._

object ExperiencePage {

  private def experienceEntry(description: String, stack: String) =
    div(description, br, b("Stack: "), stack)

  private val content =
    div(
      h1(style := "text-align: center;", "Experience"),
      style := "padding-left: 6em; padding-right: 6em; margin-top: 2em;",
      PeriodItem(
        "Software Engineer (Streaming Platform)",
        "Wolt",
        "Aug 2022",
        "Present",
        experienceEntry(
          "Support of existing streaming solutions and development and integration of new approaches to data streaming - streaming platform and data lakehouse",
          "Scala, Python, Spark, Flink, Kafka, AWS"
        )
      ).toElement,
      PeriodItem(
        "Back-end/Data Engineer",
        "Kryptonite",
        "Jul 2020",
        "Jul 2022",
        experienceEntry(
          "Development of back-end services and ETL jobs for data analysis applications.",
          "Scala, Spark, Kafka, ClickHouse, Elasticsearch, CockroachDB, Kubernetes"
        )
      ).toElement,
      PeriodItem(
        "Data Warehouse Specialist",
        "OJSC \"Trading System Administrator\"",
        "Nov 2018",
        "Jun 2020",
        experienceEntry(
          "Support and development of data warehouse and solutions based on it.",
          "Python, SQL, Tableau, JavaScript"
        )
      ).toElement,
      PeriodItem(
        "Mathematician-Analyst",
        "LLC \"Inform-podderzhka\"",
        "Jul 2018",
        "Sep 2018",
        experienceEntry(
          "Development of logistics algorithms, data analysis and processing.",
          "Python, SQL, OpenStreetMap API"
        )
      ).toElement,
      PeriodItem(
        "Researcher",
        "Institute of Control Sciences",
        "Nov 2015",
        "Jun 2018",
        experienceEntry(
          "Programming of control systems, analysis and tuning of controller models.",
          "MATLAB, Simulink, Control Design Toolbox"
        )
      ).toElement
    )

  val page = Page("Experience", content)

}
