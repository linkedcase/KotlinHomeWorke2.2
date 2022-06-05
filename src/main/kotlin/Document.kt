class Document(
    val docType: String,
    val docSize: Int
)

class DocAttachments(private val document: Document) : Attachment() {

    override val type: Attachment

    init {
        this.type = DocAttachments(document)
    }
}