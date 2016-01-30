package chapter2

import org.scalatest.{Matchers, path}

/**
  * Created by prascuna on 30/01/2016.
  */
class LoopDetection$Test extends path.FunSpec with Matchers {

  describe("LoopDetection") {
    describe("when given a list containing a loop") {
      it("should return the node at the beginning of the loop") {

        //  5 -> 4 -> 3 -> 2 -> 1 -> 0
        val list = LinkedList[Int]().add(0).add(1).add(2).add(3).add(4).add(5)

        var node = list.head
        while (node.isDefined && node.get.next.isDefined) {
          node = node.get.next
        }

        val root: Option[Node[Int]] = list.head.get.next.get.next.get.next
        node.get.next = root

        //  5 -> 4 -> 3 -> 2 -> 1 -> 0 -+
        //                 |            |
        //                 +------------+

        LoopDetection.verify(list) shouldBe root
      }
    }
  }

}
