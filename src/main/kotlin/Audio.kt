class Audio(
    val songName: String,
    val singer: String,
    val album: String
)

class AudioAttachments(private val audio: Audio) : Attachment() {

    override val type: Attachment

    init {
        this.type = AudioAttachments(audio)
    }

}