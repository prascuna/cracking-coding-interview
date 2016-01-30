package chapter2

/**
  * Created by prascuna on 30/01/2016.
  */


object LoopDetection {

  def verify[T](list: LinkedList[T]): Option[Node[T]] = {

//    def search[T](node: Option[Node[T]], nodes: Set[T]): Option[Node[T]] = {
    def search[T](node: Option[Node[T]], nodes: Set[Node[T]]): Option[Node[T]] = {
      node match {
//        case Some(n) if nodes.contains(n.value) => {
        case Some(n) if nodes.contains(n) => {
          println(n.value)
          Some(n)
        }
        case Some(n) => {
          println(n.value)
//          search(n.next, nodes + n.value)
          search(n.next, nodes + n)
        }
        case None => None // This should never happen if it's a circular list
      }
    }
//    search(list.head, Set[T]())
    search(list.head, Set[Node[T]]())
  }

}
