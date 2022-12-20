class C {
    class Pochtadress{

        var Nazorganizacii: String = " "
            get(){
                return field
            }
            set (value){
                field = value
            }
        var index: Int = 430000
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

        var Gorod: String = "Саранск"
            get(){
                return field
            }
            set (value) {
                if (value.length<0){
                    println("Ошибка ввода города")
                }
                else
                    println("Город введен правильно")
                field=value

            }

        var Ulitsa: String = " "
            get(){
                return field
            }
            set (value){
                if (value.length<0){
                    println("Ошибка ввода улицы")
                }
                else
                    println("Название улицы введено правильно")
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

        override fun toString(): String {
            return "$Nazorganizacii" + " " + "$index" +" " + "$Gorod" + " " +"$Ulitsa" + " "+"$NumD"
        }
        //var Korpus: Generic = (Базовый тип для дженерика)
    }

}