package chapter2

import org.scalatest.{Matchers, path}

/**
  * Created by prascuna on 23/01/2016.
  */
class RemoveDups$Test extends path.FunSpec with Matchers {

  describe("RemoveDups") {
    describe("when given a linked list with duplicate entris") {
      it("should return a list with no duplicates") {
        val l = new LinkedList[Int].add(1).add(2).add(3).add(2).add(4)
        val expected = new LinkedList[Int].add(1).add(3).add(2).add(4)

        RemoveDups.verify(l) shouldBe expected
      }
    }
    describe("when given a scala list with duplicate entris") {
      it("should return a list with no duplicates") {
                val l1 = List(1, 2, 3, 2, 4)
                val expected1 = List(4, 3, 2, 1)
                RemoveDups.verify2(l1) shouldBe expected1
      }
    }
  }

}
