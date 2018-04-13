@file:JvmName("DOM")

/*
  see: https://developer.mozilla.org/en-US/docs/Web/HTML/Element
 */

package daggerok.extensions

/* flatten Element.attributes */

fun Array<out Pair<Any, Any>>.join(quote: String = "'", separator: String = " ") =
  if (this.isEmpty()) "" else " " + this.map { "${it.first}=${quote + it.second + quote}" }
    .joinToString(separator) { it }

/* main root */

fun html(vararg attributes: Pair<String, String> = arrayOf(),
         content: String = "",
         func: (String) -> String) = "<html${attributes.join()}>${func(content.trimIndent())}</html>"

/* document head */

fun head(vararg attributes: Pair<String, String> = arrayOf(),
         content: String = "",
         func: (String) -> String) = "<head${attributes.join()}>${func(content.trimIndent())}</head>"

/* head children */

/*
  <base /> <link /> <meta />
 */

fun base(vararg attributes: Pair<String, String> = arrayOf()) = "<base${attributes.join()}/>"
fun link(vararg attributes: Pair<String, String> = arrayOf()) = "<link${attributes.join()}/>"
fun meta(vararg attributes: Pair<String, String> = arrayOf()) = "<meta${attributes.join()}/>"

fun style(vararg attributes: Pair<String, String> = arrayOf(),
          content: String = "",
          func: (String) -> String) = "<style${attributes.join()}>${func(content.trimIndent())}</style>"
fun title(vararg attributes: Pair<String, String> = arrayOf(),
          content: String = "",
          func: (String) -> String) = "<title${attributes.join()}>${func(content.trimIndent())}</title>"

/* document body */

fun body(vararg attributes: Pair<String, String> = arrayOf(),
         content: String = "",
         func: (String) -> String) = "<body${attributes.join()}>${func(content.trimIndent())}</body>"

/* body children */

/*
  <area /> <br /> <col /> <command /> <embed /> <hr /> <img /> <input />
  <keygen /> <param /> <source /> <track /> <wbr />
 */

fun area(vararg attributes: Pair<String, String> = arrayOf()) = "<area${attributes.join()}/>"
fun command(vararg attributes: Pair<String, String> = arrayOf()) = "<command${attributes.join()}/>"
fun embed(vararg attributes: Pair<String, String> = arrayOf()) = "<embed${attributes.join()}/>"
fun hr(vararg attributes: Pair<String, String> = arrayOf()) = "<hr${attributes.join()}/>"
fun img(vararg attributes: Pair<String, String> = arrayOf()) = "<img${attributes.join()}/>"
fun keygen(vararg attributes: Pair<String, String> = arrayOf()) = "<keygen${attributes.join()}/>"
fun param(vararg attributes: Pair<String, String> = arrayOf()) = "<param${attributes.join()}/>"
fun source(vararg attributes: Pair<String, String> = arrayOf()) = "<source${attributes.join()}/>"
fun track(vararg attributes: Pair<String, String> = arrayOf()) = "<track${attributes.join()}/>"
fun wbr(vararg attributes: Pair<String, String> = arrayOf()) = "<wbr${attributes.join()}/>"

/* Content sectioning */

fun address(vararg attributes: Pair<String, String> = arrayOf(),
            content: String = "", // content: Array<String> = arrayOf(), //vararg content: String = arrayOf(),
            func: (String) -> String) = "<address${attributes.join()}>${func(content.trimIndent())}</address>"

fun article(vararg attributes: Pair<String, String> = arrayOf(),
            content: String = "",
            func: (String) -> String) = "<article${attributes.join()}>${func(content.trimIndent())}</article>"

fun aside(vararg attributes: Pair<String, String> = arrayOf(),
          content: String = "",
          func: (String) -> String) = "<aside${attributes.join()}>${func(content.trimIndent())}</aside>"

