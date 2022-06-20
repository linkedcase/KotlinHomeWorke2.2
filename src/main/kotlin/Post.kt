data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Int,
    val comment: Comment?,
    val copyright: Copyright,
    val likes: Likes?,
    val reposts: Reposts?,
    val views: Views,
    val postType: String,
    val signerId: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Int,
    val markedAsAbs: Boolean,
    val isFavorite: Boolean,
    val donut: Donut,
    val postponedId: Int,
    val attachments: Array<Attachment> = emptyArray()
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Post

        if (!attachments.contentEquals(other.attachments)) return false

        return true
    }

    override fun hashCode(): Int {
        return attachments.contentHashCode()
    }
}

class Comment(
    val id: Int,
    val fromId: Int,
    val date: Int,
    val text: String,
    val donut: Donut,
    val replyToUser: Int,
    val replyToComment: Int,
    val attachments: Array<Attachment>,
    val parentsStack: Array<Int>,
    val thread: Thread
)

class Copyright(
    val id: Int,
    val link: String,
    val name: String,
    val type: String
)

class Likes(
    val count: Int,
    val userLikes: Boolean,
    val canLike: Boolean,
    val canPublish: Boolean
)

class Reposts(
    val count: Int,
    val userReposted: Boolean
)

class Views(
    val count: Int
)

class Donut(
    val isDon: Boolean,
    val placeholder: Placeholder
)

class Placeholder(
    val placeholder: String
)

class Thread(
    val count: Int,
    val items: Array<Comment>,
    val canPost: Boolean,
    val showReplyButton: Boolean,
    val groupsCanPost: Boolean
)

