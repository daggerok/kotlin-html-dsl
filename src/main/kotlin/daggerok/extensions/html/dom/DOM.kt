@file:JvmName("DOM")

/* DOM: Stateful Kotlin HTML DSL */

package daggerok.extensions.html.dom

/* internal API */

// flatten Element.attributes
internal fun Array<out Pair<String, String>>.join(quote: String = "'") = if (this.isEmpty()) ""
else " " + this.map { "${it.first}=${quote + it.second + quote}" }
    .joinToString(" ") { it }

// collect element content into innerHTML
internal fun Array<out String>.join(separator: String = "") = if (this.isEmpty()) ""
else this.joinToString(separator) { it }

// HTML content receiver (appender) builder
class HtmlBuilder {
  var innerHTML: String = "<!DOCTYPE html>"
  //  private set
  fun text(content: String) {
    innerHTML += content
  }
}

/* public API */

/* DOM API */

/* main root */

fun html(vararg attributes: Pair<String, String> = arrayOf(),
         content: Array<String> = arrayOf(),
         func: HtmlBuilder.(String) -> Unit): String {

  val context = HtmlBuilder()
  context.text("<html${attributes.join()}>")
  context.func(content.join())
  context.text("</html>")
  return context.innerHTML
}

/* document head */

fun HtmlBuilder.head(vararg attributes: Pair<String, String> = arrayOf(),
                     content: Array<String> = arrayOf(),
                     func: HtmlBuilder.(String) -> Unit) {

  text("<head${attributes.join()}>")
  func(content.join())
  text("</head>")
}

/* head children */

fun HtmlBuilder.style(vararg attributes: Pair<String, String> = arrayOf(),
                      content: Array<String> = arrayOf(),
                      func: HtmlBuilder.(String) -> Unit) {

  text("<style${attributes.join()}>")
  func(content.join())
  text("</style>")
}

fun HtmlBuilder.title(vararg attributes: Pair<String, String> = arrayOf(),
                      content: Array<String> = arrayOf(),
                      func: HtmlBuilder.(String) -> Unit) {

  text("<title${attributes.join()}>")
  func(content.join())
  text("</title>")
}

/* self-closing: <base /> <link /> <meta /> */
fun HtmlBuilder.style(vararg attributes: Pair<String, String> = arrayOf()): Unit = text("<style${attributes.join()}/>")

fun HtmlBuilder.base(vararg attributes: Pair<String, String> = arrayOf()): Unit = text("<base${attributes.join()}/>")
fun HtmlBuilder.link(vararg attributes: Pair<String, String> = arrayOf()): Unit = text("<link${attributes.join()}/>")
fun HtmlBuilder.meta(vararg attributes: Pair<String, String> = arrayOf()): Unit = text("<meta${attributes.join()}/>")

/* document body */

fun HtmlBuilder.body(vararg attributes: Pair<String, String> = arrayOf(),
                     content: Array<String> = arrayOf(),
                     func: HtmlBuilder.(String) -> Unit) {

  text("<body${attributes.join()}>")
  func(content.join())
  text("</body>")
}

/* body children */

/*
  <area /> <br /> <col /> <command /> <embed /> <hr /> <img /> <label />
  <keygen /> <param /> <source /> <video /> <wbr />
*/

fun HtmlBuilder.area(vararg attributes: Pair<String, String> = arrayOf()): Unit = text("<area${attributes.join()}/>")
fun HtmlBuilder.command(vararg attributes: Pair<String, String> = arrayOf()): Unit = text("<command${attributes.join()}/>")
fun HtmlBuilder.embed(vararg attributes: Pair<String, String> = arrayOf()): Unit = text("<embed${attributes.join()}/>")
fun HtmlBuilder.hr(vararg attributes: Pair<String, String> = arrayOf()): Unit = text("<hr${attributes.join()}/>")
fun HtmlBuilder.img(vararg attributes: Pair<String, String> = arrayOf()): Unit = text("<img${attributes.join()}/>")
fun HtmlBuilder.keygen(vararg attributes: Pair<String, String> = arrayOf()): Unit = text("<keygen${attributes.join()}/>")
fun HtmlBuilder.param(vararg attributes: Pair<String, String> = arrayOf()): Unit = text("<param${attributes.join()}/>")
fun HtmlBuilder.source(vararg attributes: Pair<String, String> = arrayOf()): Unit = text("<source${attributes.join()}/>")
fun HtmlBuilder.track(vararg attributes: Pair<String, String> = arrayOf()): Unit = text("<track${attributes.join()}/>")

/* Content sectioning */

