import java.util.*


    fun main(args: Array<String>) {
        var discount = 0.0
        var mes = false
        val s = Scanner(System.`in`)

        print("Пожалуйста введите стоимость диска в рублях: ")
        val itemPrice = s.nextDouble()
        print("Пожалуйста введите количество дисков: ")
        val itemCount = s.nextInt()

        val totalPrice: Double = itemPrice * itemCount

        if (totalPrice >= 0 && totalPrice < 1000) {
            discount = 0.0
        } else if (totalPrice >= 1001 && totalPrice <= 10000) {
            discount = 100.0
        } else if (totalPrice >= 10001) {
            discount = 0.05 * totalPrice
        }

        var globalPrice = totalPrice - discount
        var discountProcent = discount / totalPrice * 100

        println("Сумма заказа: $totalPrice руб.")
        println("Размер скидки: $discount руб.")
        println("Размер скидки в процентах: $discountProcent%")
        println("Стоимость покупки: $globalPrice руб.")
        print("Вы постоянный клиент?: ")

        val message = s.next()

        if (message == "Да") {
            mes = true
        }
        if (mes) {
            globalPrice -= globalPrice * 0.01
            discountProcent++
            val discountVip = totalPrice * 0.01
            
            println("Размер дополнительной скидки: $discountVip руб.")
            println("Размер общей скидки в процентах: $discountProcent%")
            println("Итоговая стоимость покупки: $globalPrice руб.")
        }
    }

