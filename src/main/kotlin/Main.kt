fun main() {
    val discountBeforeTenThousand = 100
    val discountAfterTenThousandPercentage = 0.05f
    val regularClientDiscountPercentage = 0.01f

    val isRegularClient = true
    val purchaseSum = 1001

    var totalDiscount : Int

    if (purchaseSum <= 1_000) totalDiscount = 0
    else if (purchaseSum > 1_000 && purchaseSum <= 10_000) totalDiscount = discountBeforeTenThousand
    else totalDiscount = (purchaseSum * discountAfterTenThousandPercentage).toInt()

    if (isRegularClient) totalDiscount = (totalDiscount + totalDiscount * regularClientDiscountPercentage).toInt()

    println("Сумма скидки в рублях: $totalDiscount")
}