class Video(
    val videoName: String,
    val videoAuthorId: Int
){
}

class VideoAttachments(private val video: Video) : Attachment() {

    override val type: Attachment

    init {
        this.type = VideoAttachments(video)
    }



}