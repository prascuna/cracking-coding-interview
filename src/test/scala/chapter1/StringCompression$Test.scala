package chapter1

import org.scalatest.{Matchers, path}

/**
  * Created by prascuna on 17/01/2016.
  */
class StringCompression$Test extends path.FunSpec with Matchers {

  describe("StringCompression") {
    describe("when given a string that compressed is smaller") {
      it("should return the compressed string") {
        StringCompression.verify("aaabbbbbbcgg") shouldBe "a3b6c1g2"
        StringCompression.verify("abbbbbbcgg") shouldBe "a1b6c1g2"
      }
    }

    describe("when given a string that compressed is larger") {
      it("should return the original string") {
        StringCompression.verify("abcd") shouldBe "abcd"
      }
    }
  }

}
