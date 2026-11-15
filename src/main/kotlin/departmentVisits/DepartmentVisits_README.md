# Department Visits Optimization

## Problem statement

You are given a shopping list of products in a specific order and a mapping from each product name to its supermarket department.

A **department visit** occurs when you enter a department, including the first department visited. Consecutive products from the same department count as **one** visit. Returning to a department after visiting another department counts as a **new** visit.

You may reorder the shopping list to group products from the same department together.

Implement a function that returns **how many department visits are saved** by optimally grouping the products.

## Function signature (Kotlin)

```kotlin
fun solution(
    products: List<String>,
    departments: Map<String, String>
): Int
```

## Example

```text
products = ["milk", "apple", "cheese", "bread", "banana"]

departments = {
    "milk": "dairy",
    "cheese": "dairy",
    "apple": "fruits",
    "banana": "fruits",
    "bread": "bakery"
}
```

Original order of departments:

```text
dairy -> fruits -> dairy -> bakery -> fruits
```

- Original visits: **5**
- Optimized visits: **3**
- Visits saved: **2**

**Expected output:** `2`

## Rules and edge cases

- An empty shopping list requires zero visits and saves zero visits.
- A shopping list with one product saves zero visits.
- Repeated products are allowed and each occurrence is processed in its original position.
- Every product in the list has a corresponding entry in `departments`.
- Department names are case-sensitive.
- Products already grouped by department produce zero savings.

## Performance goal

Aim for **O(n)** time, where `n` is the number of products, and **O(d)** additional space, where `d` is the number of distinct departments.

## Starter code

```kotlin
class DepartmentVisits {
    fun solution(
        products: List<String>,
        departments: Map<String, String>
    ): Int {
        // TODO: Implement the algorithm.
        return 0
    }
}
```

## Test cases

| Case | Shopping list | Expected visits saved |
| --- | --- | ---: |
| Example | milk, apple, cheese, bread, banana | 2 |
| Empty | (none) | 0 |
| Single product | milk | 0 |
| Same department | milk, cheese, yogurt | 0 |
| All different | milk, apple, bread, chicken | 0 |
| Alternating | milk, apple, cheese, banana, yogurt, orange | 4 |
| Already optimized | milk, cheese, apple, banana, bread | 0 |
| Repeated products | milk, apple, milk, apple, milk | 3 |
| Complex | milk, apple, bread, cheese, chicken, banana, croissant, beef, yogurt | 5 |

For the full runnable test harness, use the Kotlin code provided in the chat.
