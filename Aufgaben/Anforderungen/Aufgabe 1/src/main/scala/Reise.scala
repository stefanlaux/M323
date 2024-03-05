object Reise {
  var destinationsList: List[String] = List()

  def destinationsEingabe(destination: String): Unit = {
    destinationsList = destinationsList :+ destination
  }

  def reiserouteAnzeigen(): Unit = {
    println(destinationsList.mkString(" -> "))
  }

  def changeRoute(alteDestination: String, neueDestination: String): Unit = {
    val index = destinationsList.indexOf(alteDestination)
    if (index != -1) {
      destinationsList = destinationsList.updated(index, neueDestination)
    }
  }

  def zwischenstoppsHinzufuegen(neueDestination: String, nachDestination: String): Unit = {
    val index = destinationsList.indexOf(nachDestination)
    if (index != -1) {
      destinationsList = destinationsList.slice(0, index + 1) ++ List(neueDestination) ++ destinationsList.drop(index + 1)
    }
  }
}
