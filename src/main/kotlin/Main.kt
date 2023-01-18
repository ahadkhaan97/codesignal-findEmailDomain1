fun main() {
    print(solution("prettyandsimple@example.com"))
}

fun solution(address: String): String {
    val splitString = address.split("@")
    return splitString[splitString.size - 1]
}
