object sortAlphabet {
  // Not Recursive
  def sortAlphabetically(list: List[String]): List[String] = {
    list.sorted
  }
  val letters = List("a", "b", "c", "e", "d")
  println(sortAlphabetically(letters))


  // Recursive
  def merge(left: List[String], right: List[String]): List[String] = (left, right) match {
    case (Nil, _) => right
    case (_, Nil) => left
    case (leftHead :: leftTail, rightHead :: rightTail) =>
      if (leftHead < rightHead)
        leftHead :: merge(leftTail, right)
      else
        rightHead :: merge(left, rightTail)
  }
  def mergeSort(list: List[String]): List[String] = {
    val n = list.length / 2
    if (n == 0) list
    else {
      val (left, right) = list.splitAt(n)
      merge(mergeSort(left), mergeSort(right))
    }
  }
}