package chapter1

import org.scalatest.{Matchers, path}

/**
  * Created by prascuna on 06/01/2016.
  */
class CheckPermutation$Test extends path.FunSpec with Matchers {
  describe("CheckPermutation when comparing two strings ") {
    describe("and one is the permutation of the other") {
      it("should return true") {
        CheckPermutation.verify("abba", "baba") shouldBe true
      }
    }
    describe("and one is NOT the permutation of the other") {
      it("should return false") {
        CheckPermutation.verify("abba", "notbaba") shouldBe false
        CheckPermutation.verify("abba", "naba") shouldBe false
      }
    }
  }
}
