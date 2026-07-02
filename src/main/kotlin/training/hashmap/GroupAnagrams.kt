package training.hashmap

class GroupAnagrams {
    fun solve(strs: Array<String>): Array<Array<String>> {
        val output = HashMap<String, MutableList<String>>()
        strs.forEach { str ->
            val key: CharArray = str.toCharArray()
            key.sort()

            val currentOccurrences = output.getOrPut(String(key)) { mutableListOf() }
            currentOccurrences.add(str)
        }
        return output.values.map { it.toTypedArray() }.toTypedArray()
    }
}