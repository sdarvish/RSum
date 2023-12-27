package ir.rsum

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform