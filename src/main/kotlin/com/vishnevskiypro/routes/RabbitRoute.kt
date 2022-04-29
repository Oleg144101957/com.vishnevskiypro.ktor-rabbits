package com.vishnevskiypro.routes

import com.vishnevskiypro.data.model.Rabbit
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private const val BASE_URL = "http://192.168.0.111:8100"
private val rabbits = listOf(
    Rabbit("Carl", "I cute down rabbit", "$BASE_URL/rabbits/rabbit1.jpeg"),
    Rabbit("Emma", "Emma likes to eat apples", "$BASE_URL/rabbits/rabbit2.jpeg"),
    Rabbit("Florian", "Florian is always hungry", "$BASE_URL/rabbits/rabbit3.jpeg"),
    Rabbit("Gina", "Gina is a true beauty", "$BASE_URL/rabbits/rabbit4.jpg"),
    Rabbit("Federico", "Federico likes to climb mountains", "$BASE_URL/rabbits/rabbit5.jpeg")
)


fun Route.randomRabbit() {
    get("/randomrabbit"){
        call.respond(
            HttpStatusCode.OK,
            rabbits.random()
        )

    }

}