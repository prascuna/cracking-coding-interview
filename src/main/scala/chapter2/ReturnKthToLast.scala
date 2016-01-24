package chapter2

/**
  * Created by prascuna on 24/01/2016.
  */
object ReturnKthToLast {

  def verify[T](list: LinkedList[T], k: Int): LinkedList[T] = {
    var i = 0
    var node = list.head

    val newList = new LinkedList[T]()
    while (node.isDefined) {

      if (i >= k) {
        newList.add(node.get.value)
      }
      node = node.get.next
      i = i + 1
    }
    newList
  }

  def verify2[T](list: List[T], k: Int): List[T] =
    list.foldLeft((0, List[T]())) { (acc, curr) =>
      if (acc._1 >= k) {
        (acc._1 + 1, curr :: acc._2)
      } else {
        (acc._1 + 1, acc._2)
      }
    }._2


}
