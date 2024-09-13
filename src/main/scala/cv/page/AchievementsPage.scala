package cv.page

import scalatags.JsDom.all.{h4, _}

object AchievementsPage {

  private val content = div(
    style := "padding-left: 5em; padding-right: 5em;",
    h1(style := "text-align: center;", "Achievements"),
    h4("Wolt"),
    ul(
      `class` := "cv-list",
      li(
        "Developed solution for monitoring data warehouse tasks, ETL and dashboard, increasing observability"
      ),
      li(
        "Introduced proof of concept project that layered foundation for future datalake platform solution that will enable previously unavailable approaches to analytics and making the addition of new datasets easier."
      ),
      li(
        "Layered an architectural foundation for the company-wide streaming platform. Contributed to the key components, improved developer experience and observability. Streaming platform provides data scientists and backend engineers with capability of analyzing and transforming real-time data streams, opening previously unavailable possibilities."
      )
    ),
    h4("Kryptonite"),
    ul(
      `class` := "cv-list",
      li(
        "Improved graph-based data-generating algorithm, improving developer experience and unblocking new approaches to data generation."
      ),
      li(
        "Improved geospatial data aggregation algorithm, making final result significantly accurate."
      ),
      li(
        "Conducted experiments with different solutions for faster embedding indexation. Analyzed the result, and picked the most effective solution. Made this solution production-ready, replacing the previous embedding solution and improving the performance of the application, which led to decreased waiting times for end users."
      ),
      li(
        "Led efforts to establish and maintain modules architecture in web service with complicated data extraction logic, making it more transparent for end-users and easy to change for developers."
      )
    ),
    h4("OJSC \"Trading System Administrator\""),
    ul(
      `class` := "cv-list",
      li(
        "Improved usage experience of user-facing services (custom data catalog with search functions, various wholesale and retail market simulations with visualizations, automated web-scraper of new articles)."
      ),
      li(
        "Developed important reports from various data sources (services databases, web-scraped data, model-generated data) to user-facing dashboards or queryable views to support decision-making for the analysts."
      ),
      li(
        "Improved developer experience, data quality, and code quality by developing a testing framework for the data mart loader."
      ),
      li(
        "Proposed, developed, and prototyped custom solutions for migrating from the proprietary stack. (Data quality framework, CRUD for loading data into data mart)"
      )
    ),
    h4("LLC \"Inform-podderzhka\""),
    ul(
      `class` := "cv-list",
      li(
        "Developed a graphical interface for visualizing the result of the algorithm in the static problem of cargo assignment, improved user experience, and easiness of experimenting with algorithm parameters. Made this model dynamic and covered it with metrics to support real-time decision-making."
      ),
      li(
        "Developed a framework for loading data into an external factor analysis module, making the loading process faster and easier."
      )
    ),
    h4("Institute of Control Sciences"),
    ul(
      `class` := "cv-list",
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
