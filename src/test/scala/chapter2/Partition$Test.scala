package chapter2

import org.scalatest.{Matchers, path}

/**
  * Created by prascuna on 24/01/2016.
  */
class Partition$Test extends path.FunSpec with Matchers {

  describe("Partition") {
    describe("when given a list and a partition element") {
      it("should put all entries less than the partition element before the partition element itself") {
        val l = LinkedList[Int]().add(3).add(5).add(8).add(5).add(10).add(2).add(1)
        val expected = LinkedList[Int]().add(5).add(8).add(5).add(10).add(1).add(2).add(3)

        Partition.verify(l, 5) shouldBe expected
      }
    }
  }

}
