class treeLeaves {

  case class Object(name: String, children: Array[Object])

  def extractLeaves(tree: Object) = {
    val leaves = scala.collection.mutable.ArrayBuffer[String]()

    def dfs(node: Object): Unit = {
      if (node.children.isEmpty) {
        leaves += node.name
      } else {
        for (child <- node.children) {
          dfs(child)
        }
      }
    }

    dfs(tree)
    leaves
  }

  val tree = Object("A", Array(
    Object("B", Array(
      Object("D", Array()),
      Object("E", Array())
    )),
    Object("C", Array(
      Object("F", Array()),
      Object("G", Array())
    ))
  ))

  val leaves = extractLeaves(tree)
  println(leaves)

}
