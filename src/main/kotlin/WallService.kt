object WallService {

    private var postId = 0
    var posts = emptyArray<Post>()
    var comments = emptyArray<Comment>()

    fun add(post: Post): Post {
        postId++
        posts += post.copy(id = postId)
        return posts.last()
    }

    fun update(post: Post): Boolean {
        val (id) = post
        for ((index, post) in posts.withIndex()) {
            if (post.id == id) {
                postId++
                posts[index] = post.copy(
                    id = postId,
                    ownerId = post.ownerId + 1,
                    createdBy = post.createdBy + 1,
                    date = post.date + 1,
                    text = post.text + " New",
                    replyOwnerId = post.replyOwnerId + 1,
                    replyPostId = post.replyPostId + 1,
                    friendsOnly = post.friendsOnly + 1,
                    comment = Comment(
                         + 1,
                        + 1,
                        2022,
                        "Новый комментарий",
                        donut = Donut(
                            true,
                            placeholder = Placeholder("placeHolder")
                        ),
                        + 1,
                        + 1,
                        attachments = emptyArray<Attachment>(),
                        parentsStack = emptyArray<Int>(),
                        thread = Thread(
                            + 1,
                            items = emptyArray<Comment>(),
                            true,
                            true,
                            true
                        )
                    ),
                    copyright = Copyright(
                        id = 0 + 1,
                        "New Link",
                        "New Name",
                        "New Type"
                    ),
                    likes = Likes(
                        count = 0 + 1,
                        true,
                        true,
                        true
                    ),
                    reposts = Reposts(
                        count = 0 + 1,
                        true
                    ),
                    views = Views(count = 0 + 1),
                    postType = "copy",
                    signerId = post.signerId + 1,
                    canPin = true,
                    canDelete = true,
                    canEdit = true,
                    isPinned = post.isPinned + 1,
                    markedAsAbs = true,
                    isFavorite = true,
                    donut = Donut(
                        true,
                        placeholder = Placeholder("Подписка оформлена")
                    ),
                    postponedId = post.postponedId + 1,
                    attachments = emptyArray<Attachment>()
                )
                return true
            }
        }
        return false
    }

    fun createComment(postId: Int, comment: Comment): Comment {
        var targetId = 0
        for ((index) in posts.withIndex()) {
            if (postId == posts[index].id) {
                targetId = postId
                comments += comment
            }
        }
        if (targetId != postId) {throw PostNotFoundException("No post with id $postId")}
        return comments.last()
    }
}