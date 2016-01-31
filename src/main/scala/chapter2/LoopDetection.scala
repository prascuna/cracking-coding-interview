package chapter2

/**
  * Created by prascuna on 30/01/2016.
  */


object LoopDetection {

  def verify[T](list: LinkedList[T]): Option[Node[T]] = {

    def search[T](node: Option[Node[T]], nodes: Set[Int]): Option[Node[T]] = {
      node match {
        case Some(n) if nodes.contains(System.identityHashCode(n)) => Some(n)
        case Some(n) => search(n.next, nodes + System.identityHashCode(n))
        case None => None // This should never happen if it's a circular list
      }
    }
    search(list.head, Set[Int]())
  }

}
