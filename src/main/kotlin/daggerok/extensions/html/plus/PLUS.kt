@file:JvmName("PLUS")

/* PLUS: Stateless Kotlin HTML DSL */

package daggerok.extensions.html.plus

/* internal API */

internal fun Array<out Pair<String, String>>.toAttributes() = this.toMap().toAttributes()

internal fun Map<String, String>.toAttributes() =
    if (this.isEmpty()) "" else " " + this.entries
        .joinToString(separator = " ") { """${it.key}='${it.value}'""" }

/* public API */

/* DOM API */

/* main root */

fun html(vararg pairs: Pair<String, String> = arrayOf(),
         close: Boolean = false, selfClosing: Boolean = close,
         innerHTML: String = "",
         transform: (() -> String)? = null) =
    if (selfClosing) "<html${pairs.toAttributes()}/>"
    else "<!DOCTYPE html><html${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</html>"

/* document head */

fun head(vararg pairs: Pair<String, String> = arrayOf(),
         close: Boolean = false, selfClosing: Boolean = close,
         innerHTML: String = "",
         transform: (() -> String)? = null) =
    if (selfClosing) "<head${pairs.toAttributes()}/>"
    else "<head${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</head>"

/* head children */

fun style(vararg pairs: Pair<String, String> = arrayOf(),
          close: Boolean = false, selfClosing: Boolean = close,
          innerHTML: String = "",
          transform: (() -> String)? = null) =
    if (selfClosing) "<style${pairs.toAttributes()}/>"
    else "<style${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</style>"

fun title(vararg pairs: Pair<String, String> = arrayOf(),
          close: Boolean = false, selfClosing: Boolean = close,
          innerHTML: String = "",
          transform: (() -> String)? = null) =
    if (selfClosing) "<title${pairs.toAttributes()}/>"
    else "<title${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</title>"

/* self-closing: <base /> <link /> <meta /> */
fun base(vararg pairs: Pair<String, String> = arrayOf(),
         close: Boolean = true, selfClosing: Boolean = close,
         innerHTML: String = "",
         transform: (() -> String)? = null) =
    if (selfClosing) "<base${pairs.toAttributes()}/>"
    else "<base${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</base>"

fun link(vararg pairs: Pair<String, String> = arrayOf(),
         close: Boolean = true, selfClosing: Boolean = close,
         innerHTML: String = "",
         transform: (() -> String)? = null) =
    if (selfClosing) "<link${pairs.toAttributes()}/>"
    else "<link${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</link>"

fun meta(vararg pairs: Pair<String, String> = arrayOf(),
         close: Boolean = true, selfClosing: Boolean = close,
         innerHTML: String = "",
         transform: (() -> String)? = null) =
    if (selfClosing) "<meta${pairs.toAttributes()}/>"
    else "<meta${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</meta>"

/* document body */

fun body(vararg pairs: Pair<String, String> = arrayOf(),
         close: Boolean = false, selfClosing: Boolean = close,
         innerHTML: String = "",
         transform: (() -> String)? = null) =
    if (selfClosing) "<body${pairs.toAttributes()}/>"
    else "<body${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</body>"

/* body children */

/*
  <area /> <br /> <col /> <command /> <embed /> <hr /> <img /> <input />
  <keygen /> <param /> <source /> <track /> <wbr />
 */

// self-closing:

fun area(vararg pairs: Pair<String, String> = arrayOf(),
         close: Boolean = true, selfClosing: Boolean = close,
         innerHTML: String = "",
         transform: (() -> String)? = null) =
    if (selfClosing) "<area${pairs.toAttributes()}/>"
    else "<area${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</area>"

fun command(vararg pairs: Pair<String, String> = arrayOf(),
            close: Boolean = true, selfClosing: Boolean = close,
            innerHTML: String = "",
            transform: (() -> String)? = null) =
    if (selfClosing) "<command${pairs.toAttributes()}/>"
    else "<command${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</command>"

fun embed(vararg pairs: Pair<String, String> = arrayOf(),
          close: Boolean = true, selfClosing: Boolean = close,
          innerHTML: String = "",
          transform: (() -> String)? = null) =
    if (selfClosing) "<embed${pairs.toAttributes()}/>"
    else "<embed${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</embed>"

fun ht(vararg pairs: Pair<String, String> = arrayOf(),
       close: Boolean = true, selfClosing: Boolean = close,
       innerHTML: String = "",
       transform: (() -> String)? = null) =
    if (selfClosing) "<ht${pairs.toAttributes()}/>"
    else "<ht${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</ht>"

fun img(vararg pairs: Pair<String, String> = arrayOf(),
        close: Boolean = true, selfClosing: Boolean = close,
        innerHTML: String = "",
        transform: (() -> String)? = null) =
    if (selfClosing) "<img${pairs.toAttributes()}/>"
    else "<img${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</img>"

fun keygen(vararg pairs: Pair<String, String> = arrayOf(),
           close: Boolean = true, selfClosing: Boolean = close,
           innerHTML: String = "",
           transform: (() -> String)? = null) =
    if (selfClosing) "<keygen${pairs.toAttributes()}/>"
    else "<keygen${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</keygen>"

