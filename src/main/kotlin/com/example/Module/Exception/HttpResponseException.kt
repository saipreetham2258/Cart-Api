package com.example.Module.Exception

import io.ktor.http.*

class HttpResponseException(val data: Any, val statusCode: HttpStatusCode) : Exception() {
}