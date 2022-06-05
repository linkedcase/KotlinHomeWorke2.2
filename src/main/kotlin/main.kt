import WallService.add
import WallService.posts
import WallService.update

fun main() {

    val comments = Comment(
        0,
        false,
        false,
        false,
        false
    )

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
        0,
        placeholder = Placeholder("Подписка не оформлена"),
        false,
        "all"
    )

    val firstPost = Post(0, 0, 0, 0, 0, "ДЗ по ООП", 0, 0,
        0, comments, copyright, likes, reposts, views, "post", 0, false,
        false, false, 0, false, false, donut, 0
    )

    val secondPost = Post(0, 0, 0, 0, 0, "ДЗ по ООП", 0, 0,
        0, comments, copyright, likes, reposts, views, "post", 0, false,
        false, false, 0, false, false, donut, 0
    )

    var firstPostWithNewId = add(firstPost)
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
}