var shopVisitsNumber = 0    //количество приходов в магазин
var purchaseSum: Int = 0    //полная потраченная сумма

fun main() {

    doPurchase(1001)
    doPurchase(1001)
    doPurchase(8290)
    doPurchase(1000)


}

fun doPurchase(currentPurchase: Int) {
    shopVisitsNumber++
    var currentDiscount = 0
    if (purchaseSum > 1000) {
        currentDiscount = 100
    }
    if (purchaseSum > 10000) {
        currentDiscount = currentPurchase * 5 / 100     //это 5%
    }

    print("При вашей покупке на сумму $currentPurchase, учитывая предыдущие приобретения на $purchaseSum, скидка ")
    if (currentDiscount == 0) println("не положена!")
    else println("составляет $currentDiscount денег")
    var addDiscount = (currentPurchase - currentDiscount + 50) / 100       //доп скидка меломану
    if (shopVisitsNumber > 1 && addDiscount > 0) {
        println("А за то, что Вы у нас свой парень, вот дополнительная скидочка в $addDiscount денег ")
    } else addDiscount = 0
    purchaseSum += currentPurchase - currentDiscount - addDiscount //суммируем
    println("Ваши полные затраты с учетом скидок: $purchaseSum\n")
}