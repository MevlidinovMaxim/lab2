import kotlin.math.*
fun main() {
    print("A = ")
    var a = readLine()!!.toDouble()
    print("B = ")
    var b = readLine()!!.toDouble()
    var NOK = a * b / NOD(a, b)
    print("Наименьшее общее кратное = $NOK")
}
fun NOD(x: Double, y: Double): Double {
    while (x != y) {
        if (x > y) {
            x == x - y
        }
        else {
            y == y - x
        }
    }
    var NOD = x
    return x
}
