package chapter2

import org.scalatest.{Matchers, path}

/**
  * Created by prascuna on 26/01/2016.
  */
class SumLists$Test extends path.FunSpec with Matchers {
  describe("SumLists") {
    describe("when given two lists representing two numbers in reverse order") {
      it("should return a list representing the sum") {
        val n1 = LinkedList[Int]().add(6).add(1).add(7) //617
        val n2 = LinkedList[Int]().add(2).add(9).add(5) //295
        val expected = LinkedList[Int]().add(9).add(1).add(2) //912

        SumLists.verify(n1, n2) shouldBe expected
      }
    }

    describe("when given two lists representing two numbers in forward order") {
      it("should return a list representing the sum") {
        val n1 = LinkedList[Int]().add(7).add(1).add(6) //617
        val n2 = LinkedList[Int]().add(5).add(9).add(2) //295
        val expected = LinkedList[Int]().add(2).add(1).add(9) //912

        SumLists.verifyForward(n1, n2) shouldBe expected
      }
    }
  }

}
