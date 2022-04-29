package com.vishnevskiypro

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.vishnevskiypro.plugins.*

fun main() {
    embeddedServer(Netty, port = 8100, host = "192.168.0.111") {
        configureRouting()
        configureSerialization()
        configureMonitoring()
    }.start(wait = true)
}
