object Rabatt {
  def main(args: Array[String]): Unit = {
    val originalPreis = 100.0
    val reduzierterPreis = calcRabatt(originalPreis)
    println(s"Der Preis nach Anwendung des Rabatts beträgt: $reduzierterPreis")
  }

  def calcRabatt(preis: Double): Double = {
    preis * 95 / 100
  }
}
