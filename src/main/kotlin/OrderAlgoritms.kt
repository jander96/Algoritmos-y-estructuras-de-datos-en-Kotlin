import java.util.*

fun main(){
val list = mutableListOf(9, 23, 5, 78, 12, 34, 2, 68, 12)
    println(selectionOrder(list))
    println(insertionOrder(list))
}

fun selectionOrder(list: MutableList<Int>): List<Int>{
    for (i in 0 until list.size -1){
        var min = i
        for (j in i+1 until list.size){
            if (list[j]< list[min]) min = j

            Collections.swap(list,i,min)
        }
    }
    return list
}

fun insertionOrder(list:MutableList<Int>): List<Int>{
    for (i in 1 until list.size){
        var j = i-1
        while (j > 0 && list[i]< list[j]){
            Collections.swap(list,i,j)
            j--
        }
    }
    return list
}