fun param(vararg pairs: Pair<String, String> = arrayOf(),
          close: Boolean = true, selfClosing: Boolean = close,
          innerHTML: String = "",
          transform: (() -> String)? = null) =
    if (selfClosing) "<param${pairs.toAttributes()}/>"
    else "<param${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</param>"

fun source(vararg pairs: Pair<String, String> = arrayOf(),
           close: Boolean = true, selfClosing: Boolean = close,
           innerHTML: String = "",
           transform: (() -> String)? = null) =
    if (selfClosing) "<source${pairs.toAttributes()}/>"
    else "<source${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</source>"

fun track(vararg pairs: Pair<String, String> = arrayOf(),
          close: Boolean = true, selfClosing: Boolean = close,
          innerHTML: String = "",
          transform: (() -> String)? = null) =
    if (selfClosing) "<track${pairs.toAttributes()}/>"
    else "<track${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</track>"

/* Content sectioning */

fun address(vararg pairs: Pair<String, String> = arrayOf(),
            close: Boolean = false, selfClosing: Boolean = close,
            innerHTML: String = "",
            transform: (() -> String)? = null) =
    if (selfClosing) "<address${pairs.toAttributes()}/>"
    else "<address${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</address>"

fun article(vararg pairs: Pair<String, String> = arrayOf(),
            close: Boolean = false, selfClosing: Boolean = close,
            innerHTML: String = "",
            transform: (() -> String)? = null) =
    if (selfClosing) "<article${pairs.toAttributes()}/>"
    else "<article${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</article>"

fun aside(vararg pairs: Pair<String, String> = arrayOf(),
          close: Boolean = false, selfClosing: Boolean = close,
          innerHTML: String = "",
          transform: (() -> String)? = null) =
    if (selfClosing) "<aside${pairs.toAttributes()}/>"
    else "<aside${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</aside>"

fun footer(vararg pairs: Pair<String, String> = arrayOf(),
           close: Boolean = false, selfClosing: Boolean = close,
           innerHTML: String = "",
           transform: (() -> String)? = null) =
    if (selfClosing) "<footer${pairs.toAttributes()}/>"
    else "<footer${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</footer>"

fun header(vararg pairs: Pair<String, String> = arrayOf(),
           close: Boolean = false, selfClosing: Boolean = close,
           innerHTML: String = "",
           transform: (() -> String)? = null) =
    if (selfClosing) "<header${pairs.toAttributes()}/>"
    else "<header${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</header>"

fun h1(vararg pairs: Pair<String, String> = arrayOf(),
       close: Boolean = false, selfClosing: Boolean = close,
       innerHTML: String = "",
       transform: (() -> String)? = null) =
    if (selfClosing) "<h1${pairs.toAttributes()}/>"
    else "<h1${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</h1>"

fun h2(vararg pairs: Pair<String, String> = arrayOf(),
       close: Boolean = false, selfClosing: Boolean = close,
       innerHTML: String = "",
       transform: (() -> String)? = null) =
    if (selfClosing) "<h2${pairs.toAttributes()}/>"
    else "<h2${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</h2>"

fun h3(vararg pairs: Pair<String, String> = arrayOf(),
       close: Boolean = false, selfClosing: Boolean = close,
       innerHTML: String = "",
       transform: (() -> String)? = null) =
    if (selfClosing) "<h3${pairs.toAttributes()}/>"
    else "<h3${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</h3>"

fun h4(vararg pairs: Pair<String, String> = arrayOf(),
       close: Boolean = false, selfClosing: Boolean = close,
       innerHTML: String = "",
       transform: (() -> String)? = null) =
    if (selfClosing) "<h4${pairs.toAttributes()}/>"
    else "<h4${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</h4>"

fun h5(vararg pairs: Pair<String, String> = arrayOf(),
       close: Boolean = false, selfClosing: Boolean = close,
       innerHTML: String = "",
       transform: (() -> String)? = null) =
    if (selfClosing) "<h5${pairs.toAttributes()}/>"
    else "<h5${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</h5>"

fun h6(vararg pairs: Pair<String, String> = arrayOf(),
       close: Boolean = false, selfClosing: Boolean = close,
       innerHTML: String = "",
       transform: (() -> String)? = null) =
    if (selfClosing) "<h6${pairs.toAttributes()}/>"
    else "<h6${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</h6>"

fun hgroup(vararg pairs: Pair<String, String> = arrayOf(),
           close: Boolean = false, selfClosing: Boolean = close,
           innerHTML: String = "",
           transform: (() -> String)? = null) =
    if (selfClosing) "<hgroup${pairs.toAttributes()}/>"
    else "<hgroup${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</hgroup>"

fun nav(vararg pairs: Pair<String, String> = arrayOf(),
        close: Boolean = false, selfClosing: Boolean = close,
        innerHTML: String = "",
        transform: (() -> String)? = null) =
    if (selfClosing) "<nav${pairs.toAttributes()}/>"
    else "<nav${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</nav>"

