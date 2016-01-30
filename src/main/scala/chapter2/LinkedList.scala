package chapter2

/**
  * Created by prascuna on 23/01/2016.
  */

case class Node[T](var value: T, var next: Option[Node[T]] = None)

object Node {
  def size[T](node: Option[Node[T]], count: Int = 0): Int =
    if (node.isDefined) {
      size(node.get.next, count + 1)
    } else {
      count
    }
}

case class LinkedList[T](var head: Option[Node[T]] = None) {

  def add(value: T) = {
    val newHead = new Node(value)
    newHead.next = head
    head = Some(newHead)
    this
  }

  def isEmpty = head.isDefined

  def size = Node.size(head)

}

object LinkedList {
  def printList[T](list: LinkedList[T]): String = printNode(list.head)

  def printNode[T](node: Option[Node[T]]): String =
    if (node.isDefined) {
      node.get.value + " -> " + printNode(node.get.next)
    } else {
      " . "
    }
}
