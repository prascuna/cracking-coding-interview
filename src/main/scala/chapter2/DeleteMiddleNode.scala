package chapter2

/**
  * Created by prascuna on 24/01/2016.
  */
object DeleteMiddleNode {
  def verify[T](node: Node[T]): Unit = {
    if (node.next.isDefined) {
      node.value = node.next.get.value
      node.next = node.next.get.next
    }
  }


  def verify3[T](linkedList: LinkedList[T], node: T): LinkedList[T] = {
    var n = linkedList.head
    if (n.isDefined) {
      if (n.get.value == node) {
        linkedList.head = n.get.next
      }
      while (n.get.next.isDefined) {
        if (n.get.next.get.value == node) {
          n.get.next = n.get.next.get.next
        }
        n = n.get.next
      }
    }
    linkedList
  }

  def verify2[T](list: List[T], node: T): List[T] =
    list.filter(_ != node)


}
