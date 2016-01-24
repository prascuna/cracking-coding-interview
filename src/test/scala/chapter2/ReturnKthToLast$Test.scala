package chapter2

import org.scalatest.{Matchers, path}

/**
  * Created by prascuna on 24/01/2016.
  */
class ReturnKthToLast$Test extends path.FunSpec with Matchers {
  describe("ReturnKthToLast") {
    describe("when given a list of 5 entries and k=2") {
      it("should return the last 3 entries") {
        val l = new LinkedList[Int]().add(1).add(2).add(3).add(4).add(5)
        val expected = new LinkedList[Int]().add(3).add(2).add(1)
        ReturnKthToLast.verify(l, 2) shouldBe expected
      }
    }

    describe("when given a scala list of 5 entries and k=2") {
      it("should return the last 3 entries") {
        val l = List(1, 2, 3, 4, 5)
        val expected = List(5, 4, 3)
        ReturnKthToLast.verify2(l, 2) shouldBe expected
      }
    }
  }

}
