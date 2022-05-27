import WallService.posts
import org.junit.Assert.*
import org.junit.Test

class MainKtTest {

    @Test
    fun add_postHaveToNewId() {
        //arrange
        val post = Post(
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

        //act
        val postWithNewId = add(post)
        val (newId) = postWithNewId

        //assert
        assertEquals(1, newId)
    }

    @Test
    fun update_ExistingPost() {
        //arrange
        val post0 = Post(
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

        val post1 = Post(
            1,
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

        val post2 = Post(
            2,
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


        //act
        posts += post0
        posts += post1
        val result = update(post1)

        // assert
        assertTrue(result)
    }

    @Test
    fun notUpdate_ExistingPost() {
        //arrange
        val post3 = Post(
            3,
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

        val post4 = Post(
            4,
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

        val post5 = Post(
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

        //act
        posts += post3
        posts += post4
        val result = update(post5)

        // assert
        assertFalse(result)
    }
}