fun HtmlBuilder.address(vararg attributes: Pair<String, String> = arrayOf(),
                        content: Array<String> = arrayOf(),
                        func: HtmlBuilder.(String) -> Unit) {

  text("<address${attributes.join()}>")
  func(content.join())
  text("</address>")
}

fun HtmlBuilder.article(vararg attributes: Pair<String, String> = arrayOf(),
                        content: Array<String> = arrayOf(),
                        func: HtmlBuilder.(String) -> Unit) {

  text("<article${attributes.join()}>")
  func(content.join())
  text("</article>")
}

fun HtmlBuilder.aside(vararg attributes: Pair<String, String> = arrayOf(),
                      content: Array<String> = arrayOf(),
                      func: HtmlBuilder.(String) -> Unit) {

  text("<aside${attributes.join()}>")
  func(content.join())
  text("</aside>")
}

fun HtmlBuilder.footer(vararg attributes: Pair<String, String> = arrayOf(),
                       content: Array<String> = arrayOf(),
                       func: HtmlBuilder.(String) -> Unit) {

  text("<footer${attributes.join()}>")
  func(content.join())
  text("</footer>")
}

fun HtmlBuilder.header(vararg attributes: Pair<String, String> = arrayOf(),
                       content: Array<String> = arrayOf(),
                       func: HtmlBuilder.(String) -> Unit) {

  text("<header${attributes.join()}>")
  func(content.join())
  text("</header>")
}

fun HtmlBuilder.h1(vararg attributes: Pair<String, String> = arrayOf(),
                   content: Array<String> = arrayOf(),
                   func: HtmlBuilder.(String) -> Unit) {

  text("<h1${attributes.join()}>")
  func(content.join())
  text("</h1>")
}

fun HtmlBuilder.h2(vararg attributes: Pair<String, String> = arrayOf(),
                   content: Array<String> = arrayOf(),
                   func: HtmlBuilder.(String) -> Unit) {

  text("<h2${attributes.join()}>")
  func(content.join())
  text("</h2>")
}

fun HtmlBuilder.h3(vararg attributes: Pair<String, String> = arrayOf(),
                   content: Array<String> = arrayOf(),
                   func: HtmlBuilder.(String) -> Unit) {

  text("<h3${attributes.join()}>")
  func(content.join())
  text("</h3>")
}

fun HtmlBuilder.h4(vararg attributes: Pair<String, String> = arrayOf(),
                   content: Array<String> = arrayOf(),
                   func: HtmlBuilder.(String) -> Unit) {

  text("<h4${attributes.join()}>")
  func(content.join())
  text("</h4>")
}

fun HtmlBuilder.h5(vararg attributes: Pair<String, String> = arrayOf(),
                   content: Array<String> = arrayOf(),
                   func: HtmlBuilder.(String) -> Unit) {

  text("<h5${attributes.join()}>")
  func(content.join())
  text("</h5>")
}

fun HtmlBuilder.h6(vararg attributes: Pair<String, String> = arrayOf(),
                   content: Array<String> = arrayOf(),
                   func: HtmlBuilder.(String) -> Unit) {

  text("<h6${attributes.join()}>")
  func(content.join())
  text("</h6>")
}

fun HtmlBuilder.hgroup(vararg attributes: Pair<String, String> = arrayOf(),
                       content: Array<String> = arrayOf(),
                       func: HtmlBuilder.(String) -> Unit) {

  text("<hgroup${attributes.join()}>")
  func(content.join())
  text("</hgroup>")
}

fun HtmlBuilder.nav(vararg attributes: Pair<String, String> = arrayOf(),
                    content: Array<String> = arrayOf(),
                    func: HtmlBuilder.(String) -> Unit) {

  text("<nav${attributes.join()}>")
  func(content.join())
  text("</nav>")
}

fun HtmlBuilder.section(vararg attributes: Pair<String, String> = arrayOf(),
                        content: Array<String> = arrayOf(),
                        func: HtmlBuilder.(String) -> Unit) {

  text("<section${attributes.join()}>")
  func(content.join())
  text("</section>")
}

/* Text content */

fun HtmlBuilder.blockquote(vararg attributes: Pair<String, String> = arrayOf(),
                           content: Array<String> = arrayOf(),
                           func: HtmlBuilder.(String) -> Unit) {

  text("<blockquote${attributes.join()}>")
  func(content.join())
  text("</blockquote>")
}

fun HtmlBuilder.dd(vararg attributes: Pair<String, String> = arrayOf(),
                   content: Array<String> = arrayOf(),
                   func: HtmlBuilder.(String) -> Unit) {

  text("<dd${attributes.join()}>")
  func(content.join())
  text("</dd>")
}

