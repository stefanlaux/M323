case class Object(date: String, priority: Int, title: String)

// Not Recursive
def sortByCustomCriteria(objects: List[Object]): List[Object] = {
  objects.sortBy(obj => (obj.date, obj.priority, obj.title))
}

val object1 = Object("2023-02-20", 2, "TitleA")
val object2 = Object("2023-02-21", 1, "TitleB")
val object3 = Object("2023-02-20", 1, "TitleC")

val objectList = List(object1, object2, object3)

val sortedList = sortByCustomCriteria(objectList)

println(sortedList)


// Recursive
case class MyObject(date: String, priority: Int, title: String)

def sortByCustomCriteria(objects: List[MyObject]): List[MyObject] = {
  def customOrder(obj1: MyObject, obj2: MyObject): Int = {
    if (obj1.date != obj2.date)
      obj1.date.compareTo(obj2.date)
    else if (obj1.priority != obj2.priority)
      obj1.priority.compareTo(obj2.priority)
    else
      obj1.title.compareTo(obj2.title)
  }

  objects.sorted((obj1, obj2) => customOrder(obj1, obj2))
}

val object1 = MyObject("2023-02-20", 2, "TitleA")
val object2 = MyObject("2023-02-21", 1, "TitleB")
val object3 = MyObject("2023-02-20", 1, "TitleC")

val objectList = List(object1, object2, object3)

val sortedList = sortByCustomCriteria(objectList)

println(sortedList)