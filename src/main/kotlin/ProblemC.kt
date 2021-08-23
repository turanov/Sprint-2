class ProblemC {

    fun main() {
        var n = readInt()
        var arr = readListInt().sorted()
        var ans = 0
        for (i in n - 1 downTo 0 step 2) {
            ans += arr[i] - arr[i - 1]
        }
        println(ans);
    }

}