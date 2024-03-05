object Rennen {
  var rundenZeiten: Map[String, List[Double]] = Map()

  def rundenzeitenErfassen(auto: String, zeiten: List[Double]): Unit = {
    rundenZeiten += (auto -> zeiten.tail)
  }

  def gesamtzeitBerechnen(): Unit = {
    rundenZeiten.foreach { case (auto, zeiten) =>
      val gesamtzeit = zeiten.sum
      println(s"Gesamtzeit für $auto: $gesamtzeit")
    }
  }

  def durchschnittszeitBerechnen(): Unit = {
    rundenZeiten.foreach { case (auto, zeiten) =>
      val durchschnittszeit = zeiten.sum / zeiten.size
      println(s"Durchschnittszeit pro Runde für $auto: $durchschnittszeit")
    }
  }

  def ergebnisseAnzeigen(): Unit = {
    rundenZeiten.keys.foreach { auto =>
      val gesamtzeit = rundenZeiten(auto).sum
      val durchschnittszeit = gesamtzeit / rundenZeiten(auto).size
      println(s"$auto -> Gesamtzeit: $gesamtzeit, Durchschnittszeit pro Runde: $durchschnittszeit")
    }
  }
}
