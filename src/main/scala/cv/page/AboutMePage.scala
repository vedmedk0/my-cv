package cv.page

import org.scalajs.dom.html.Div
import scalatags.JsDom
import scalatags.JsDom.all._

object AboutMePage {

  private val description =
    div(
      `class` := "pure-u-3-5",
      h1(style := "text-align: center;", "About me"),
      div(
        style := "padding-left: 2em; padding-right: 2em;",
        ul(
          style := "display: inline-block; text-align: left;",
          li("Full name: Mikhail Golubtsov"),
          li("Position: Data Engineer"),
          li("Company: ", a(href := "https://wolt.com/", "Wolt")),
          li("Birth date: 26 June 1994 г."),
          li(
            "e-mail: ",
            a(
              href := "mailto:mp.golubtcov@physics.msu.ru",
              "mp.golubtcov@physics.msu.ru"
            )
          ),
          li("Telegram: ", a(href := "https://t.me/Vedmedk0", "@Vedmedk0")),
          li("Github: ", a(href := "https://github.com/vedmedk0", "Vedmedk0"))
        ),
        div(
          "Areas of interest: data engineering, streaming, Scala/Python development, backend, BI, data analysis."
        ),
        h4("Key skills:", style := "margin-bottom: 0px;"),
        ul(
          style := "display: inline-block; text-align: left;",
          li(
            "Programming languages: Scala (Spark, Flink, Typelevel stack, Twitter stack), Python, Javascript, SQL"
          ),
          li(
            "Data management systems: Kafka, Snowflake, Vertica, ClickHouse, PostgreSQL, Elasticsearch, Redis"
          ),
          li("Infrastructure & Deployment: Kubernetes, Terraform, AWS"),
          li("BI: Tableau, Looker")
        ),
        h4("Personal info:", style := "margin-bottom: 0px;margin-top: 0px;"),
        div(
          style:="margin-top:1.5em; padding-left: 2em;",
          div(
            "My drivers: curiosity, the desire to learn as much as possible, and apply the acquired knowledge. Learning is inseparable for me from the work, one without the other loses its meaning. Non-confrontational, I consider myself as a team player."
          ),
          br,
          div("Hobbies: music, programming, fitness, board games")
        )
      )
    )

  private val content: JsDom.TypedTag[Div] =
    div(
      style := "display: block;",
      `class` := "pure-g",
      description,
      div(`class` := "pure-u-2-5", img(style:="margin-top: 1em;",src := "photo.jpeg"))
    )

  val page = Page("About Me", content)

}
