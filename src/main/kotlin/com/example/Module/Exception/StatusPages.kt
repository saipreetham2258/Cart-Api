package com.example.Module.Exception

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.application.hooks.CallFailed.install
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.response.*
import java.util.*

fun Application.module() {
    install(StatusPages) {
        exception<HttpResponseException> { call,cause ->
            call.fileResponseRequest(cause.status,cause.date,cause.mess)
            throw cause
        }
    }
}