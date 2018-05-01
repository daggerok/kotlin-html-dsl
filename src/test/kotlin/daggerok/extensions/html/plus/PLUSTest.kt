package daggerok.extensions.html.plus

import org.junit.Assert.*
import org.junit.Test

class PLUSTest {

  @Test fun `acceptance testing`() {
    assertEquals(
        "<!DOCTYPE html><html><head><meta charset='UTF-8'/>" +
            "<title>acceptance testing</title></head>" +
            "<body><h1>Hello, World!</h1></body></html>",
        html {
          head {
            meta("charset" to "UTF-8")+
            title { "acceptance testing" }
          }+
          body {
            h1 { "Hello, World!" }
          }
        }
    )
  }

  @Test fun `test empty html`() {
    assertEquals(
        "<!DOCTYPE html><html></html>",
        html()
    )
  }
}