fun footer(vararg attributes: Pair<String, String> = arrayOf(),
          content: String = "",
          func: (String) -> String) = "<footer${attributes.join()}>${func(content.trimIndent())}</footer>"

fun header(vararg attributes: Pair<String, String> = arrayOf(),
           content: String = "",
           func: (String) -> String) = "<header${attributes.join()}>${func(content.trimIndent())}</header>"

fun h1(vararg attributes: Pair<String, String> = arrayOf(),
       content: String = "",
       func: (String) -> String) = "<h1${attributes.join()}>${func(content.trimIndent())}</h1>"

fun h2(vararg attributes: Pair<String, String> = arrayOf(),
       content: String = "",
       func: (String) -> String) = "<h2${attributes.join()}>${func(content.trimIndent())}</h2>"

fun h3(vararg attributes: Pair<String, String> = arrayOf(),
       content: String = "",
       func: (String) -> String) = "<h3${attributes.join()}>${func(content.trimIndent())}</h3>"

fun h4(vararg attributes: Pair<String, String> = arrayOf(),
       content: String = "",
       func: (String) -> String) = "<h4${attributes.join()}>${func(content.trimIndent())}</h4>"

fun h5(vararg attributes: Pair<String, String> = arrayOf(),
       content: String = "",
       func: (String) -> String) = "<h5${attributes.join()}>${func(content.trimIndent())}</h5>"

fun h6(vararg attributes: Pair<String, String> = arrayOf(),
       content: String = "",
       func: (String) -> String) = "<h6${attributes.join()}>${func(content.trimIndent())}</h6>"

fun hgroup(vararg attributes: Pair<String, String> = arrayOf(),
           content: String = "",
           func: (String) -> String) = "<hgroup${attributes.join()}>${func(content.trimIndent())}</hgroup>"

fun nav(vararg attributes: Pair<String, String> = arrayOf(),
        content: String = "",
        func: (String) -> String) = "<nav${attributes.join()}>${func(content.trimIndent())}</nav>"

fun section(vararg attributes: Pair<String, String> = arrayOf(),
            content: String = "",
            func: (String) -> String) = "<section${attributes.join()}>${func(content.trimIndent())}</section>"

/* Text content */

fun blockquote(vararg attributes: Pair<String, String> = arrayOf(),
               content: String = "",
               func: (String) -> String) = "<blockquote${attributes.join()}>${func(content.trimIndent())}</blockquote>"

fun dd(vararg attributes: Pair<String, String> = arrayOf(),
       content: String = "",
       func: (String) -> String) = "<dd${attributes.join()}>${func(content.trimIndent())}</dd>"

fun div(vararg attributes: Pair<String, String> = arrayOf(),
        content: String = "",
        func: (String) -> String) = "<div${attributes.join()}>${func(content.trimIndent())}</div>"

fun dl(vararg attributes: Pair<String, String> = arrayOf(),
       content: String = "",
       func: (String) -> String) = "<dl${attributes.join()}>${func(content.trimIndent())}</dl>"

fun dt(vararg attributes: Pair<String, String> = arrayOf(),
       content: String = "",
       func: (String) -> String) = "<dt${attributes.join()}>${func(content.trimIndent())}</dt>"

fun figcaption(vararg attributes: Pair<String, String> = arrayOf(),
               content: String = "",
               func: (String) -> String) = "<figcaption${attributes.join()}>${func(content.trimIndent())}</figcaption>"

fun figure(vararg attributes: Pair<String, String> = arrayOf(),
           content: String = "",
           func: (String) -> String) = "<figure${attributes.join()}>${func(content.trimIndent())}</figure>"

fun hr(vararg attributes: Pair<String, String> = arrayOf(),
       content: String = "",
       func: (String) -> String) = "<hr${attributes.join()}>${func(content.trimIndent())}</hr>"

fun li(vararg attributes: Pair<String, String> = arrayOf(),
       content: String = "",
       func: (String) -> String) = "<li${attributes.join()}>${func(content.trimIndent())}</li>"

