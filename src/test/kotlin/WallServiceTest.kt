import WallService.add
import WallService.update
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

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

    val post = Post(0, 0, 0, 0, 0, "ДЗ по ООП", 0,
        0, 0, comments, copyright, likes, reposts, views, "post",
        0, false, false, false, 0, false, false,
        donut, 0
    )

    @Test
    fun add_postHaveNewId() {

        //arrange
        val post1 = post

        //act
        val postWithNewId = add(post1)
        val (newId) = postWithNewId

        //assert
        assertEquals(3, newId)
    }

    @Test
    fun update_ExistingPost() {
        //arrange
        val post2 = post

        //act
        val ExistingPost = add(post2)
        val result = update(ExistingPost)

        // assert
        assertTrue(result)
    }

    @Test
    fun notUpdate_Post() {
        //arrange
        val post3 = post

        //act
        val result = update(post3)

        // assert
        assertFalse(result)
    }
}