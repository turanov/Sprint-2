class ProblemB {

    fun main() {
        var t = readInt()
        for (i in 0 until t) {
            var (n, k) = readListInt()
            var result = ""
            var character = 97;
            k += 97;
            for (j in 0 until n) {
                if (k == character)
                    character = 97
                result += character.toChar()
                character++;
            }
            println(result);
        }
    }

}