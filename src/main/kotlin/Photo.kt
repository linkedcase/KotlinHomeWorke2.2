class Photo(
    val photoType: String,
    val photoSize: Int
)

class PhotoAttachments(private val photo: Photo) : Attachment() {

    override val type: Attachment

    init {
        this.type = PhotoAttachments(photo)
    }
}