fun section(vararg pairs: Pair<String, String> = arrayOf(),
            close: Boolean = false, selfClosing: Boolean = close,
            innerHTML: String = "",
            transform: (() -> String)? = null) =
    if (selfClosing) "<section${pairs.toAttributes()}/>"
    else "<section${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</section>"

/* Text content */

fun blockquote(vararg pairs: Pair<String, String> = arrayOf(),
               close: Boolean = false, selfClosing: Boolean = close,
               innerHTML: String = "",
               transform: (() -> String)? = null) =
    if (selfClosing) "<blockquote${pairs.toAttributes()}/>"
    else "<blockquote${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</blockquote>"

fun dd(vararg pairs: Pair<String, String> = arrayOf(),
       close: Boolean = false, selfClosing: Boolean = close,
       innerHTML: String = "",
       transform: (() -> String)? = null) =
    if (selfClosing) "<dd${pairs.toAttributes()}/>"
    else "<dd${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</dd>"

fun div(vararg pairs: Pair<String, String> = arrayOf(),
        close: Boolean = false, selfClosing: Boolean = close,
        innerHTML: String = "",
        transform: (() -> String)? = null) =
    if (selfClosing) "<div${pairs.toAttributes()}/>"
    else "<div${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</div>"

fun dl(vararg pairs: Pair<String, String> = arrayOf(),
       close: Boolean = false, selfClosing: Boolean = close,
       innerHTML: String = "",
       transform: (() -> String)? = null) =
    if (selfClosing) "<dl${pairs.toAttributes()}/>"
    else "<dl${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</dl>"

fun dt(vararg pairs: Pair<String, String> = arrayOf(),
       close: Boolean = false, selfClosing: Boolean = close,
       innerHTML: String = "",
       transform: (() -> String)? = null) =
    if (selfClosing) "<dt${pairs.toAttributes()}/>"
    else "<dt${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</dt>"

fun figcaption(vararg pairs: Pair<String, String> = arrayOf(),
               close: Boolean = false, selfClosing: Boolean = close,
               innerHTML: String = "",
               transform: (() -> String)? = null) =
    if (selfClosing) "<figcaption${pairs.toAttributes()}/>"
    else "<figcaption${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</figcaption>"

fun figure(vararg pairs: Pair<String, String> = arrayOf(),
           close: Boolean = false, selfClosing: Boolean = close,
           innerHTML: String = "",
           transform: (() -> String)? = null) =
    if (selfClosing) "<figure${pairs.toAttributes()}/>"
    else "<figure${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</figure>"

fun li(vararg pairs: Pair<String, String> = arrayOf(),
       close: Boolean = false, selfClosing: Boolean = close,
       innerHTML: String = "",
       transform: (() -> String)? = null) =
    if (selfClosing) "<li${pairs.toAttributes()}/>"
    else "<li${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</li>"

fun main(vararg pairs: Pair<String, String> = arrayOf(),
         close: Boolean = false, selfClosing: Boolean = close,
         innerHTML: String = "",
         transform: (() -> String)? = null) =
    if (selfClosing) "<main${pairs.toAttributes()}/>"
    else "<main${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</main>"

fun ol(vararg pairs: Pair<String, String> = arrayOf(),
       close: Boolean = false, selfClosing: Boolean = close,
       innerHTML: String = "",
       transform: (() -> String)? = null) =
    if (selfClosing) "<ol${pairs.toAttributes()}/>"
    else "<ol${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</ol>"

fun ul(vararg pairs: Pair<String, String> = arrayOf(),
       close: Boolean = false, selfClosing: Boolean = close,
       innerHTML: String = "",
       transform: (() -> String)? = null) =
    if (selfClosing) "<ul${pairs.toAttributes()}/>"
    else "<ul${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</ul>"

fun p(vararg pairs: Pair<String, String> = arrayOf(),
      close: Boolean = false, selfClosing: Boolean = close,
      innerHTML: String = "",
      transform: (() -> String)? = null) =
    if (selfClosing) "<p${pairs.toAttributes()}/>"
    else "<p${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</p>"

fun pre(vararg pairs: Pair<String, String> = arrayOf(),
        close: Boolean = false, selfClosing: Boolean = close,
        innerHTML: String = "",
        transform: (() -> String)? = null) =
    if (selfClosing) "<pre${pairs.toAttributes()}/>"
    else "<pre${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</pre>"

/* Inline text semantics */

fun a(vararg pairs: Pair<String, String> = arrayOf(),
      close: Boolean = false, selfClosing: Boolean = close,
      innerHTML: String = "",
      transform: (() -> String)? = null) =
    if (selfClosing) "<a${pairs.toAttributes()}/>"
    else "<a${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</a>"

fun abbr(vararg pairs: Pair<String, String> = arrayOf(),
         close: Boolean = false, selfClosing: Boolean = close,
         innerHTML: String = "",
         transform: (() -> String)? = null) =
    if (selfClosing) "<abbr${pairs.toAttributes()}/>"
    else "<abbr${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</abbr>"