fun HtmlBuilder.div(vararg attributes: Pair<String, String> = arrayOf(),
                    content: Array<String> = arrayOf(),
                    func: HtmlBuilder.(String) -> Unit) {

  text("<div${attributes.join()}>")
  func(content.join())
  text("</div>")
}

fun HtmlBuilder.dl(vararg attributes: Pair<String, String> = arrayOf(),
                   content: Array<String> = arrayOf(),
                   func: HtmlBuilder.(String) -> Unit) {

  text("<dl${attributes.join()}>")
  func(content.join())
  text("</dl>")
}

fun HtmlBuilder.dt(vararg attributes: Pair<String, String> = arrayOf(),
                   content: Array<String> = arrayOf(),
                   func: HtmlBuilder.(String) -> Unit) {

  text("<dt${attributes.join()}>")
  func(content.join())
  text("</dt>")
}

fun HtmlBuilder.figcaption(vararg attributes: Pair<String, String> = arrayOf(),
                           content: Array<String> = arrayOf(),
                           func: HtmlBuilder.(String) -> Unit) {

  text("<figcaption${attributes.join()}>")
  func(content.join())
  text("</figcaption>")
}

fun HtmlBuilder.figure(vararg attributes: Pair<String, String> = arrayOf(),
                       content: Array<String> = arrayOf(),
                       func: HtmlBuilder.(String) -> Unit) {

  text("<figure${attributes.join()}>")
  func(content.join())
  text("</figure>")
}

fun HtmlBuilder.li(vararg attributes: Pair<String, String> = arrayOf(),
                   content: Array<String> = arrayOf(),
                   func: HtmlBuilder.(String) -> Unit) {

  text("<li${attributes.join()}>")
  func(content.join())
  text("</li>")
}

fun HtmlBuilder.main(vararg attributes: Pair<String, String> = arrayOf(),
                     content: Array<String> = arrayOf(),
                     func: HtmlBuilder.(String) -> Unit) {

  text("<main${attributes.join()}>")
  func(content.join())
  text("</main>")
}

fun HtmlBuilder.ol(vararg attributes: Pair<String, String> = arrayOf(),
                   content: Array<String> = arrayOf(),
                   func: HtmlBuilder.(String) -> Unit) {

  text("<ol${attributes.join()}>")
  func(content.join())
  text("</ol>")
}

fun HtmlBuilder.p(vararg attributes: Pair<String, String> = arrayOf(),
                  content: Array<String> = arrayOf(),
                  func: HtmlBuilder.(String) -> Unit) {

  text("<p${attributes.join()}>")
  func(content.join())
  text("</p>")
}

fun HtmlBuilder.pre(vararg attributes: Pair<String, String> = arrayOf(),
                    content: Array<String> = arrayOf(),
                    func: HtmlBuilder.(String) -> Unit) {

  text("<pre${attributes.join()}>")
  func(content.join())
  text("</pre>")
}

fun HtmlBuilder.ul(vararg attributes: Pair<String, String> = arrayOf(),
                   content: Array<String> = arrayOf(),
                   func: HtmlBuilder.(String) -> Unit) {

  text("<ul${attributes.join()}>")
  func(content.join())
  text("</ul>")
}

/* Inline text semantics */

fun HtmlBuilder.a(vararg attributes: Pair<String, String> = arrayOf(),
                  content: Array<String> = arrayOf(),
                  func: HtmlBuilder.(String) -> Unit) {

  text("<a${attributes.join()}>")
  func(content.join())
  text("</a>")
}

fun HtmlBuilder.abbr(vararg attributes: Pair<String, String> = arrayOf(),
                     content: Array<String> = arrayOf(),
                     func: HtmlBuilder.(String) -> Unit) {

  text("<abbr${attributes.join()}>")
  func(content.join())
  text("</abbr>")
}

fun HtmlBuilder.b(vararg attributes: Pair<String, String> = arrayOf(),
                  content: Array<String> = arrayOf(),
                  func: HtmlBuilder.(String) -> Unit) {

  text("<b${attributes.join()}>")
  func(content.join())
  text("</b>")
}

fun HtmlBuilder.bdi(vararg attributes: Pair<String, String> = arrayOf(),
                    content: Array<String> = arrayOf(),
                    func: HtmlBuilder.(String) -> Unit) {

  text("<bdi${attributes.join()}>")
  func(content.join())
  text("</bdi>")
}

