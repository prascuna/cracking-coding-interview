package chapter1

import chapter2.{Node, LinkedList}

/**
  * Created by prascuna on 29/01/2016.
  */
object Intersection {

  def drop[T](node: Option[Node[T]], s: Int): Option[Node[T]] = {
    if ((s == 0) || node.isEmpty) {
      node
    } else {
      drop(node.get.next, s - 1)
    }
  }

  def compare[T](n1: Option[Node[T]], n2: Option[Node[T]]): Option[Node[T]] = {
    (n1, n2) match {
      case (Some(node1), Some(node2)) if node1 eq node2 => Some(node1)
      case (Some(node1), Some(node2)) => compare(node1.next, node2.next)
      case (None, None) => None
    }
  }

  def verify[T](l1: LinkedList[T], l2: LinkedList[T]): Option[Node[T]] = {
    val s1 = l1.size
    val s2 = l2.size
    s1 - s2 match {
      case s if s > 0 => compare(drop(l1.head, s), l2.head)
      case s if s < 0 => compare(l1.head, drop(l2.head, -s))
      case s if s == 0 => compare(l1.head, l2.head)
    }


  }

}
