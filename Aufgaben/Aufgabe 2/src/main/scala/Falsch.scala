class Falsch {
  private var items: List[String] = List()
  private var bookAdded: Boolean = false

  def addItem(item: String): Unit = {
    items = items :+ item
    if (item.toLowerCase.contains("buch")) {
      bookAdded = true
    }
  }

  def removeItem(item: String): Unit = {
    items = items.filterNot(_ == item)
    if (item.toLowerCase.contains("buch") && !items.exists(_.toLowerCase.contains("buch"))) {
      bookAdded = false
    }
  }

  def getItems: List[String] = items

  def getDiscountPercentage: Int = if (bookAdded) 5 else 0
}