fun b(vararg pairs: Pair<String, String> = arrayOf(),
      close: Boolean = false, selfClosing: Boolean = close,
      innerHTML: String = "",
      transform: (() -> String)? = null) =
    if (selfClosing) "<b${pairs.toAttributes()}/>"
    else "<b${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</b>"

fun bdi(vararg pairs: Pair<String, String> = arrayOf(),
        close: Boolean = false, selfClosing: Boolean = close,
        innerHTML: String = "",
        transform: (() -> String)? = null) =
    if (selfClosing) "<bdi${pairs.toAttributes()}/>"
    else "<bdi${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</bdi>"

fun bdo(vararg pairs: Pair<String, String> = arrayOf(),
        close: Boolean = false, selfClosing: Boolean = close,
        innerHTML: String = "",
        transform: (() -> String)? = null) =
    if (selfClosing) "<bdo${pairs.toAttributes()}/>"
    else "<bdo${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</bdo>"

fun cite(vararg pairs: Pair<String, String> = arrayOf(),
         close: Boolean = false, selfClosing: Boolean = close,
         innerHTML: String = "",
         transform: (() -> String)? = null) =
    if (selfClosing) "<cite${pairs.toAttributes()}/>"
    else "<cite${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</cite>"

fun code(vararg pairs: Pair<String, String> = arrayOf(),
         close: Boolean = false, selfClosing: Boolean = close,
         innerHTML: String = "",
         transform: (() -> String)? = null) =
    if (selfClosing) "<code${pairs.toAttributes()}/>"
    else "<code${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</code>"

fun dfn(vararg pairs: Pair<String, String> = arrayOf(),
        close: Boolean = false, selfClosing: Boolean = close,
        innerHTML: String = "",
        transform: (() -> String)? = null) =
    if (selfClosing) "<dfn${pairs.toAttributes()}/>"
    else "<dfn${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</dfn>"

fun em(vararg pairs: Pair<String, String> = arrayOf(),
       close: Boolean = false, selfClosing: Boolean = close,
       innerHTML: String = "",
       transform: (() -> String)? = null) =
    if (selfClosing) "<em${pairs.toAttributes()}/>"
    else "<em${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</em>"

fun i(vararg pairs: Pair<String, String> = arrayOf(),
      close: Boolean = false, selfClosing: Boolean = close,
      innerHTML: String = "",
      transform: (() -> String)? = null) =
    if (selfClosing) "<i${pairs.toAttributes()}/>"
    else "<i${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</i>"

fun kbd(vararg pairs: Pair<String, String> = arrayOf(),
        close: Boolean = false, selfClosing: Boolean = close,
        innerHTML: String = "",
        transform: (() -> String)? = null) =
    if (selfClosing) "<kbd${pairs.toAttributes()}/>"
    else "<kbd${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</kbd>"

fun mark(vararg pairs: Pair<String, String> = arrayOf(),
         close: Boolean = false, selfClosing: Boolean = close,
         innerHTML: String = "",
         transform: (() -> String)? = null) =
    if (selfClosing) "<mark${pairs.toAttributes()}/>"
    else "<mark${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</mark>"

fun q(vararg pairs: Pair<String, String> = arrayOf(),
      close: Boolean = false, selfClosing: Boolean = close,
      innerHTML: String = "",
      transform: (() -> String)? = null) =
    if (selfClosing) "<q${pairs.toAttributes()}/>"
    else "<q${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</q>"

fun rp(vararg pairs: Pair<String, String> = arrayOf(),
       close: Boolean = false, selfClosing: Boolean = close,
       innerHTML: String = "",
       transform: (() -> String)? = null) =
    if (selfClosing) "<rp${pairs.toAttributes()}/>"
    else "<rp${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</rp>"

fun rt(vararg pairs: Pair<String, String> = arrayOf(),
       close: Boolean = false, selfClosing: Boolean = close,
       innerHTML: String = "",
       transform: (() -> String)? = null) =
    if (selfClosing) "<rt${pairs.toAttributes()}/>"
    else "<rt${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</rt>"

fun rtc(vararg pairs: Pair<String, String> = arrayOf(),
        close: Boolean = false, selfClosing: Boolean = close,
        innerHTML: String = "",
        transform: (() -> String)? = null) =
    if (selfClosing) "<rtc${pairs.toAttributes()}/>"
    else "<rtc${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</rtc>"

fun ruby(vararg pairs: Pair<String, String> = arrayOf(),
         close: Boolean = false, selfClosing: Boolean = close,
         innerHTML: String = "",
         transform: (() -> String)? = null) =
    if (selfClosing) "<ruby${pairs.toAttributes()}/>"
    else "<ruby${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</ruby>"

fun s(vararg pairs: Pair<String, String> = arrayOf(),
      close: Boolean = false, selfClosing: Boolean = close,
      innerHTML: String = "",
      transform: (() -> String)? = null) =
    if (selfClosing) "<s${pairs.toAttributes()}/>"
    else "<s${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</s>"

