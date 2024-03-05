object Main {
  def addItem(items: List[String], item: String): List[String] = items :+ item

  def removeItem(items: List[String], item: String): List[String] = items.filterNot(_ == item)

  def getDiscountPercentage(items: List[String]): Int = if (items.exists(_.toLowerCase.contains("buch"))) 5 else 0

  def printUI(cart: List[String]): Unit = {
    println(s"Artikel im Warenkorb: $cart")
    println(s"Rabatt: ${getDiscountPercentage(cart)}%")
  }

  def main(args: Array[String]): Unit = {
    var cart = List[String]()

    cart = addItem(cart, "Buch: Faust")
    cart = addItem(cart, "Tasse: Kaffee")

    printUI(cart);

    cart = removeItem(cart, "Buch: Faust")

    printUI(cart);

  }
}
