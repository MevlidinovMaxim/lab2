
fun main(){
    fun p(z: Int): Int{
        var x = 0
        var y = z
        while (y > 0){
            x = x * 10 + y % 10
            y = y / 10
        }
        var z = x
        return z
    }

    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()
    println(p(a))
    println(p(b))
}
