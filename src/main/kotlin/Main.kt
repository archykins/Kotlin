import sun.net.www.content.text.Generic
import java.lang.Exception
// пока в одном проекте, чтобы было удобнее, потом перенесу в другую вкладку
// Поставьте пж офлайн пару :)
fun main(args: Array<String>) {
val pochtadress = Pochtadress()
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
    println("Адрес: " + pochtadress.index +" " + pochtadress.Gorod +" " + pochtadress.Ulitsa + " " + pochtadress.NumD  )



}
class Pochtadress{
    var index: Int = 0
        get() {
          return field
        }
        set(value){
            if(value.toString().length !=6)
            {
                println("Ошибка ввода индекса")
            }
            else {
                println("Индекс введен правильно")
                field = value
            }


        }
    //Вот здесь не могу придумать ограничения для ввода
    var Gorod: String = " "
        get(){
            return field
        }
        set (value) {
            field=value

        }

    var Ulitsa: String = ""
        get(){
            return field
        }
        set (value){
            field=value

        }
    var NumD: Int = 0
        get() {
            return field
        }
        set(value) {
            if (value==0)
                println("Ошибка ввода номера дома")
            else println("Номер дома введен правильно")
            field=value
        }

    //var Korpus: Generic = (Базовый тип для дженерика)
}

