package ke.ac.zalegoacademy.fileuploadtutorial

data class UploadResponse(
    val error: Boolean,
    val message: String,
    val image: String
)