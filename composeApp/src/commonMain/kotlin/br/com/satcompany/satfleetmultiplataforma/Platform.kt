package br.com.satcompany.satfleetmultiplataforma

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform