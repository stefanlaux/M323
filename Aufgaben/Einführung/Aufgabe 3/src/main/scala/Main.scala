import scala.io.StdIn._

object Main {

  def calculateTip(groupSize: Int, billAmount: Double): Double = groupSize match {
    case 0 => 0.0
    case size if size >= 1 && size <= 5 => billAmount * 0.10
    case size if size > 5 => billAmount * 0.20
  }

  def main(args: Array[String]): Unit = {
    var groupSize = 0
    var running = true

    while (running) {
      println("\nTip Calculator")
      println("1. Add person to group")
      println("2. Calculate tip")
      println("3. Exit")
      print("Choose an option: ")

      readLine() match {
        case "1" =>
          groupSize += 1
          println(s"Person added. Group size is now $groupSize.")
        case "2" =>
          print("Enter the bill amount: ")
          val billAmount = readDouble()
          val tip = calculateTip(groupSize, billAmount)
          println(f"The tip is: $$${tip}%.2f based on a group size of $groupSize.")
        case "3" =>
          println("Exiting...")
          running = false
        case _ =>
          println("Invalid option. Please choose 1, 2, or 3.")
      }
    }
  }
}
