import WallService.add
import WallService.comments
import WallService.createComment
import WallService.posts
import WallService.update

fun main() {

    val copyright = Copyright(
        0,
        "Link",
        "name",
        "type"
    )

    val likes = Likes(
        0,
        false,
        false,
        false
    )

    val reposts = Reposts(
        0,
        false
    )

    val views = Views(0)

    val donut = Donut(
        false,
        placeholder = Placeholder("placeholder")
    )

    val comment = Comment(
        0,
        0,
        0,
        "text",
        donut = donut,
        0,
        0,
        attachments = emptyArray<Attachment>(),
        parentsStack = emptyArray<Int>(),
        thread = Thread(
            0,
            items = emptyArray<Comment>(),
            false,
            false,
            false
        )
    )

    val audioTrack = Audio("Название композиции","Певец", "Альбом")

    val firstPost = Post(0, 0, 0, 0, 0, "ДЗ по ООП", 0, 0,
        0, comment, copyright, likes, reposts, views, "post", 0, false,
        false, false, 0, false, false, donut, 0
    )

    val secondPost = Post(0, 0, 0, 0, 0, "ДЗ по ООП", 0, 0,
        0, comment, copyright, likes, reposts, views, "post", 0, false,
        false, false, 0, false, false, donut, 0
    )


    val firstPostWithNewId = add(firstPost)
    val secondPostWithNewId = add(secondPost)

    for ((index) in posts.withIndex()) {
        println(posts[index])
    }

    update(firstPostWithNewId)
    update(secondPostWithNewId)

    println()
    for ((index) in posts.withIndex()) {
        println(posts[index])
    }

    createComment(2, comment)

    println()
    for ((index) in comments.withIndex()) {
        println(comments[index])
    }
}