fun samp(vararg pairs: Pair<String, String> = arrayOf(),
         close: Boolean = false, selfClosing: Boolean = close,
         innerHTML: String = "",
         transform: (() -> String)? = null) =
    if (selfClosing) "<samp${pairs.toAttributes()}/>"
    else "<samp${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</samp>"

fun small(vararg pairs: Pair<String, String> = arrayOf(),
          close: Boolean = false, selfClosing: Boolean = close,
          innerHTML: String = "",
          transform: (() -> String)? = null) =
    if (selfClosing) "<small${pairs.toAttributes()}/>"
    else "<small${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</small>"

fun span(vararg pairs: Pair<String, String> = arrayOf(),
         close: Boolean = false, selfClosing: Boolean = close,
         innerHTML: String = "",
         transform: (() -> String)? = null) =
    if (selfClosing) "<span${pairs.toAttributes()}/>"
    else "<span${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</span>"

fun strong(vararg pairs: Pair<String, String> = arrayOf(),
           close: Boolean = false, selfClosing: Boolean = close,
           innerHTML: String = "",
           transform: (() -> String)? = null) =
    if (selfClosing) "<strong${pairs.toAttributes()}/>"
    else "<strong${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</strong>"

fun sub(vararg pairs: Pair<String, String> = arrayOf(),
        close: Boolean = false, selfClosing: Boolean = close,
        innerHTML: String = "",
        transform: (() -> String)? = null) =
    if (selfClosing) "<sub${pairs.toAttributes()}/>"
    else "<sub${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</sub>"

fun time(vararg pairs: Pair<String, String> = arrayOf(),
         close: Boolean = false, selfClosing: Boolean = close,
         innerHTML: String = "",
         transform: (() -> String)? = null) =
    if (selfClosing) "<time${pairs.toAttributes()}/>"
    else "<time${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</time>"

fun u(vararg pairs: Pair<String, String> = arrayOf(),
      close: Boolean = false, selfClosing: Boolean = close,
      innerHTML: String = "",
      transform: (() -> String)? = null) =
    if (selfClosing) "<u${pairs.toAttributes()}/>"
    else "<u${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</u>"

fun variable(vararg pairs: Pair<String, String> = arrayOf(),
             close: Boolean = false, selfClosing: Boolean = close,
             innerHTML: String = "",
             transform: (() -> String)? = null) =
    if (selfClosing) "<var${pairs.toAttributes()}/>"
    else "<var${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</var>"

fun `var`(vararg pairs: Pair<String, String> = arrayOf(),
          close: Boolean = false, selfClosing: Boolean = close,
          innerHTML: String = "",
          transform: (() -> String)? = null) =
    if (selfClosing) "<var${pairs.toAttributes()}/>"
    else "<var${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</var>"

// self-closing:

fun br(vararg pairs: Pair<String, String> = arrayOf(),
       close: Boolean = true, selfClosing: Boolean = close,
       innerHTML: String = "",
       transform: (() -> String)? = null) =
    if (selfClosing) "<br${pairs.toAttributes()}/>"
    else "<br${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</br>"

fun wbr(vararg pairs: Pair<String, String> = arrayOf(),
        close: Boolean = true, selfClosing: Boolean = close,
        innerHTML: String = "",
        transform: (() -> String)? = null) =
    if (selfClosing) "<wbr${pairs.toAttributes()}/>"
    else "<wbr${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</wbr>"

/* Image and multimedia */

fun audio(vararg pairs: Pair<String, String> = arrayOf(),
          close: Boolean = false, selfClosing: Boolean = close,
          innerHTML: String = "",
          transform: (() -> String)? = null) =
    if (selfClosing) "<audio${pairs.toAttributes()}/>"
    else "<audio${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</audio>"

fun map(vararg pairs: Pair<String, String> = arrayOf(),
        close: Boolean = false, selfClosing: Boolean = close,
        innerHTML: String = "",
        transform: (() -> String)? = null) =
    if (selfClosing) "<map${pairs.toAttributes()}/>"
    else "<map${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</map>"

// self-closing:

fun video(vararg pairs: Pair<String, String> = arrayOf(),
          close: Boolean = true, selfClosing: Boolean = close,
          innerHTML: String = "",
          transform: (() -> String)? = null) =
    if (selfClosing) "<video${pairs.toAttributes()}/>"
    else "<video${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</video>"

/* Embedded content */

fun iframe(vararg pairs: Pair<String, String> = arrayOf(),
           close: Boolean = false, selfClosing: Boolean = close,
           innerHTML: String = "",
           transform: (() -> String)? = null) =
    if (selfClosing) "<iframe${pairs.toAttributes()}/>"
    else "<iframe${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</iframe>"

fun obj(vararg pairs: Pair<String, String> = arrayOf(),
        close: Boolean = false, selfClosing: Boolean = close,
        innerHTML: String = "",
        transform: (() -> String)? = null) =
    if (selfClosing) "<object${pairs.toAttributes()}/>"
    else "<object${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</object>"

