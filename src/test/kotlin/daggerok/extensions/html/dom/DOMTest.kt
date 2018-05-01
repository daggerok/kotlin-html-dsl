package daggerok.extensions.html.dom

import org.junit.Assert.*
import org.junit.Test

class DOMTest {

  @Test fun `acceptance testing`() {
    assertEquals(
        "<!DOCTYPE html><html><head><meta charset='UTF-8'/>" +
            "<title>acceptance testing</title></head>" +
            "<body><h1>Hello, World!</h1></body></html>",
        html {
          head {
            meta("charset" to "UTF-8")
            title { text("acceptance testing") }
          }
          body {
            h1 { innerHTML += "Hello, World!" }
          }
        }
    )
  }

  @Test fun `test empty html`() {
    assertEquals(
        "<!DOCTYPE html><html></html>",
        html {  }
    )
  }
}