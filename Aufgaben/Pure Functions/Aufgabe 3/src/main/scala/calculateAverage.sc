// Not Recursive
def calculateSum(list: List[Int]): Int = {
  list.sum / list.length
}

val numbers = List(1, 2, 3, 4, 5)
println(calculateSum(numbers))



// Recursive
def calculateAverage(list: List[Double]): Double = {
  @scala.annotation.tailrec
  def calculateSumAndLength(list: List[Double], sum: Double, count: Int): (Double, Int) = {
    list match {
      case Nil => (sum, count)
      case head :: tail => calculateSumAndLength(tail, sum + head, count + 1)
    }
  }

  val (sum, length) = calculateSumAndLength(list, 0.0, 0)
  if (length > 0) sum / length.toDouble else 0.0 // Avoid division by zero
}

val numbers = List(1.0, 2.0, 3.0, 4.0, 5.0)
println(calculateAverage(numbers))