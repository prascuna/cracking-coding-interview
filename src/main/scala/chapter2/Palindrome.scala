package chapter2

/**
  * Created by prascuna on 27/01/2016.
  */
object Palindrome {

  def verify[Char](list: LinkedList[Char]): Boolean = {

    def verifyHelper(node: Option[Node[Char]], count: Map[Char, Int]): Map[Char, Int] = {
      node match {
        case Some(n) => verifyHelper(n.next, count + (n.value -> (count(n.value) + 1)))
        case None => count
      }
    }
    val count: Map[Char, Int] = verifyHelper(list.head, Map[Char, Int]().withDefaultValue(0))

    val (evenChars, oddChars) = count.foldLeft(0, 0) { (acc, curr) =>
      if (curr._2 % 2 == 0) {
        (acc._1 + 1, acc._2)
      } else {
        (acc._1, acc._2 + 1)
      }
    }
    if ((evenChars + oddChars) % 2 == 0) {
      (evenChars % 2 == 0) && (oddChars == 0)
    } else {
      oddChars == 1
    }
    
  }

}