fun `object`(vararg pairs: Pair<String, String> = arrayOf(),
             close: Boolean = false, selfClosing: Boolean = close,
             innerHTML: String = "",
             transform: (() -> String)? = null) =
    if (selfClosing) "<object${pairs.toAttributes()}/>"
    else "<object${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</object>"

/* Scripting */

fun canvas(vararg pairs: Pair<String, String> = arrayOf(),
           close: Boolean = false, selfClosing: Boolean = close,
           innerHTML: String = "",
           transform: (() -> String)? = null) =
    if (selfClosing) "<canvas${pairs.toAttributes()}/>"
    else "<canvas${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</canvas>"

fun noscript(vararg pairs: Pair<String, String> = arrayOf(),
             close: Boolean = false, selfClosing: Boolean = close,
             innerHTML: String = "",
             transform: (() -> String)? = null) =
    if (selfClosing) "<noscript${pairs.toAttributes()}/>"
    else "<noscript${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</noscript>"

fun script(vararg pairs: Pair<String, String> = arrayOf(),
           close: Boolean = false, selfClosing: Boolean = close,
           innerHTML: String = "",
           transform: (() -> String)? = null) =
    if (selfClosing) "<script${pairs.toAttributes()}/>"
    else "<script${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</script>"

/* Demarcating edits */

fun del(vararg pairs: Pair<String, String> = arrayOf(),
        close: Boolean = false, selfClosing: Boolean = close,
        innerHTML: String = "",
        transform: (() -> String)? = null) =
    if (selfClosing) "<del${pairs.toAttributes()}/>"
    else "<del${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</del>"

fun ins(vararg pairs: Pair<String, String> = arrayOf(),
        close: Boolean = false, selfClosing: Boolean = close,
        innerHTML: String = "",
        transform: (() -> String)? = null) =
    if (selfClosing) "<ins${pairs.toAttributes()}/>"
    else "<ins${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</ins>"

/* Table content */

fun caption(vararg pairs: Pair<String, String> = arrayOf(),
            close: Boolean = false, selfClosing: Boolean = close,
            innerHTML: String = "",
            transform: (() -> String)? = null) =
    if (selfClosing) "<caption${pairs.toAttributes()}/>"
    else "<caption${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</caption>"

fun colgroup(vararg pairs: Pair<String, String> = arrayOf(),
             close: Boolean = false, selfClosing: Boolean = close,
             innerHTML: String = "",
             transform: (() -> String)? = null) =
    if (selfClosing) "<colgroup${pairs.toAttributes()}/>"
    else "<colgroup${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</colgroup>"

fun table(vararg pairs: Pair<String, String> = arrayOf(),
          close: Boolean = false, selfClosing: Boolean = close,
          innerHTML: String = "",
          transform: (() -> String)? = null) =
    if (selfClosing) "<table${pairs.toAttributes()}/>"
    else "<table${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</table>"

fun tbody(vararg pairs: Pair<String, String> = arrayOf(),
          close: Boolean = false, selfClosing: Boolean = close,
          innerHTML: String = "",
          transform: (() -> String)? = null) =
    if (selfClosing) "<tbody${pairs.toAttributes()}/>"
    else "<tbody${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</tbody>"

fun td(vararg pairs: Pair<String, String> = arrayOf(),
       close: Boolean = false, selfClosing: Boolean = close,
       innerHTML: String = "",
       transform: (() -> String)? = null) =
    if (selfClosing) "<td${pairs.toAttributes()}/>"
    else "<td${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</td>"

fun tfoot(vararg pairs: Pair<String, String> = arrayOf(),
          close: Boolean = false, selfClosing: Boolean = close,
          innerHTML: String = "",
          transform: (() -> String)? = null) =
    if (selfClosing) "<tfoot${pairs.toAttributes()}/>"
    else "<tfoot${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</tfoot>"

fun th(vararg pairs: Pair<String, String> = arrayOf(),
       close: Boolean = false, selfClosing: Boolean = close,
       innerHTML: String = "",
       transform: (() -> String)? = null) =
    if (selfClosing) "<th${pairs.toAttributes()}/>"
    else "<th${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</th>"

fun thead(vararg pairs: Pair<String, String> = arrayOf(),
          close: Boolean = false, selfClosing: Boolean = close,
          innerHTML: String = "",
          transform: (() -> String)? = null) =
    if (selfClosing) "<thead${pairs.toAttributes()}/>"
    else "<thead${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</thead>"

fun tr(vararg pairs: Pair<String, String> = arrayOf(),
       close: Boolean = false, selfClosing: Boolean = close,
       innerHTML: String = "",
       transform: (() -> String)? = null) =
    if (selfClosing) "<tr${pairs.toAttributes()}/>"
    else "<tr${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</tr>"

// self-closing:

fun col(vararg pairs: Pair<String, String> = arrayOf(),
        close: Boolean = true, selfClosing: Boolean = close,
        innerHTML: String = "",
        transform: (() -> String)? = null) =
    if (selfClosing) "<col${pairs.toAttributes()}/>"
    else "<col${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</col>"

/* Forms */

