package departmentVisits

class DepartmentVisits {

    /**
     * Calculate how many department visits can be saved
     * by grouping products belonging to the same department.
     *
     * @param products Shopping list in its original order.
     * @param departments Mapping of product names to departments.
     * @return Number of department visits saved.
     */
    fun solution(
        products: List<String>,
        departments: Map<String, String>
    ): Int {
        // Edge cases
        if (products.isEmpty() || products.size == 1) return 0

        // We need to know how many departments we visit in the current solution
        var departmentsOriginallyVisited = 0
        var previousDepartment = ""
        for (i in products.indices) {
            val department = departments.getOrDefault(products[i], "")
            if (department != previousDepartment) {
                departmentsOriginallyVisited += 1
            }
            previousDepartment = department
        }

        // We group the products by the department assigned in the departments map
        val distinctDepartments = products.map { departments[it] }.toHashSet().count()
        // val distinctDepartments = products.groupBy { departments[it] }.count()
        // val distinctDepartments = products.distinctBy { departments[it] }.count()

        return departmentsOriginallyVisited - distinctDepartments
    }
}
