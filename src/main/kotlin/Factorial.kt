fun main(){
    val array = arrayOf(1,2,3,4,5,6,7,8)
    imprimirArray(array,array.size-1)
}

fun factorial (numero : Int): Int{
    return if (numero == 0) 1
    else numero * factorial(numero-1)
}
fun factorial_iter(num: Int): Int{
    var fact = 1
    var num = num
    while (num > 0){
        fact = fact* num
        num--
    }
    return fact
}
fun fibo_rec(num: Int): Int{
    return if (num==0 || num == 1 ){
        num
    }else{
        fibo_rec(num-1) + fibo_rec(num-2)
    }
}
fun fibo_iter(num : Int): Int{
    var fibo = 0
    var a    = 0
    var b    = 1
    var i    = 2

    if (num == 0 || num == 1){
        fibo = num
    }
    while (i <= num){
        fibo = a +b
        a = b
        b = fibo
        i++
    }
    return fibo
}

fun imprimirArray(array: Array<Int>, index : Int){
    if(index >= 0) {
        imprimirArray(array,index-1)
        println(array[index])
    }

}