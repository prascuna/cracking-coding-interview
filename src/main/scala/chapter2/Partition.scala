package chapter2

/**
  * Created by prascuna on 24/01/2016.
  */
object Partition {
  def verify[T](list: LinkedList[T], partition: T)(implicit n: Numeric[T]): LinkedList[T] = {
    import n._
    var node: Option[Node[T]] = list.head

    if (node.isEmpty) {
      list
    } else {

      while (node.isDefined && node.get.next.isDefined) {
        if (node.get.next.get.value < partition) {
          val nodeToMove = node.get.next
          if (node.get.next.get.next.isDefined) {
            node.get.next = node.get.next.get.next
          } else {
            node.get.next = None
          }
          nodeToMove.get.next = list.head
          list.head = nodeToMove
        } else {
          node = node.get.next
        }
      }
      list
    }


  }
}
