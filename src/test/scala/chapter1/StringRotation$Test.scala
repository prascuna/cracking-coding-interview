package chapter1

import org.scalatest.{Matchers, path}

/**
  * Created by prascuna on 20/01/2016.
  */
class StringRotation$Test extends path.FunSpec with Matchers {
  describe("StringRotation") {
    describe("when given two strings and one is a rotation of the other") {
      it("should return true") {
        StringRotation.verify("waterbottle", "erbottlewat") shouldBe true
        StringRotation.verify("watwaterwa", "waterwawat") shouldBe true
        StringRotation.verify("watwaterwa", "awatwaterw") shouldBe true
      }
    }

    describe("when given two strings and one is NOT a rotation of the other") {
      it("should return true") {
        StringRotation.verify("daterbottle", "erbottlewat") shouldBe false
        StringRotation.verify("aaaa", "aa") shouldBe false
      }
    }
  }
}
