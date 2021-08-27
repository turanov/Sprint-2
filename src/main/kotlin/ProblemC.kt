class ProblemC {

    fun main() {
        val n = readInt()
        val arr = readListInt().sorted()
        var ans = 0
        for (i in n - 1 downTo 0 step 2) {
            ans += arr[i] - arr[i - 1]
        }
        println(ans);
    }

}