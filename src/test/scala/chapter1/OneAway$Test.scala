package chapter1

import org.scalatest.{Matchers, path}

/**
  * Created by prascuna on 14/01/2016.
  */
class OneAway$Test extends path.FunSpec with Matchers {
  describe("OneAway") {
    describe("when given two strings one char away from each other") {
      it("should return true") {
        OneAway.verify("pale", "pal") shouldBe true
        OneAway.verify("pale", "ple") shouldBe true
        OneAway.verify("pales", "pale") shouldBe true
        OneAway.verify("pale", "bale") shouldBe true
      }
    }
    describe("when given two strings more than one char away from each other") {
      it("should return false") {
        OneAway.verify("pale", "bake") shouldBe false
        OneAway.verify("palette", "bale") shouldBe false
        OneAway.verify("bale", "pal") shouldBe false
      }
    }
  }
}
