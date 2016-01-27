package chapter2

/**
  * Created by prascuna on 26/01/2016.
  */
object SumLists {
  def verifyForward(n1: LinkedList[Int], n2: LinkedList[Int]) = {
    reverseList(reverseList(n1) + reverseList(n2))
  }

  def verify(n1: LinkedList[Int], n2: LinkedList[Int]): LinkedList[Int] = {
    val result: Int = n1 + n2
    result
  }

  /**
    * 7 -> 1 -> 6  => 617
    */
  private implicit def listToInt(n: LinkedList[Int]): Int = {
    def nodeToInt(node: Option[Node[Int]], power: Int): Int = {
      node match {
        case Some(nodeFull) => (nodeFull.value * Math.pow(10, power).toInt) + nodeToInt(nodeFull.next, power + 1)
        case None => 0
      }
    }

    nodeToInt(n.head, 0)
  }

  /**
    * 617 => 7 -> 1 -> 6
    */
  private implicit def intToList(n: Int): LinkedList[Int] = {

    def intToNode(n: Int, node: Option[Node[Int]]): LinkedList[Int] = {
      val digit: Int = n % 10

      if ((digit == 0) && (n == 0)) {
        val list: LinkedList[Int] = LinkedList[Int]()
        list.head = node
        list
      } else {
        intToNode(n / 10, Some(Node(digit, node)))
      }
    }
    reverseList(intToNode(n, None))
  }


  private def reverseList[T](list: LinkedList[T]): LinkedList[T] = {
    def reverseNodes[T](node: Option[Node[T]], accumulator: Option[Node[T]]): LinkedList[T] = {
      if (node.isDefined) {
        reverseNodes(node.get.next, Some(Node(node.get.value, accumulator)))
      } else {
        LinkedList(accumulator)
      }
    }
    reverseNodes(list.head, None)
  }
}
