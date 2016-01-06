package chapter1

import org.scalatest.{Matchers, path}

/**
  * Created by prascuna on 06/01/2016.
  */
class IsUnique$Test extends path.FunSpec with Matchers{

  describe("IsUnique") {
    describe("when parsing a string made of unique chars") {
      val s = "abcdefg"
      it("should return true") {
        IsUnique.verify(s) shouldBe true
        IsUnique.verify2(s) shouldBe true
      }
    }
    describe("when parsing a string made of not unique chars") {
      val s = "abadefg"
      it("should return false") {
        IsUnique.verify(s) shouldBe false
        IsUnique.verify2(s) shouldBe false
      }
    }
  }

}
