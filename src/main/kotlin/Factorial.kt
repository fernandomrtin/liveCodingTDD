/**
 * Implement a function that calculates the factorial of a non-negative integer. The factorial of a number n is defined as the product of all positive integers from 1 to n, and it is denoted as n!.
 *
 * By definition, 0! = 1.
 *
 * Only inputs greater than or equal to 0 are accepted.
 */
class Factorial {
    fun factorial(n: Int): Long {
        if (n == 0) {
            return 1
        } else if (n == 1) {
            return 1
        }
        return n * factorial(n - 1)
    }

}