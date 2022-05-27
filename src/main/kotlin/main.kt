import WallService.posts

private var property: Int = 0

object WallService {
    var posts = emptyArray<Post>()
}

fun main() {
    val original = Post(
        0,
        0,
        0,
        0,
        0,
        "ДЗ по ООП",
        0,
        0,
        0,
        comments = Comment(0,false, false, false,
            false),
        copyright = Copyright(0,"Link", "name", "type"),
        likes = Likes(0,false, false, canPublish = false),
        reposts = Reposts(0, userReposted = true),
        views = Views(0),
        "reply",
        0,
        false,
        false,
        false,
        0,
        false,
        false,
        donut = Donut(false, 0, placeholder = Placeholder(),
            false, "all"), 0)

    val another = Post(
        5,
        0,
        0,
        0,
        0,
        "ДЗ по ООП",
        0,
        0,
        0,
        comments = Comment(0,false, false, false,
            false),
        copyright = Copyright(0,"Link", "name", "type"),
        likes = Likes(0,false, false, canPublish = false),
        reposts = Reposts(0, userReposted = true),
        views = Views(0),
        "reply",
        0,
        false,
        false,
        false,
        0,
        false,
        false,
        donut = Donut(false, 0, placeholder = Placeholder(),
            false, "all"), 0)

    val originalWithNewId = add(original)
    val anotherWithNewId = add(another)

    update(originalWithNewId)
    update(anotherWithNewId)
}

fun add(post: Post): Post {
    property = post.id + 1
    posts += post.copy(id = property)
    return posts.last()
}

fun update(post: Post): Boolean {
    val (id) = post
    for ((index, post) in posts.withIndex()) {
        if (post.id == id) {
            posts[index] = post.copy(id = post.id + 1, ownerId = post.ownerId + 1,
                createdBy = post.createdBy + 1, text = post.text + "New", replyOwnerId = post.replyOwnerId + 1,
                replyPostId = post.replyPostId + 1)
            return true
        }
    }
    return false
}