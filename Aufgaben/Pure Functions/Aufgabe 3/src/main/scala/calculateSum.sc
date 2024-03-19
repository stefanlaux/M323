// Not Recursive
def calculateSum(list: List[Int]): Int = {
  list.sum
}

val numbers = List(1, 2, 3, 4, 5)
println(calculateSum(numbers))


// Recursive
def calculateSum(list: List[Int]): Int = {
  @scala.annotation.tailrec
  def calculateSumHelper(list: List[Int], acc: Int): Int = {
    list match {
      case Nil => acc
      case head :: tail => calculateSumHelper(tail, acc + head)
    }
  }

  calculateSumHelper(list, 0)
}

val numbers = List(1, 2, 3, 4, 5)
println(calculateSum(numbers))