fun main(vararg attributes: Pair<String, String> = arrayOf(),
         content: String = "",
         func: (String) -> String) = "<main${attributes.join()}>${func(content.trimIndent())}</main>"

fun ol(vararg attributes: Pair<String, String> = arrayOf(),
       content: String = "",
       func: (String) -> String) = "<ol${attributes.join()}>${func(content.trimIndent())}</ol>"

fun p(vararg attributes: Pair<String, String> = arrayOf(),
      content: String = "",
      func: (String) -> String) = "<p${attributes.join()}>${func(content.trimIndent())}</p>"

fun pre(vararg attributes: Pair<String, String> = arrayOf(),
        content: String = "",
        func: (String) -> String) = "<pre${attributes.join()}>${func(content.trimIndent())}</pre>"

fun ul(vararg attributes: Pair<String, String> = arrayOf(),
       content: String = "",
       func: (String) -> String) = "<ul${attributes.join()}>${func(content.trimIndent())}</ul>"

/* Inline text semantics */

fun a(vararg attributes: Pair<String, String> = arrayOf(),
       content: String = "",
       func: (String) -> String) = "<a${attributes.join()}>${func(content.trimIndent())}</a>"

fun abbr(vararg attributes: Pair<String, String> = arrayOf(),
         content: String = "",
         func: (String) -> String) = "<abbr${attributes.join()}>${func(content.trimIndent())}</abbr>"

fun b(vararg attributes: Pair<String, String> = arrayOf(),
      content: String = "",
      func: (String) -> String) = "<b${attributes.join()}>${func(content.trimIndent())}</b>"

fun bdi(vararg attributes: Pair<String, String> = arrayOf(),
        content: String = "",
        func: (String) -> String) = "<bdi${attributes.join()}>${func(content.trimIndent())}</bdi>"

fun bdo(vararg attributes: Pair<String, String> = arrayOf(),
        content: String = "",
        func: (String) -> String) = "<bdo${attributes.join()}>${func(content.trimIndent())}</bdo>"

fun br(vararg attributes: Pair<String, String> = arrayOf()) = "<br${attributes.join()}/>"

fun cite(vararg attributes: Pair<String, String> = arrayOf(),
         content: String = "",
         func: (String) -> String) = "<cite${attributes.join()}>${func(content.trimIndent())}</cite>"

fun code(vararg attributes: Pair<String, String> = arrayOf(),
         content: String = "",
         func: (String) -> String) = "<code${attributes.join()}>${func(content.trimIndent())}</code>"

fun data(vararg attributes: Pair<String, String> = arrayOf(),
         content: String = "",
         func: (String) -> String) = "<data${attributes.join()}>${func(content.trimIndent())}</data>"

fun dfn(vararg attributes: Pair<String, String> = arrayOf(),
        content: String = "",
        func: (String) -> String) = "<dfn${attributes.join()}>${func(content.trimIndent())}</dfn>"

fun em(vararg attributes: Pair<String, String> = arrayOf(),
       content: String = "",
       func: (String) -> String) = "<em${attributes.join()}>${func(content.trimIndent())}</em>"

fun i(vararg attributes: Pair<String, String> = arrayOf(),
      content: String = "",
      func: (String) -> String) = "<i${attributes.join()}>${func(content.trimIndent())}</i>"

fun kbd(vararg attributes: Pair<String, String> = arrayOf(),
        content: String = "",
        func: (String) -> String) = "<kbd${attributes.join()}>${func(content.trimIndent())}</kbd>"

fun mark(vararg attributes: Pair<String, String> = arrayOf(),
         content: String = "",
         func: (String) -> String) = "<mark${attributes.join()}>${func(content.trimIndent())}</mark>"

