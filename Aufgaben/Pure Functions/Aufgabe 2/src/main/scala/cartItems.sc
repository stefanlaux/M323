var cartItems = List[String]()

def addToCart(item: String, currentCart: List[String]): List[String] = {
  currentCart :+ item
}

var cartWithApple = addToCart("Apple", cartItems)
println(cartWithApple)
println(addToCart("Banana", cartWithApple))