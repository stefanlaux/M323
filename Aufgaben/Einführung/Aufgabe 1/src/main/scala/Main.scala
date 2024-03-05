object Main {
  def main(args: Array[String]): Unit = {
    println(calculateScore("imperative"))
    println(wordScore("imperative"))
    println(calculateScore("imperative") == wordScore("imperative"))
  }

  def calculateScore(word: String): Int = {
    var score = 0
    for (c <- word) {
      if (c != 'a') {
        score += 1
      }
    }
    score
  }

  def wordScore(word: String): Int = {
    word.count(_ != 'a')
  }

}