fun q(vararg attributes: Pair<String, String> = arrayOf(),
      content: String = "",
      func: (String) -> String) = "<q${attributes.join()}>${func(content.trimIndent())}</q>"

fun rp(vararg attributes: Pair<String, String> = arrayOf(),
       content: String = "",
       func: (String) -> String) = "<rp${attributes.join()}>${func(content.trimIndent())}</rp>"

fun rt(vararg attributes: Pair<String, String> = arrayOf(),
       content: String = "",
       func: (String) -> String) = "<rt${attributes.join()}>${func(content.trimIndent())}</rt>"

fun rtc(vararg attributes: Pair<String, String> = arrayOf(),
        content: String = "",
        func: (String) -> String) = "<rtc${attributes.join()}>${func(content.trimIndent())}</rtc>"

fun ruby(vararg attributes: Pair<String, String> = arrayOf(),
         content: String = "",
         func: (String) -> String) = "<ruby${attributes.join()}>${func(content.trimIndent())}</ruby>"

fun s(vararg attributes: Pair<String, String> = arrayOf(),
      content: String = "",
      func: (String) -> String) = "<s${attributes.join()}>${func(content.trimIndent())}</s>"

fun samp(vararg attributes: Pair<String, String> = arrayOf(),
         content: String = "",
         func: (String) -> String) = "<samp${attributes.join()}>${func(content.trimIndent())}</samp>"

fun small(vararg attributes: Pair<String, String> = arrayOf(),
         content: String = "",
         func: (String) -> String) = "<small${attributes.join()}>${func(content.trimIndent())}</small>"

fun span(vararg attributes: Pair<String, String> = arrayOf(),
         content: String = "",
         func: (String) -> String) = "<span${attributes.join()}>${func(content.trimIndent())}</span>"

fun strong(vararg attributes: Pair<String, String> = arrayOf(),
           content: String = "",
           func: (String) -> String) = "<strong${attributes.join()}>${func(content.trimIndent())}</strong>"

fun sub(vararg attributes: Pair<String, String> = arrayOf(),
        content: String = "",
        func: (String) -> String) = "<sub${attributes.join()}>${func(content.trimIndent())}</sub>"

fun sup(vararg attributes: Pair<String, String> = arrayOf(),
        content: String = "",
        func: (String) -> String) = "<sup${attributes.join()}>${func(content.trimIndent())}</sup>"

fun time(vararg attributes: Pair<String, String> = arrayOf(),
         content: String = "",
         func: (String) -> String) = "<time${attributes.join()}>${func(content.trimIndent())}</time>"

fun u(vararg attributes: Pair<String, String> = arrayOf(),
       content: String = "",
       func: (String) -> String) = "<u${attributes.join()}>${func(content.trimIndent())}</u>"

fun variable(vararg attributes: Pair<String, String> = arrayOf(),
             content: String = "",
             func: (String) -> String) = "<var${attributes.join()}>${func(content.trimIndent())}</var>"

fun `var`(vararg attributes: Pair<String, String> = arrayOf(),
          content: String = "",
          func: (String) -> String) = "<var${attributes.join()}>${func(content.trimIndent())}</var>"

fun wbr(vararg attributes: Pair<String, String> = arrayOf(),
        content: String = "",
        func: (String) -> String) = "<wbr${attributes.join()}>${func(content.trimIndent())}</wbr>"

/* Image and multimedia */

fun area(vararg attributes: Pair<String, String> = arrayOf(),
         content: String = "",
         func: (String) -> String) = "<area${attributes.join()}>${func(content.trimIndent())}</area>"

fun audio(vararg attributes: Pair<String, String> = arrayOf(),
          content: String = "",
          func: (String) -> String) = "<audio${attributes.join()}>${func(content.trimIndent())}</audio>"

fun img(vararg attributes: Pair<String, String> = arrayOf(),
        content: String = "",
        func: (String) -> String) = "<img${attributes.join()}>${func(content.trimIndent())}</img>"

