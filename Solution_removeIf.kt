fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val filteredList = list.filter { it % 2 != 0 }
    println(list) // Original list remains unchanged: [1, 2, 3, 4, 5]
    println(filteredList) // New list with only odd numbers: [1, 3, 5]

    val set = mutableSetOf(1, 2, 3, 4, 5)
    val filteredSet = set.filter { it % 2 != 0 }.toSet()
    println(set) // Original set remains unchanged
    println(filteredSet) // New set with only odd numbers

    val map = mutableMapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five")
    val filteredMap = map.filter { it.key % 2 != 0 }
    println(map) // Original map remains unchanged
    println(filteredMap) // New map with only odd keys
}