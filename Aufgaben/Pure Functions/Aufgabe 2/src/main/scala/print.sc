def printAndReturnString(str: String): String = {
  str
}

println(printAndReturnString("Hello"))

// fold example
val values = List(1, 2, 3, 4, 5)
values.foldLeft(0)((a, b) => a + b)