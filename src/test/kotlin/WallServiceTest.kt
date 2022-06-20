import WallService.add
import WallService.comments
import WallService.createComment
import WallService.update
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    private val copyright = Copyright(
        0,
        "Link",
        "name",
        "type"
    )

    private val likes = Likes(
        0,
        false,
        false,
        false
    )

    private val reposts = Reposts(
        0,
        false
    )

    private val views = Views(0)

    private val donut = Donut(
        false,
        placeholder = Placeholder("test placeholder")
    )

    private val thread = Thread(
    0,
    items = emptyArray<Comment>(),
    false,
    false,
    false
    )

    private val comment = Comment(
        0,
        0,
        0,
        "test",
        donut = donut,
        0,
        0,
        attachments = emptyArray<Attachment>(),
        parentsStack = emptyArray<Int>(),
        thread = thread
    )

    private val post = Post(0, 0, 0, 0, 0, "ДЗ по ООП", 0,
        0, 0, comment, copyright, likes, reposts, views, "post",
        0, false, false, false, 0, false, false,
        donut, 0
    )

    @Test
    fun add_postHaveNewId() {

        //arrange
        val testPost = post

        //act
        val postWithNewId = add(testPost)
        val (newId) = postWithNewId

        //assert
        assertEquals(3, newId)
    }

    @Test
    fun update_ExistingPost() {
        //arrange
        val testPost = post

        //act
        val ExistingPost = add(testPost)
        val result = update(ExistingPost)

        // assert
        assertTrue(result)
    }

    @Test
    fun notUpdate_Post() {
        //arrange
        val testPost = post

        //act
        val result = update(testPost)

        // assert
        assertFalse(result)
    }

    @Test
    fun addCommentInPost() {
        //arrange
        val testComment = comment

        //act
        val result = createComment(2,testComment)

        //assert
        for ((index) in comments.withIndex()) {
            assertEquals(comments[index], result)
        }
    }


    @Test(expected = PostNotFoundException::class)
    // act
    fun shouldIdThrow() {
        createComment(5, comment)
    }
}