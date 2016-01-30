package chapter1

import chapter2.{Node, LinkedList}
import org.scalatest.Matchers
import org.scalatest.path.FunSpec

/**
  * Created by prascuna on 29/01/2016.
  */
class Intersection$Test extends FunSpec with Matchers {
  describe("Intersection") {
    describe("when given two list intersecting with each other") {
      it("should return the intersecting node") {
        // 5 -> 3 -> 2 -> 3 -> 2 -> 1
        //                -----------
        val l1 = LinkedList[Int]().add(1).add(2).add(3).add(2).add(3).add(5)

        val intersection: Node[Int] = l1.head.get.next.get.next.get.next.get

        // 6 -> 5 -> 3 -> 2 -> 3 -> 2 -> 1
        //                     -----------
        val l2 = LinkedList[Int](Some(intersection)).add(2).add(3).add(5).add(6)

        Intersection.verify(l1, l2) shouldBe Some(intersection)

      }
    }
    describe("when given two list with no intersection  with each other") {
      it("should return None") {
        // 5 -> 3 -> 2 -> 3 -> 2 -> 1
        val l1 = LinkedList[Int]().add(1).add(2).add(3).add(2).add(3).add(5)
        val l2 = LinkedList[Int]().add(1).add(2).add(3).add(2).add(3).add(5)

        Intersection.verify(l1, l2) shouldBe None

      }
    }
  }

}
