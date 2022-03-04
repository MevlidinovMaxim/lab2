import kotlin.math.*
fun dlina(x1: Double, y1: Double, x2: Double, y2: Double): Double {
    var d = sqrt((y1 - y2)*(y1 - y2) + (x1 - x2)*(x1 - x2))
    return d
}

fun main(){
    print("Введите х1: ")
    var xa = readLine()!!.toDouble()
    print("Введите y1: ")
    var ya = readLine()!!.toDouble()

    print("Введите x2: ")
    var xb = readLine()!!.toDouble()
    print("Введите y2: ")
    var yb = readLine()!!.toDouble()

    print("Введите x3: ")
    var xc = readLine()!!.toDouble()
    print("Введите y3: ")
    var yc = readLine()!!.toDouble()

    var p = dlina(xa, ya, xb, yb) + dlina(xb, yb, xc, yc) + dlina(xc, yc, xa, ya)
    print("Периметр: ")
    print(String.format("%.3f", p))
}