fun map(vararg attributes: Pair<String, String> = arrayOf(),
        content: String = "",
        func: (String) -> String) = "<map${attributes.join()}>${func(content.trimIndent())}</map>"

fun track(vararg attributes: Pair<String, String> = arrayOf(),
          content: String = "",
          func: (String) -> String) = "<track${attributes.join()}>${func(content.trimIndent())}</track>"

fun video(vararg attributes: Pair<String, String> = arrayOf(),
          content: String = "",
          func: (String) -> String) = "<video${attributes.join()}>${func(content.trimIndent())}</video>"

/* Embedded content */

fun embed(vararg attributes: Pair<String, String> = arrayOf(),
          content: String = "",
          func: (String) -> String) = "<embed${attributes.join()}>${func(content.trimIndent())}</embed>"

fun iframe(vararg attributes: Pair<String, String> = arrayOf(),
           content: String = "",
           func: (String) -> String) = "<iframe${attributes.join()}>${func(content.trimIndent())}</iframe>"

fun obj(vararg attributes: Pair<String, String> = arrayOf(),
        content: String = "",
        func: (String) -> String) = "<object${attributes.join()}>${func(content.trimIndent())}</object>"

fun `object`(vararg attributes: Pair<String, String> = arrayOf(),
            content: String = "",
            func: (String) -> String) = "<object${attributes.join()}>${func(content.trimIndent())}</object>"

fun param(vararg attributes: Pair<String, String> = arrayOf(),
          content: String = "",
          func: (String) -> String) = "<param${attributes.join()}>${func(content.trimIndent())}</param>"

fun picture(vararg attributes: Pair<String, String> = arrayOf(),
            content: String = "",
            func: (String) -> String) = "<picture${attributes.join()}>${func(content.trimIndent())}</picture>"

fun source(vararg attributes: Pair<String, String> = arrayOf(),
           content: String = "",
           func: (String) -> String) = "<source${attributes.join()}>${func(content.trimIndent())}</source>"

/* Scripting */

fun canvas(vararg attributes: Pair<String, String> = arrayOf(),
           content: String = "",
           func: (String) -> String) = "<canvas${attributes.join()}>${func(content.trimIndent())}</canvas>"

fun noscript(vararg attributes: Pair<String, String> = arrayOf(),
             content: String = "",
             func: (String) -> String) = "<noscript${attributes.join()}>${func(content.trimIndent())}</noscript>"

fun script(vararg attributes: Pair<String, String> = arrayOf(),
           content: String = "",
           func: (String) -> String) = "<script${attributes.join()}>${func(content.trimIndent())}</script>"

/* Demarcating edits */

fun del(vararg attributes: Pair<String, String> = arrayOf(),
        content: String = "",
        func: (String) -> String) = "<del${attributes.join()}>${func(content.trimIndent())}</del>"

fun ins(vararg attributes: Pair<String, String> = arrayOf(),
        content: String = "",
        func: (String) -> String) = "<ins${attributes.join()}>${func(content.trimIndent())}</ins>"

/* Table content */

fun caption(vararg attributes: Pair<String, String> = arrayOf(),
            content: String = "",
            func: (String) -> String) = "<caption${attributes.join()}>${func(content.trimIndent())}</caption>"

fun col(vararg attributes: Pair<String, String> = arrayOf()) = "<col${attributes.join()}/>"

fun colgroup(vararg attributes: Pair<String, String> = arrayOf(),
             content: String = "",
             func: (String) -> String) = "<colgroup${attributes.join()}>${func(content.trimIndent())}</colgroup>"

fun table(vararg attributes: Pair<String, String> = arrayOf(),
          content: String = "",
          func: (String) -> String) = "<table${attributes.join()}>${func(content.trimIndent())}</table>"

fun tbody(vararg attributes: Pair<String, String> = arrayOf(),
          content: String = "",
          func: (String) -> String) = "<tbody${attributes.join()}>${func(content.trimIndent())}</tbody>"

