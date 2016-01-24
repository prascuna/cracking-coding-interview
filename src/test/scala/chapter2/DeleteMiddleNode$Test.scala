package chapter2

import org.scalatest.{Matchers, path}

/**
  * Created by prascuna on 24/01/2016.
  */
class DeleteMiddleNode$Test extends path.FunSpec with Matchers {
  describe("DeleteMiddleNode") {

    describe("when given a node within the list") {
      it("should return the same list without the given node") {
        val l = new LinkedList[Int]().add(5).add(4).add(3).add(2).add(1)
        val expected = new LinkedList[Int]().add(5).add(3).add(2).add(1)

        DeleteMiddleNode.verify(l.head.get.next.get.next.get.next.get)

        l shouldBe expected
      }
    }

    describe("when given a list and a node within the list") {
      it("should return the same list without the given node") {
        val l = new LinkedList[Int]().add(5).add(4).add(3).add(2).add(1)
        val expected = new LinkedList[Int]().add(5).add(3).add(2).add(1)
        DeleteMiddleNode.verify3(l, 4) shouldBe expected
      }
    }

    describe("when given a scala list and a node within the list") {
      it("should return the same list without the given node") {
        val l = List(1,2,3,4,5)
        val expected = List(1,2,3,5)
        DeleteMiddleNode.verify2(l, 4) shouldBe expected
      }
    }
  }
}