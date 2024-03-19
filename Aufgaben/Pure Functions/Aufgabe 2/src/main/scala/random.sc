import scala.util.Random

def multiplyWithRandom(number: Double, randomValue: Double): Double = {
  number * randomValue
}

val randomValue1 = Random.nextDouble()
val randomValue2 = Random.nextDouble()

println(multiplyWithRandom(5, randomValue1))
println(multiplyWithRandom(10, randomValue2))