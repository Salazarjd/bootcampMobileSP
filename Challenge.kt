fun main(args: Array<String>) {
    println("Ejercicio 1")
    println("Digita si deseas una cadena TipoA o TipoB")
    val answer = readLine()
    println("El resultado de tu elección es ${genereteString(answer)}")
    println("\nEjercicio 2")
    println("Deseas ordenar la lista de manera Ascendente (Asc) o Descendente (Desc)")
    val order = readLine()
    var list = generateList()
    if(order.equals("Asc")){
        sortNumbersAsc(list)
        println("Lista ordenada de manera Asc $list")
    }else if(order.equals("Desc")){
        sortNumbersDesc(list)
        println("Lista ordenada de manera Desc $list")
    }
}

fun genereteString(initialString: String?) : String {

    var newString = ""
    when(initialString){
        "TipoA" -> {
            newString = "54"
            while(newString.length < 10){
                newString += generateNumbers(9).toString()
            }
        }
        "TipoB" -> {
            newString = "08"
            while(newString.length < 10){
                newString += generateNumbers(9).toString()
            }
        }
    }

    return newString
}

fun generateNumbers(limit: Int) : Int{
    val numbers = 0..limit
    return numbers.random()
}

fun generateList(): MutableList<Int> {
    var newList = mutableListOf<Int>()
    while (newList.size < 10){
        newList.add(generateNumbers(100))
    }
    println("Lista desordenada $newList")
    return newList
}

fun sortNumbersAsc(list: MutableList<Int>){
    var tem = 0
    var flag = true
    for(i in (0 until list.size - 1)){
        if(!flag){
            break
        }
        flag = false
        for(j in (0 until list.size - 1)){
            if(list[j] > list[j+1]){
                flag = true
                tem = list[j]
                list[j] = list[j+1]
                list[j+1] = tem
            }
        }
    }
}

fun sortNumbersDesc(list: MutableList<Int>){
    var tem = 0
    var flag = true
    for(i in (0 until list.size - 1)){
        if(!flag){
            break
        }
        flag = false
        for(j in (0 until list.size - 1)){
            if(list[j] < list[j+1]){
                flag = true
                tem = list[j]
                list[j] = list[j+1]
                list[j+1] = tem
            }
        }
    }
}