fun td(vararg attributes: Pair<String, String> = arrayOf(),
       content: String = "",
       func: (String) -> String) = "<td${attributes.join()}>${func(content.trimIndent())}</td>"

fun tfoot(vararg attributes: Pair<String, String> = arrayOf(),
          content: String = "",
          func: (String) -> String) = "<tfoot${attributes.join()}>${func(content.trimIndent())}</tfoot>"

fun th(vararg attributes: Pair<String, String> = arrayOf(),
       content: String = "",
       func: (String) -> String) = "<th${attributes.join()}>${func(content.trimIndent())}</th>"

fun thead(vararg attributes: Pair<String, String> = arrayOf(),
          content: String = "",
          func: (String) -> String) = "<thead${attributes.join()}>${func(content.trimIndent())}</thead>"

fun tr(vararg attributes: Pair<String, String> = arrayOf(),
       content: String = "",
       func: (String) -> String) = "<tr${attributes.join()}>${func(content.trimIndent())}</tr>"

/* Forms */

fun button(vararg attributes: Pair<String, String> = arrayOf(),
           content: String = "",
           func: (String) -> String) = "<button${attributes.join()}>${func(content.trimIndent())}</button>"

fun datalist(vararg attributes: Pair<String, String> = arrayOf(),
             content: String = "",
             func: (String) -> String) = "<datalist${attributes.join()}>${func(content.trimIndent())}</datalist>"

fun fieldset(vararg attributes: Pair<String, String> = arrayOf(),
             content: String = "",
             func: (String) -> String) = "<fieldset${attributes.join()}>${func(content.trimIndent())}</fieldset>"

fun form(vararg attributes: Pair<String, String> = arrayOf(),
         content: String = "",
         func: (String) -> String) = "<form${attributes.join()}>${func(content.trimIndent())}</form>"

fun input(vararg attributes: Pair<String, String> = arrayOf()) = "<input${attributes.join()}/>"
fun input(vararg attributes: Pair<String, String> = arrayOf(),
          content: String = "",
          func: (String) -> String) = "<input${attributes.join()}>${func(content.trimIndent())}</input>"

fun label(vararg attributes: Pair<String, String> = arrayOf(),
          content: String = "",
          func: (String) -> String) = "<label${attributes.join()}>${func(content.trimIndent())}</label>"

fun legend(vararg attributes: Pair<String, String> = arrayOf(),
           content: String = "",
           func: (String) -> String) = "<legend${attributes.join()}>${func(content.trimIndent())}</legend>"

fun meter(vararg attributes: Pair<String, String> = arrayOf(),
          content: String = "",
          func: (String) -> String) = "<meter${attributes.join()}>${func(content.trimIndent())}</meter>"

fun optgroup(vararg attributes: Pair<String, String> = arrayOf(),
             content: String = "",
             func: (String) -> String) = "<optgroup${attributes.join()}>${func(content.trimIndent())}</optgroup>"

fun option(vararg attributes: Pair<String, String> = arrayOf(),
           content: String = "",
           func: (String) -> String) = "<option${attributes.join()}>${func(content.trimIndent())}</option>"

fun output(vararg attributes: Pair<String, String> = arrayOf(),
           content: String = "",
           func: (String) -> String) = "<output${attributes.join()}>${func(content.trimIndent())}</output>"

fun progress(vararg attributes: Pair<String, String> = arrayOf(),
             content: String = "",
             func: (String) -> String) = "<progress${attributes.join()}>${func(content.trimIndent())}</progress>"

fun select(vararg attributes: Pair<String, String> = arrayOf(),
           content: String = "",
           func: (String) -> String) = "<select${attributes.join()}>${func(content.trimIndent())}</select>"

fun textarea(vararg attributes: Pair<String, String> = arrayOf(),
             content: String = "",
             func: (String) -> String) = "<textarea${attributes.join()}>${func(content.trimIndent())}</textarea>"

