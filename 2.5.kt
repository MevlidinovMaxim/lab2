fun main() {
    print("A = ")
    var a = readLine()!!.toInt()
    print("B = ")
    var b = readLine()!!.toInt()
    var NOK = a * b // NOD(a, b)
    print("Наименьшее общее кратное = $NOK")
}
fun NOD(x: Int, y: Int){
    while (x != y) {
        if (x > y) {
            x == x - y
        }
        else {
            y == y - x
        }
    }
    var NOD = x
}
