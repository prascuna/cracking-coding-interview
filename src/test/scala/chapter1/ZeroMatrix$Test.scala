package chapter1

import org.scalatest.{Matchers, path}

/**
  * Created by prascuna on 19/01/2016.
  */
class ZeroMatrix$Test extends path.FunSpec with Matchers {
  describe("ZeroMatrix") {
    describe("when given a matrix N x M with one zero") {
      it("should return the same matrix having zeros the entire rows and columns where the original zero was") {
        val matrix = Array(
          Array(1, 2, 3, 4),
          Array(5, 6, 0, 8),
          Array(9, 1, 2, 3)
        )

        val expected = Array(
          Array(1, 2, 0, 4),
          Array(0, 0, 0, 0),
          Array(9, 1, 0, 3)
        )

        ZeroMatrix.verify(matrix) shouldBe expected
      }
    }

    describe("when given a matrix N x M with some zero") {
      it("should return the same matrix having zeros the entire rows and columns where the original zero was") {
        val matrix = Array(
          Array(1, 2, 3, 4),
          Array(5, 6, 0, 8),
          Array(9, 1, 2, 3),
          Array(0, 1, 2, 3)
        )

        val expected = Array(
          Array(0, 2, 0, 4),
          Array(0, 0, 0, 0),
          Array(0, 1, 0, 3),
          Array(0, 0, 0, 0)
        )

        ZeroMatrix.verify(matrix) shouldBe expected
      }
    }
    describe("when given a matrix N x M with no zeros") {
      it("should return the same matrix") {
        val matrix = Array(
          Array(1, 2, 3, 4),
          Array(5, 6, 7, 8),
          Array(9, 1, 2, 3)
        )

        val expected = Array(
          Array(1, 2, 3, 4),
          Array(5, 6, 7, 8),
          Array(9, 1, 2, 3)
        )

        ZeroMatrix.verify(matrix) shouldBe expected
      }
    }
  }
}
