fun main() {
    val ranges = 1.rangeTo(10) step 2
    ranges.forEachIndexed { index, _ ->
        println("index $index")
    }
}