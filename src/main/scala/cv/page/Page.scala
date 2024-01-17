package cv.page

import org.scalajs.dom
import org.scalajs.dom.html
import scalatags.JsDom

case class Page(button: html.Button, pageContent: JsDom.TypedTag[dom.Element])
