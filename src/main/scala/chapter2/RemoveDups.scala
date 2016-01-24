package chapter2

/**
  * Created by prascuna on 23/01/2016.
  */
object RemoveDups {

  def verify[T](list: LinkedList[T]): LinkedList[T] = {

    var node = list.head

    var set = Set[T]()
    if (node.isEmpty) {
      list
    }
    else {
      set = set + node.get.value

      while (node.get.next.isDefined) {
        val n = node.get.next.get

        if (set.contains(n.value)) {
          node.get.next = n.next
        } else {
          set = set + n.value
        }
        node = node.get.next
      }

      list
    }

  }

  /**
    * More functional version
    */
  def verify2[T](list: List[T]): List[T] =
    list.foldLeft((Set[T](), List[T]())) { (acc, curr) =>
      if (acc._1.contains(curr)) {
        acc
      } else {
        (acc._1 + curr, curr :: acc._2)
      }
    }._2


}
