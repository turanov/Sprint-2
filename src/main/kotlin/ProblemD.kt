class ProblemD {

    fun main() {
        var t = readInt()
        while (t-- > 0) {
            var n = readInt()
            var r = LongArray(n) { 0L }
            var arr = readListLong().sorted()
            var j = 0
            for (i in n - 1 downTo 0) {
                r[j] = if (i == n - 1) arr[i] else (arr[i] * (j + 1))
                j++
            }
            println(r.maxOrNull());
        }
    }
}