fun HtmlBuilder.bdo(vararg attributes: Pair<String, String> = arrayOf(),
                    content: Array<String> = arrayOf(),
                    func: HtmlBuilder.(String) -> Unit) {

  text("<bdo${attributes.join()}>")
  func(content.join())
  text("</bdo>")
}

fun HtmlBuilder.cite(vararg attributes: Pair<String, String> = arrayOf(),
                     content: Array<String> = arrayOf(),
                     func: HtmlBuilder.(String) -> Unit) {

  text("<cite${attributes.join()}>")
  func(content.join())
  text("</cite>")
}

fun HtmlBuilder.code(vararg attributes: Pair<String, String> = arrayOf(),
                     content: Array<String> = arrayOf(),
                     func: HtmlBuilder.(String) -> Unit) {

  text("<code${attributes.join()}>")
  func(content.join())
  text("</code>")
}

fun HtmlBuilder.data(vararg attributes: Pair<String, String> = arrayOf(),
                     content: Array<String> = arrayOf(),
                     func: HtmlBuilder.(String) -> Unit) {

  text("<data${attributes.join()}>")
  func(content.join())
  text("</data>")
}

fun HtmlBuilder.dfn(vararg attributes: Pair<String, String> = arrayOf(),
                    content: Array<String> = arrayOf(),
                    func: HtmlBuilder.(String) -> Unit) {

  text("<dfn${attributes.join()}>")
  func(content.join())
  text("</dfn>")
}

fun HtmlBuilder.em(vararg attributes: Pair<String, String> = arrayOf(),
                   content: Array<String> = arrayOf(),
                   func: HtmlBuilder.(String) -> Unit) {

  text("<em${attributes.join()}>")
  func(content.join())
  text("</em>")
}

fun HtmlBuilder.i(vararg attributes: Pair<String, String> = arrayOf(),
                  content: Array<String> = arrayOf(),
                  func: HtmlBuilder.(String) -> Unit) {

  text("<i${attributes.join()}>")
  func(content.join())
  text("</i>")
}

fun HtmlBuilder.kbd(vararg attributes: Pair<String, String> = arrayOf(),
                    content: Array<String> = arrayOf(),
                    func: HtmlBuilder.(String) -> Unit) {

  text("<kbd${attributes.join()}>")
  func(content.join())
  text("</kbd>")
}

fun HtmlBuilder.mark(vararg attributes: Pair<String, String> = arrayOf(),
                     content: Array<String> = arrayOf(),
                     func: HtmlBuilder.(String) -> Unit) {

  text("<mark${attributes.join()}>")
  func(content.join())
  text("</mark>")
}

fun HtmlBuilder.q(vararg attributes: Pair<String, String> = arrayOf(),
                  content: Array<String> = arrayOf(),
                  func: HtmlBuilder.(String) -> Unit) {

  text("<q${attributes.join()}>")
  func(content.join())
  text("</q>")
}

fun HtmlBuilder.rt(vararg attributes: Pair<String, String> = arrayOf(),
                   content: Array<String> = arrayOf(),
                   func: HtmlBuilder.(String) -> Unit) {

  text("<rt${attributes.join()}>")
  func(content.join())
  text("</rt>")
}

fun HtmlBuilder.rp(vararg attributes: Pair<String, String> = arrayOf(),
                   content: Array<String> = arrayOf(),
                   func: HtmlBuilder.(String) -> Unit) {

  text("<rp${attributes.join()}>")
  func(content.join())
  text("</rp>")
}

fun HtmlBuilder.rtc(vararg attributes: Pair<String, String> = arrayOf(),
                    content: Array<String> = arrayOf(),
                    func: HtmlBuilder.(String) -> Unit) {

  text("<rtc${attributes.join()}>")
  func(content.join())
  text("</rtc>")
}

fun HtmlBuilder.ruby(vararg attributes: Pair<String, String> = arrayOf(),
                     content: Array<String> = arrayOf(),
                     func: HtmlBuilder.(String) -> Unit) {

  text("<ruby${attributes.join()}>")
  func(content.join())
  text("</ruby>")
}

fun HtmlBuilder.s(vararg attributes: Pair<String, String> = arrayOf(),
                  content: Array<String> = arrayOf(),
                  func: HtmlBuilder.(String) -> Unit) {

  text("<s${attributes.join()}>")
  func(content.join())
  text("</s>")
}

fun HtmlBuilder.samp(vararg attributes: Pair<String, String> = arrayOf(),
                     content: Array<String> = arrayOf(),
                     func: HtmlBuilder.(String) -> Unit) {

  text("<samp${attributes.join()}>")
  func(content.join())
  text("</samp>")
}

