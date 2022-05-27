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
    val comments: Comment = Comment(0, true,
        true,true, true),
    val copyright: Copyright = Copyright(0,"link",
        "name", "type"),
    val likes: Likes = Likes(0,true, true, true),
    val reposts: Reposts = Reposts(0,true),
    val views: Views = Views(0),
    val postType: String,
    val signerId: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Int,
    val markedAsAbs: Boolean,
    val isFavortie: Boolean,
    val donut: Donut = Donut(true,0, Placeholder(),
        true,"editMode"),
    val postponedId: Int
) {
}

class Comment(
    val count: Int,
    val canPost: Boolean,
    val groupsCanPost: Boolean,
    val canClose: Boolean,
    val canOpen: Boolean
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
    val isDonut: Boolean,
    val paidDuration: Int,
    val placeholder: Placeholder = Placeholder(),
    val canPublishFreeCopy: Boolean,
    val editMode: String
)

class Placeholder()