fun button(vararg pairs: Pair<String, String> = arrayOf(),
           close: Boolean = false, selfClosing: Boolean = close,
           innerHTML: String = "",
           transform: (() -> String)? = null) =
    if (selfClosing) "<button${pairs.toAttributes()}/>"
    else "<button${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</button>"

fun datalist(vararg pairs: Pair<String, String> = arrayOf(),
             close: Boolean = false, selfClosing: Boolean = close,
             innerHTML: String = "",
             transform: (() -> String)? = null) =
    if (selfClosing) "<datalist${pairs.toAttributes()}/>"
    else "<datalist${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</datalist>"

fun fieldset(vararg pairs: Pair<String, String> = arrayOf(),
             close: Boolean = false, selfClosing: Boolean = close,
             innerHTML: String = "",
             transform: (() -> String)? = null) =
    if (selfClosing) "<fieldset${pairs.toAttributes()}/>"
    else "<fieldset${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</fieldset>"

fun form(vararg pairs: Pair<String, String> = arrayOf(),
         close: Boolean = false, selfClosing: Boolean = close,
         innerHTML: String = "",
         transform: (() -> String)? = null) =
    if (selfClosing) "<form${pairs.toAttributes()}/>"
    else "<form${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</form>"

// self-closing: <input/>

fun input(vararg pairs: Pair<String, String> = arrayOf(),
          close: Boolean = false, selfClosing: Boolean = close,
          innerHTML: String = "",
          transform: (() -> String)? = null) =
    if (selfClosing) "<input${pairs.toAttributes()}/>"
    else "<input${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</input>"

fun label(vararg pairs: Pair<String, String> = arrayOf(),
          close: Boolean = false, selfClosing: Boolean = close,
          innerHTML: String = "",
          transform: (() -> String)? = null) =
    if (selfClosing) "<label${pairs.toAttributes()}/>"
    else "<label${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</label>"

fun legend(vararg pairs: Pair<String, String> = arrayOf(),
           close: Boolean = false, selfClosing: Boolean = close,
           innerHTML: String = "",
           transform: (() -> String)? = null) =
    if (selfClosing) "<legend${pairs.toAttributes()}/>"
    else "<legend${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</legend>"

fun meter(vararg pairs: Pair<String, String> = arrayOf(),
          close: Boolean = false, selfClosing: Boolean = close,
          innerHTML: String = "",
          transform: (() -> String)? = null) =
    if (selfClosing) "<meter${pairs.toAttributes()}/>"
    else "<meter${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</meter>"

fun optgroup(vararg pairs: Pair<String, String> = arrayOf(),
             close: Boolean = false, selfClosing: Boolean = close,
             innerHTML: String = "",
             transform: (() -> String)? = null) =
    if (selfClosing) "<optgroup${pairs.toAttributes()}/>"
    else "<optgroup${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</optgroup>"

fun option(vararg pairs: Pair<String, String> = arrayOf(),
           close: Boolean = false, selfClosing: Boolean = close,
           innerHTML: String = "",
           transform: (() -> String)? = null) =
    if (selfClosing) "<option${pairs.toAttributes()}/>"
    else "<option${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</option>"

fun progress(vararg pairs: Pair<String, String> = arrayOf(),
             close: Boolean = false, selfClosing: Boolean = close,
             innerHTML: String = "",
             transform: (() -> String)? = null) =
    if (selfClosing) "<progress${pairs.toAttributes()}/>"
    else "<progress${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</progress>"

fun select(vararg pairs: Pair<String, String> = arrayOf(),
           close: Boolean = false, selfClosing: Boolean = close,
           innerHTML: String = "",
           transform: (() -> String)? = null) =
    if (selfClosing) "<select${pairs.toAttributes()}/>"
    else "<select${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</select>"

fun textarea(vararg pairs: Pair<String, String> = arrayOf(),
             close: Boolean = false, selfClosing: Boolean = close,
             innerHTML: String = "",
             transform: (() -> String)? = null) =
    if (selfClosing) "<textarea${pairs.toAttributes()}/>"
    else "<textarea${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</textarea>"

/* Interactive elements */

fun details(vararg pairs: Pair<String, String> = arrayOf(),
            close: Boolean = false, selfClosing: Boolean = close,
            innerHTML: String = "",
            transform: (() -> String)? = null) =
    if (selfClosing) "<details${pairs.toAttributes()}/>"
    else "<details${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</details>"

fun dialog(vararg pairs: Pair<String, String> = arrayOf(),
           close: Boolean = false, selfClosing: Boolean = close,
           innerHTML: String = "",
           transform: (() -> String)? = null) =
    if (selfClosing) "<dialog${pairs.toAttributes()}/>"
    else "<dialog${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</dialog>"

fun menu(vararg pairs: Pair<String, String> = arrayOf(),
         close: Boolean = false, selfClosing: Boolean = close,
         innerHTML: String = "",
         transform: (() -> String)? = null) =
    if (selfClosing) "<menu${pairs.toAttributes()}/>"
    else "<menu${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</menu>"

