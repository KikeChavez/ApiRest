data class BittrexResponse(
    val message: String,
    val result: List<Result>,
    val success: Boolean
)