/* Interactive elements */

fun details(vararg attributes: Pair<String, String> = arrayOf(),
            content: String = "",
            func: (String) -> String) = "<details${attributes.join()}>${func(content.trimIndent())}</details>"

fun dialog(vararg attributes: Pair<String, String> = arrayOf(),
           content: String = "",
           func: (String) -> String) = "<dialog${attributes.join()}>${func(content.trimIndent())}</dialog>"

fun menu(vararg attributes: Pair<String, String> = arrayOf(),
         content: String = "",
         func: (String) -> String) = "<menu${attributes.join()}>${func(content.trimIndent())}</menu>"

fun summary(vararg attributes: Pair<String, String> = arrayOf(),
            content: String = "",
            func: (String) -> String) = "<summary${attributes.join()}>${func(content.trimIndent())}</summary>"

/* Web Components */

fun slot(vararg attributes: Pair<String, String> = arrayOf(),
         content: String = "",
         func: (String) -> String) = "<slot${attributes.join()}>${func(content.trimIndent())}</slot>"

fun template(vararg attributes: Pair<String, String> = arrayOf(),
             content: String = "",
             func: (String) -> String) = "<template${attributes.join()}>${func(content.trimIndent())}</template>"

/* Obsolete and deprecated elements */

fun acronym(vararg attributes: Pair<String, String> = arrayOf(),
            content: String = "",
            func: (String) -> String) = "<acronym${attributes.join()}>${func(content.trimIndent())}</acronym>"

fun applet(vararg attributes: Pair<String, String> = arrayOf(),
           content: String = "",
           func: (String) -> String) = "<applet${attributes.join()}>${func(content.trimIndent())}</applet>"

fun basefont(vararg attributes: Pair<String, String> = arrayOf(),
             content: String = "",
             func: (String) -> String) = "<basefont${attributes.join()}>${func(content.trimIndent())}</basefont>"

fun bgsound(vararg attributes: Pair<String, String> = arrayOf(),
            content: String = "",
            func: (String) -> String) = "<bgsound${attributes.join()}>${func(content.trimIndent())}</bgsound>"

fun big(vararg attributes: Pair<String, String> = arrayOf(),
        content: String = "",
        func: (String) -> String) = "<big${attributes.join()}>${func(content.trimIndent())}</big>"

fun blink(vararg attributes: Pair<String, String> = arrayOf(),
          content: String = "",
          func: (String) -> String) = "<blink${attributes.join()}>${func(content.trimIndent())}</blink>"

fun center(vararg attributes: Pair<String, String> = arrayOf(),
           content: String = "",
           func: (String) -> String) = "<center${attributes.join()}>${func(content.trimIndent())}</center>"

fun command(vararg attributes: Pair<String, String> = arrayOf(),
            content: String = "",
            func: (String) -> String) = "<command${attributes.join()}>${func(content.trimIndent())}</command>"

fun content(vararg attributes: Pair<String, String> = arrayOf(),
            content: String = "",
            func: (String) -> String) = "<content${attributes.join()}>${func(content.trimIndent())}</content>"

fun dir(vararg attributes: Pair<String, String> = arrayOf(),
        content: String = "",
        func: (String) -> String) = "<dir${attributes.join()}>${func(content.trimIndent())}</dir>"

fun element(vararg attributes: Pair<String, String> = arrayOf(),
            content: String = "",
            func: (String) -> String) = "<element${attributes.join()}>${func(content.trimIndent())}</element>"

fun font(vararg attributes: Pair<String, String> = arrayOf(),
         content: String = "",
         func: (String) -> String) = "<font${attributes.join()}>${func(content.trimIndent())}</font>"

fun frame(vararg attributes: Pair<String, String> = arrayOf(),
          content: String = "",
          func: (String) -> String) = "<frame${attributes.join()}>${func(content.trimIndent())}</frame>"

fun frameset(vararg attributes: Pair<String, String> = arrayOf(),
             content: String = "",
             func: (String) -> String) = "<frameset${attributes.join()}>${func(content.trimIndent())}</frameset>"

fun image(vararg attributes: Pair<String, String> = arrayOf(),
          content: String = "",
          func: (String) -> String) = "<image${attributes.join()}>${func(content.trimIndent())}</image>"

fun isindex(vararg attributes: Pair<String, String> = arrayOf(),
            content: String = "",
            func: (String) -> String) = "<isindex${attributes.join()}>${func(content.trimIndent())}</isindex>"

fun keygen(vararg attributes: Pair<String, String> = arrayOf(),
           content: String = "",
           func: (String) -> String) = "<keygen${attributes.join()}>${func(content.trimIndent())}</keygen>"

fun listing(vararg attributes: Pair<String, String> = arrayOf(),
            content: String = "",
            func: (String) -> String) = "<listing${attributes.join()}>${func(content.trimIndent())}</listing>"

fun marquee(vararg attributes: Pair<String, String> = arrayOf(),
            content: String = "",
            func: (String) -> String) = "<marquee${attributes.join()}>${func(content.trimIndent())}</marquee>"

fun menuitem(vararg attributes: Pair<String, String> = arrayOf()) = "<menuitem${attributes.join()}/>"
fun menuitem(vararg attributes: Pair<String, String> = arrayOf(),
             content: String = "",
             func: (String) -> String) = "<menuitem${attributes.join()}>${func(content.trimIndent())}</menuitem>"

fun multicol(vararg attributes: Pair<String, String> = arrayOf(),
             content: String = "",
             func: (String) -> String) = "<multicol${attributes.join()}>${func(content.trimIndent())}</multicol>"

fun nextid(vararg attributes: Pair<String, String> = arrayOf(),
           content: String = "",
           func: (String) -> String) = "<nextid${attributes.join()}>${func(content.trimIndent())}</nextid>"

fun nobr(vararg attributes: Pair<String, String> = arrayOf(),
         content: String = "",
         func: (String) -> String) = "<nobr${attributes.join()}>${func(content.trimIndent())}</nobr>"

fun noembed(vararg attributes: Pair<String, String> = arrayOf(),
            content: String = "",
            func: (String) -> String) = "<noembed${attributes.join()}>${func(content.trimIndent())}</noembed>"

fun noframes(vararg attributes: Pair<String, String> = arrayOf(),
             content: String = "",
             func: (String) -> String) = "<noframes${attributes.join()}>${func(content.trimIndent())}</noframes>"

fun plaintext(vararg attributes: Pair<String, String> = arrayOf(),
              content: String = "",
              func: (String) -> String) = "<plaintext${attributes.join()}>${func(content.trimIndent())}</plaintext>"

fun shadow(vararg attributes: Pair<String, String> = arrayOf(),
             content: String = "",
             func: (String) -> String) = "<shadow${attributes.join()}>${func(content.trimIndent())}</shadow>"

fun spacer(vararg attributes: Pair<String, String> = arrayOf(),
           content: String = "",
           func: (String) -> String) = "<spacer${attributes.join()}>${func(content.trimIndent())}</spacer>"

fun strike(vararg attributes: Pair<String, String> = arrayOf(),
           content: String = "",
           func: (String) -> String) = "<strike${attributes.join()}>${func(content.trimIndent())}</strike>"

fun tt(vararg attributes: Pair<String, String> = arrayOf(),
       content: String = "",
       func: (String) -> String) = "<tt${attributes.join()}>${func(content.trimIndent())}</tt>"

fun xmp(vararg attributes: Pair<String, String> = arrayOf(),
        content: String = "",
        func: (String) -> String) = "<xmp${attributes.join()}>${func(content.trimIndent())}</xmp>"
