fun main(){
    print("N = ")
    var n = readLine()!!.toInt()
    while (n > 9){
        var s = 0
        while (n > 0){
            s += n % 10
            n = n / 10
        }
        n = s
        print(n)
    }
}


//n = int(input())
//while n > 9:
//s = 0
//while n > 0:
//s += n % 10
//n = n // 10
//n = s
//print(n)