fun HtmlBuilder.small(vararg attributes: Pair<String, String> = arrayOf(),
                      content: Array<String> = arrayOf(),
                      func: HtmlBuilder.(String) -> Unit) {

  text("<small${attributes.join()}>")
  func(content.join())
  text("</small>")
}

fun HtmlBuilder.span(vararg attributes: Pair<String, String> = arrayOf(),
                     content: Array<String> = arrayOf(),
                     func: HtmlBuilder.(String) -> Unit) {

  text("<span${attributes.join()}>")
  func(content.join())
  text("</span>")
}

fun HtmlBuilder.strong(vararg attributes: Pair<String, String> = arrayOf(),
                       content: Array<String> = arrayOf(),
                       func: HtmlBuilder.(String) -> Unit) {

  text("<strong${attributes.join()}>")
  func(content.join())
  text("</strong>")
}

fun HtmlBuilder.sub(vararg attributes: Pair<String, String> = arrayOf(),
                    content: Array<String> = arrayOf(),
                    func: HtmlBuilder.(String) -> Unit) {

  text("<sub${attributes.join()}>")
  func(content.join())
  text("</sub>")
}

fun HtmlBuilder.sup(vararg attributes: Pair<String, String> = arrayOf(),
                    content: Array<String> = arrayOf(),
                    func: HtmlBuilder.(String) -> Unit) {

  text("<sup${attributes.join()}>")
  func(content.join())
  text("</sup>")
}

fun HtmlBuilder.time(vararg attributes: Pair<String, String> = arrayOf(),
                     content: Array<String> = arrayOf(),
                     func: HtmlBuilder.(String) -> Unit) {

  text("<time${attributes.join()}>")
  func(content.join())
  text("</time>")
}

fun HtmlBuilder.u(vararg attributes: Pair<String, String> = arrayOf(),
                  content: Array<String> = arrayOf(),
                  func: HtmlBuilder.(String) -> Unit) {

  text("<u${attributes.join()}>")
  func(content.join())
  text("</u>")
}

fun HtmlBuilder.variable(vararg attributes: Pair<String, String> = arrayOf(),
                         content: Array<String> = arrayOf(),
                         func: HtmlBuilder.(String) -> Unit) {

  text("<var${attributes.join()}>")
  func(content.join())
  text("</var>")
}

fun HtmlBuilder.`var`(vararg attributes: Pair<String, String> = arrayOf(),
                      content: Array<String> = arrayOf(),
                      func: HtmlBuilder.(String) -> Unit) {

  text("<var${attributes.join()}>")
  func(content.join())
  text("</var>")
}

// self-closing
fun HtmlBuilder.br(vararg attributes: Pair<String, String> = arrayOf()): Unit = text("<br${attributes.join()}/>")

fun HtmlBuilder.wbr(vararg attributes: Pair<String, String> = arrayOf()): Unit = text("<wbr${attributes.join()}/>")

/* Image and multimedia */

fun HtmlBuilder.area(vararg attributes: Pair<String, String> = arrayOf(),
                     content: Array<String> = arrayOf(),
                     func: HtmlBuilder.(String) -> Unit) {

  text("<area${attributes.join()}>")
  func(content.join())
  text("</area>")
}

fun HtmlBuilder.audio(vararg attributes: Pair<String, String> = arrayOf(),
                      content: Array<String> = arrayOf(),
                      func: HtmlBuilder.(String) -> Unit) {

  text("<audio${attributes.join()}>")
  func(content.join())
  text("</audio>")
}

fun HtmlBuilder.map(vararg attributes: Pair<String, String> = arrayOf(),
                    content: Array<String> = arrayOf(),
                    func: HtmlBuilder.(String) -> Unit) {

  text("<map${attributes.join()}>")
  func(content.join())
  text("</map>")
}

// self-closing:
fun HtmlBuilder.video(vararg attributes: Pair<String, String> = arrayOf()) = text("<video${attributes.join()}>")

/* Embedded content */

fun HtmlBuilder.iframe(vararg attributes: Pair<String, String> = arrayOf(),
                       content: Array<String> = arrayOf(),
                       func: HtmlBuilder.(String) -> Unit) {

  text("<iframe${attributes.join()}>")
  func(content.join())
  text("</iframe>")
}

fun HtmlBuilder.obj(vararg attributes: Pair<String, String> = arrayOf(),
                    content: Array<String> = arrayOf(),
                    func: HtmlBuilder.(String) -> Unit) {

  text("<object${attributes.join()}>")
  func(content.join())
  text("</object>")
}

