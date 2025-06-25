import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class MergeTwoListTest {

    @Test
    fun `returns true when the anagram is correct`() {
        val list1 = ListNode(1)
        val node = ListNode(2)
        node.next = ListNode(4)
        list1.next = node

        val list2 = ListNode(1)
        val node2 = ListNode(3)
        node2.next = ListNode(4)
        list2.next = node2

        val calculator = MergeTwoLists()
        val result = calculator.mergeTwoLists(list1 = list1, list2 = list2)
    }
}