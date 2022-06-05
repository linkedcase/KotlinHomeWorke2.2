class Link(val link: String)

class LinkAttachments(private val link: Link) : Attachment() {

    override val type: Attachment

    init {
        this.type = LinkAttachments(link)
    }
}