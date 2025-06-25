/**
 * https://leetcode.com/problems/merge-two-sorted-lists
 */
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class MergeTwoLists {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var result: ListNode? = null
        if (list1 == null) {
            result = list2
        } else if (list2 == null) {
            result = list1
        } else {
            if (list1.`val` < list2.`val`) {
                result = list1
                result.next = mergeTwoLists(list1.next, list2)
            } else {
                result = list2
                result.next = mergeTwoLists(list1, list2.next)
            }
        }
        return result
    }
}