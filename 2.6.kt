fun main(){
    print("N = ")
    var number = readLine()!!.toInt()
    print("Рекурсивная сумма равна ${rek(number)}")
    fun rek(n: Int):Int{
        var summa = 0
        if (n == 0){
            print("Ответ: 0")
        }
        else{
            summa += n % 10
            return rek(n / 10)
        }
    }
}