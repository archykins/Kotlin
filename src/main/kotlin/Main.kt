import sun.net.www.content.text.Generic
import java.lang.Exception

fun main(args: Array<String>) {
val pochtadress = C.Pochtadress()
    println("Введите название организации")
    pochtadress.Nazorganizacii = readln()
    println("Введите индекс")
    try {
        pochtadress.index = readln().toInt()
    }
    catch (e: Exception) {
        println("Индекс не может состоять из букв")
    }
    println("Введите город ")
    pochtadress.Gorod= readln()
    println("Введите улицу")
    pochtadress.Ulitsa = readln()
    println("Введите номер дома")
    try {
        pochtadress.NumD = readln().toInt()
    }
    catch ( e: Exception){
        println("Номер дома не может состоять из букв")
    }
    println("Адрес: " + pochtadress.Nazorganizacii + " " + pochtadress.index +" " + pochtadress.Gorod +" " + pochtadress.Ulitsa + " " + pochtadress.NumD )
    println("Адрес: "+ pochtadress)
    try {
        var adress2 = C.Pochtadress(


        )
    }
    catch (e: Exception){

    }


}