fun summary(vararg pairs: Pair<String, String> = arrayOf(),
            close: Boolean = false, selfClosing: Boolean = close,
            innerHTML: String = "",
            transform: (() -> String)? = null) =
    if (selfClosing) "<summary${pairs.toAttributes()}/>"
    else "<summary${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</summary>"

/* Web Components */

fun template(vararg pairs: Pair<String, String> = arrayOf(),
             close: Boolean = false, selfClosing: Boolean = close,
             innerHTML: String = "",
             transform: (() -> String)? = null) =
    if (selfClosing) "<template${pairs.toAttributes()}/>"
    else "<template${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</template>"

/* HTML4: Obsolete and deprecated elements */

fun acronym(vararg pairs: Pair<String, String> = arrayOf(),
            close: Boolean = false, selfClosing: Boolean = close,
            innerHTML: String = "",
            transform: (() -> String)? = null) =
    if (selfClosing) "<acronym${pairs.toAttributes()}/>"
    else "<acronym${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</acronym>"

fun applet(vararg pairs: Pair<String, String> = arrayOf(),
           close: Boolean = false, selfClosing: Boolean = close,
           innerHTML: String = "",
           transform: (() -> String)? = null) =
    if (selfClosing) "<applet${pairs.toAttributes()}/>"
    else "<applet${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</applet>"

fun big(vararg pairs: Pair<String, String> = arrayOf(),
        close: Boolean = false, selfClosing: Boolean = close,
        innerHTML: String = "",
        transform: (() -> String)? = null) =
    if (selfClosing) "<big${pairs.toAttributes()}/>"
    else "<big${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</big>"

fun center(vararg pairs: Pair<String, String> = arrayOf(),
           close: Boolean = false, selfClosing: Boolean = close,
           innerHTML: String = "",
           transform: (() -> String)? = null) =
    if (selfClosing) "<center${pairs.toAttributes()}/>"
    else "<center${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</center>"

fun dir(vararg pairs: Pair<String, String> = arrayOf(),
        close: Boolean = false, selfClosing: Boolean = close,
        innerHTML: String = "",
        transform: (() -> String)? = null) =
    if (selfClosing) "<dir${pairs.toAttributes()}/>"
    else "<dir${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</dir>"

fun font(vararg pairs: Pair<String, String> = arrayOf(),
         close: Boolean = false, selfClosing: Boolean = close,
         innerHTML: String = "",
         transform: (() -> String)? = null) =
    if (selfClosing) "<font${pairs.toAttributes()}/>"
    else "<font${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</font>"

fun frameset(vararg pairs: Pair<String, String> = arrayOf(),
             close: Boolean = false, selfClosing: Boolean = close,
             innerHTML: String = "",
             transform: (() -> String)? = null) =
    if (selfClosing) "<frameset${pairs.toAttributes()}/>"
    else "<frameset${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</frameset>"

fun noframes(vararg pairs: Pair<String, String> = arrayOf(),
             close: Boolean = false, selfClosing: Boolean = close,
             innerHTML: String = "",
             transform: (() -> String)? = null) =
    if (selfClosing) "<noframes${pairs.toAttributes()}/>"
    else "<noframes${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</noframes>"

fun strike(vararg pairs: Pair<String, String> = arrayOf(),
           close: Boolean = false, selfClosing: Boolean = close,
           innerHTML: String = "",
           transform: (() -> String)? = null) =
    if (selfClosing) "<strike${pairs.toAttributes()}/>"
    else "<strike${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</strike>"

fun tt(vararg pairs: Pair<String, String> = arrayOf(),
       close: Boolean = false, selfClosing: Boolean = close,
       innerHTML: String = "",
       transform: (() -> String)? = null) =
    if (selfClosing) "<tt${pairs.toAttributes()}/>"
    else "<tt${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</tt>"

// self-closing:

fun basefont(vararg pairs: Pair<String, String> = arrayOf(),
             close: Boolean = true, selfClosing: Boolean = close,
             innerHTML: String = "",
             transform: (() -> String)? = null) =
    if (selfClosing) "<basefont${pairs.toAttributes()}/>"
    else "<basefont${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</basefont>"

fun frame(vararg pairs: Pair<String, String> = arrayOf(),
          close: Boolean = true, selfClosing: Boolean = close,
          innerHTML: String = "",
          transform: (() -> String)? = null) =
    if (selfClosing) "<frame${pairs.toAttributes()}/>"
    else "<frame${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</frame>"

fun isindex(vararg pairs: Pair<String, String> = arrayOf(),
            close: Boolean = true, selfClosing: Boolean = close,
            innerHTML: String = "",
            transform: (() -> String)? = null) =
    if (selfClosing) "<isindex${pairs.toAttributes()}/>"
    else "<isindex${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</isindex>"

fun menuitem(vararg pairs: Pair<String, String> = arrayOf(),
             close: Boolean = true, selfClosing: Boolean = close,
             innerHTML: String = "",
             transform: (() -> String)? = null) =
    if (selfClosing) "<menuitem${pairs.toAttributes()}/>"
    else "<menuitem${pairs.toAttributes()}>${if (transform != null) transform() else innerHTML}</menuitem>"