fun HtmlBuilder.`object`(vararg attributes: Pair<String, String> = arrayOf(),
                         content: Array<String> = arrayOf(),
                         func: HtmlBuilder.(String) -> Unit) {

  text("<object${attributes.join()}>")
  func(content.join())
  text("</object>")
}

/* Scripting */

fun HtmlBuilder.canvas(vararg attributes: Pair<String, String> = arrayOf(),
                       content: Array<String> = arrayOf(),
                       func: HtmlBuilder.(String) -> Unit) {

  text("<canvas${attributes.join()}>")
  func(content.join())
  text("</canvas>")
}

fun HtmlBuilder.noscript(vararg attributes: Pair<String, String> = arrayOf(),
                         content: Array<String> = arrayOf(),
                         func: HtmlBuilder.(String) -> Unit) {

  text("<noscript${attributes.join()}>")
  func(content.join())
  text("</noscript>")
}

fun HtmlBuilder.script(vararg attributes: Pair<String, String> = arrayOf(),
                       content: Array<String> = arrayOf(),
                       func: HtmlBuilder.(String) -> Unit) {

  text("<script${attributes.join()}>")
  func(content.join())
  text("</script>")
}

/* Demarcating edits */

fun HtmlBuilder.del(vararg attributes: Pair<String, String> = arrayOf(),
                    content: Array<String> = arrayOf(),
                    func: HtmlBuilder.(String) -> Unit) {

  text("<del${attributes.join()}>")
  func(content.join())
  text("</del>")
}

fun HtmlBuilder.ins(vararg attributes: Pair<String, String> = arrayOf(),
                    content: Array<String> = arrayOf(),
                    func: HtmlBuilder.(String) -> Unit) {

  text("<ins${attributes.join()}>")
  func(content.join())
  text("</ins>")
}

/* Table content */

fun HtmlBuilder.caption(vararg attributes: Pair<String, String> = arrayOf(),
                        content: Array<String> = arrayOf(),
                        func: HtmlBuilder.(String) -> Unit) {

  text("<caption${attributes.join()}>")
  func(content.join())
  text("</caption>")
}

fun HtmlBuilder.colgroup(vararg attributes: Pair<String, String> = arrayOf(),
                         content: Array<String> = arrayOf(),
                         func: HtmlBuilder.(String) -> Unit) {

  text("<colgroup${attributes.join()}>")
  func(content.join())
  text("</colgroup>")
}

fun HtmlBuilder.table(vararg attributes: Pair<String, String> = arrayOf(),
                      content: Array<String> = arrayOf(),
                      func: HtmlBuilder.(String) -> Unit) {

  text("<table${attributes.join()}>")
  func(content.join())
  text("</table>")
}

fun HtmlBuilder.tbody(vararg attributes: Pair<String, String> = arrayOf(),
                      content: Array<String> = arrayOf(),
                      func: HtmlBuilder.(String) -> Unit) {

  text("<tbody${attributes.join()}>")
  func(content.join())
  text("</tbody>")
}

fun HtmlBuilder.td(vararg attributes: Pair<String, String> = arrayOf(),
                   content: Array<String> = arrayOf(),
                   func: HtmlBuilder.(String) -> Unit) {

  text("<td${attributes.join()}>")
  func(content.join())
  text("</td>")
}

fun HtmlBuilder.tfoot(vararg attributes: Pair<String, String> = arrayOf(),
                      content: Array<String> = arrayOf(),
                      func: HtmlBuilder.(String) -> Unit) {

  text("<tfoot${attributes.join()}>")
  func(content.join())
  text("</tfoot>")
}

fun HtmlBuilder.th(vararg attributes: Pair<String, String> = arrayOf(),
                   content: Array<String> = arrayOf(),
                   func: HtmlBuilder.(String) -> Unit) {

  text("<th${attributes.join()}>")
  func(content.join())
  text("</th>")
}

fun HtmlBuilder.thead(vararg attributes: Pair<String, String> = arrayOf(),
                      content: Array<String> = arrayOf(),
                      func: HtmlBuilder.(String) -> Unit) {

  text("<thead${attributes.join()}>")
  func(content.join())
  text("</thead>")
}

fun HtmlBuilder.tr(vararg attributes: Pair<String, String> = arrayOf(),
                   content: Array<String> = arrayOf(),
                   func: HtmlBuilder.(String) -> Unit) {

  text("<tr${attributes.join()}>")
  func(content.join())
  text("</tr>")
}

// self-closing:
fun HtmlBuilder.col(vararg attributes: Pair<String, String> = arrayOf()) = text("<col${attributes.join()}>")

/* Forms */

