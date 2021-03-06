import org.http4k.client.ApacheClient
import org.http4k.core.Method
import org.http4k.core.Request
import org.http4k.core.Response
import org.http4k.core.Status.Companion.OK
import org.http4k.server.Undertow
import org.http4k.server.asServer

fun main(args: Array<String>) {
    val app = { request: Request -> Response(OK).body("Hello, ${request.query("name")}!") }
    val server = app.asServer(Undertow(5000)).start()
}
