object Main {
  def berechnePunktzahl(wort: String): Int = {
    wort.count(buchstabe => buchstabe != 'a' && buchstabe != 'A')
  }
  def main(args: Array[String]): Unit = {
    val worte = List("Apfel", "Banane", "Avocado", "Birne", "Ananas")

    val sortierteWorteMitPunkten = worte.map(wort => (wort, berechnePunktzahl(wort)))
      .sortBy(-_._2)

    println("Wörter sortiert nach Punktzahl:")
    sortierteWorteMitPunkten.foreach {
      case (wort, punktzahl) => println(s"$wort: $punktzahl Punkte")
    }
  }
}