fun HtmlBuilder.button(vararg attributes: Pair<String, String> = arrayOf(),
                       content: Array<String> = arrayOf(),
                       func: HtmlBuilder.(String) -> Unit) {

  text("<button${attributes.join()}>")
  func(content.join())
  text("</button>")
}

fun HtmlBuilder.datalist(vararg attributes: Pair<String, String> = arrayOf(),
                         content: Array<String> = arrayOf(),
                         func: HtmlBuilder.(String) -> Unit) {

  text("<datalist${attributes.join()}>")
  func(content.join())
  text("</datalist>")
}

fun HtmlBuilder.fieldset(vararg attributes: Pair<String, String> = arrayOf(),
                         content: Array<String> = arrayOf(),
                         func: HtmlBuilder.(String) -> Unit) {

  text("<fieldset${attributes.join()}>")
  func(content.join())
  text("</fieldset>")
}

fun HtmlBuilder.form(vararg attributes: Pair<String, String> = arrayOf(),
                     content: Array<String> = arrayOf(),
                     func: HtmlBuilder.(String) -> Unit) {

  text("<form${attributes.join()}>")
  func(content.join())
  text("</form>")
}

// self-closing: <input/>
fun HtmlBuilder.input(vararg attributes: Pair<String, String> = arrayOf()) = text("<input${attributes.join()}>")

fun HtmlBuilder.input(vararg attributes: Pair<String, String> = arrayOf(),
                      content: Array<String> = arrayOf(),
                      func: HtmlBuilder.(String) -> Unit) {

  text("<input${attributes.join()}>")
  func(content.join())
  text("</input>")
}

fun HtmlBuilder.label(vararg attributes: Pair<String, String> = arrayOf(),
                      content: Array<String> = arrayOf(),
                      func: HtmlBuilder.(String) -> Unit) {

  text("<label${attributes.join()}>")
  func(content.join())
  text("</label>")
}

fun HtmlBuilder.legend(vararg attributes: Pair<String, String> = arrayOf(),
                       content: Array<String> = arrayOf(),
                       func: HtmlBuilder.(String) -> Unit) {

  text("<legend${attributes.join()}>")
  func(content.join())
  text("</legend>")
}

fun HtmlBuilder.meter(vararg attributes: Pair<String, String> = arrayOf(),
                      content: Array<String> = arrayOf(),
                      func: HtmlBuilder.(String) -> Unit) {

  text("<meter${attributes.join()}>")
  func(content.join())
  text("</meter>")
}

fun HtmlBuilder.optgroup(vararg attributes: Pair<String, String> = arrayOf(),
                         content: Array<String> = arrayOf(),
                         func: HtmlBuilder.(String) -> Unit) {

  text("<optgroup${attributes.join()}>")
  func(content.join())
  text("</optgroup>")
}

fun HtmlBuilder.option(vararg attributes: Pair<String, String> = arrayOf(),
                       content: Array<String> = arrayOf(),
                       func: HtmlBuilder.(String) -> Unit) {

  text("<option${attributes.join()}>")
  func(content.join())
  text("</option>")
}

fun HtmlBuilder.output(vararg attributes: Pair<String, String> = arrayOf(),
                       content: Array<String> = arrayOf(),
                       func: HtmlBuilder.(String) -> Unit) {

  text("<output${attributes.join()}>")
  func(content.join())
  text("</output>")
}

fun HtmlBuilder.progress(vararg attributes: Pair<String, String> = arrayOf(),
                         content: Array<String> = arrayOf(),
                         func: HtmlBuilder.(String) -> Unit) {

  text("<progress${attributes.join()}>")
  func(content.join())
  text("</progress>")
}

fun HtmlBuilder.select(vararg attributes: Pair<String, String> = arrayOf(),
                       content: Array<String> = arrayOf(),
                       func: HtmlBuilder.(String) -> Unit) {

  text("<select${attributes.join()}>")
  func(content.join())
  text("</select>")
}

fun HtmlBuilder.textarea(vararg attributes: Pair<String, String> = arrayOf(),
                         content: Array<String> = arrayOf(),
                         func: HtmlBuilder.(String) -> Unit) {

  text("<textarea${attributes.join()}>")
  func(content.join())
  text("</textarea>")
}

/* Interactive elements */

fun HtmlBuilder.details(vararg attributes: Pair<String, String> = arrayOf(),
                        content: Array<String> = arrayOf(),
                        func: HtmlBuilder.(String) -> Unit) {

  text("<details${attributes.join()}>")
  func(content.join())
  text("</details>")
}

