package com.example.plugins

import com.example.routes.getAllHeroesAlternative
import com.example.routes.root
import com.example.routes.searchHeroes
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        root()
//        getAllHeroes()
        getAllHeroesAlternative()
        searchHeroes()

        staticResources(remotePath = "/images", basePackage = "images")
    }
}
