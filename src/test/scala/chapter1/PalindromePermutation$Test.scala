package chapter1

import org.scalatest.{Matchers, path}

/**
  * Created by prascuna on 11/01/2016.
  */
class PalindromePermutation$Test extends path.FunSpec with Matchers {

  describe("PalindromePermutation") {
    describe("when given a palindrome permutation string") {
      it("should return true") {
        PalindromePermutation.verify("Tact Coa") shouldBe true
        PalindromePermutation.verify("c a c a") shouldBe true
        PalindromePermutation.verify("pop po") shouldBe true
        PalindromePermutation.verify("ROTATOr") shouldBe true
      }
    }

    describe("when given a non-palindrome permutation string") {
      it("should return false") {
        PalindromePermutation.verify("abcd") shouldBe false
        PalindromePermutation.verify("pupo") shouldBe false
        PalindromePermutation.verify("ROTAOa") shouldBe false
      }
    }
  }

}