fun HtmlBuilder.dialog(vararg attributes: Pair<String, String> = arrayOf(),
                       content: Array<String> = arrayOf(),
                       func: HtmlBuilder.(String) -> Unit) {

  text("<dialog${attributes.join()}>")
  func(content.join())
  text("</dialog>")
}

fun HtmlBuilder.menu(vararg attributes: Pair<String, String> = arrayOf(),
                     content: Array<String> = arrayOf(),
                     func: HtmlBuilder.(String) -> Unit) {

  text("<menu${attributes.join()}>")
  func(content.join())
  text("</menu>")
}

fun HtmlBuilder.summary(vararg attributes: Pair<String, String> = arrayOf(),
                        content: Array<String> = arrayOf(),
                        func: HtmlBuilder.(String) -> Unit) {

  text("<summary${attributes.join()}>")
  func(content.join())
  text("</summary>")
}

/* Web Components */

fun HtmlBuilder.template(vararg attributes: Pair<String, String> = arrayOf(),
                         content: Array<String> = arrayOf(),
                         func: HtmlBuilder.(String) -> Unit) {

  text("<template${attributes.join()}>")
  func(content.join())
  text("</template>")
}

/* HTML4: Obsolete and deprecated elements */

fun HtmlBuilder.acronym(vararg attributes: Pair<String, String> = arrayOf(),
                        content: Array<String> = arrayOf(),
                        func: HtmlBuilder.(String) -> Unit) {

  text("<acronym${attributes.join()}>")
  func(content.join())
  text("</acronym>")
}

fun HtmlBuilder.applet(vararg attributes: Pair<String, String> = arrayOf(),
                       content: Array<String> = arrayOf(),
                       func: HtmlBuilder.(String) -> Unit) {

  text("<applet${attributes.join()}>")
  func(content.join())
  text("</applet>")
}

fun HtmlBuilder.big(vararg attributes: Pair<String, String> = arrayOf(),
                    content: Array<String> = arrayOf(),
                    func: HtmlBuilder.(String) -> Unit) {

  text("<big${attributes.join()}>")
  func(content.join())
  text("</big>")
}

fun HtmlBuilder.center(vararg attributes: Pair<String, String> = arrayOf(),
                       content: Array<String> = arrayOf(),
                       func: HtmlBuilder.(String) -> Unit) {

  text("<center${attributes.join()}>")
  func(content.join())
  text("</center>")
}

fun HtmlBuilder.dir(vararg attributes: Pair<String, String> = arrayOf(),
                    content: Array<String> = arrayOf(),
                    func: HtmlBuilder.(String) -> Unit) {

  text("<dir${attributes.join()}>")
  func(content.join())
  text("</dir>")
}

fun HtmlBuilder.font(vararg attributes: Pair<String, String> = arrayOf(),
                     content: Array<String> = arrayOf(),
                     func: HtmlBuilder.(String) -> Unit) {

  text("<font${attributes.join()}>")
  func(content.join())
  text("</font>")
}

// self-closing:
fun HtmlBuilder.basefont(vararg attributes: Pair<String, String> = arrayOf()) = text("<basefont${attributes.join()}>")

fun HtmlBuilder.frame(vararg attributes: Pair<String, String> = arrayOf()) = text("<frame${attributes.join()}>")
fun HtmlBuilder.isindex(vararg attributes: Pair<String, String> = arrayOf()) = text("<isindex${attributes.join()}>")
fun HtmlBuilder.menuitem(vararg attributes: Pair<String, String> = arrayOf()) = text("<menuitem${attributes.join()}>")

fun HtmlBuilder.frameset(vararg attributes: Pair<String, String> = arrayOf(),
                         content: Array<String> = arrayOf(),
                         func: HtmlBuilder.(String) -> Unit) {

  text("<frameset${attributes.join()}>")
  func(content.join())
  text("</frameset>")
}

fun HtmlBuilder.noframes(vararg attributes: Pair<String, String> = arrayOf(),
                         content: Array<String> = arrayOf(),
                         func: HtmlBuilder.(String) -> Unit) {

  text("<noframes${attributes.join()}>")
  func(content.join())
  text("</noframes>")
}

fun HtmlBuilder.strike(vararg attributes: Pair<String, String> = arrayOf(),
                       content: Array<String> = arrayOf(),
                       func: HtmlBuilder.(String) -> Unit) {

  text("<strike${attributes.join()}>")
  func(content.join())
  text("</strike>")
}

fun HtmlBuilder.tt(vararg attributes: Pair<String, String> = arrayOf(),
                   content: Array<String> = arrayOf(),
                   func: HtmlBuilder.(String) -> Unit) {

  text("<tt${attributes.join()}>")
  func(content.join())
  text("</tt>")
}
