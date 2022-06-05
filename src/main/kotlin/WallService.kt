object WallService {

    private var postId = 0
    var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        postId++
        posts += post.copy(id = postId)
        return posts.last()
    }

    fun update(post: Post): Boolean {
        var (id) = post
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
                    comments = Comment(
                        count = 0 + 1,
                        true,
                        true,
                        true,
                        true
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
                        paidDuration = 0 + 1,
                        placeholder = Placeholder("Подптска оформлена"),
                        true,
                        "duration"),
                    postponedId = post.postponedId + 1
                )
                return true
            }
        }
        return false
    }
}