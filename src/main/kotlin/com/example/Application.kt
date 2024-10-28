package com.example

import com.example.Module.CartService
import com.example.Module.Exception.module
import com.example.plugins.*
import io.ktor.server.application.*
import org.koin.core.context.startKoin

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    val appModule = org.koin.dsl.module {
        single { CartService() }
    }

    startKoin {
        modules(appModule)
    }
    configureSerialization()
    configureRouting()
    module()
}
