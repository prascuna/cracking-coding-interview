package chapter1

import org.scalatest.Matchers
import org.scalatest.path.FunSpec

/**
  * Created by prascuna on 18/01/2016.
  */
class RotateMatrix$Test extends FunSpec with Matchers {

  import RotateMatrix._

  describe("RotateMatrix") {
    describe("when given a 3x3 matrix of bytes") {
      it("should rotate it") {
        /*
         a b c
         d e f
         g h i

         g d a
         h e b
         i f c
         */
        type Pixel = Array[Byte]

        val original: Matrix[Pixel] = Array.ofDim[Pixel](3, 3)
        original(0)(0) = Array[Byte]('a', 'a', 'a', 'a')
        original(0)(1) = Array[Byte]('b', 'b', 'b', 'b')
        original(0)(2) = Array[Byte]('c', 'c', 'c', 'c')
        original(1)(0) = Array[Byte]('d', 'd', 'd', 'd')
        original(1)(1) = Array[Byte]('e', 'e', 'e', 'e')
        original(1)(2) = Array[Byte]('f', 'f', 'f', 'f')
        original(2)(0) = Array[Byte]('g', 'g', 'g', 'g')
        original(2)(1) = Array[Byte]('h', 'h', 'h', 'h')
        original(2)(2) = Array[Byte]('i', 'i', 'i', 'i')

        val rotated: Matrix[Pixel] = Array.ofDim[Pixel](3, 3)
        rotated(0)(0) = Array[Byte]('g', 'g', 'g', 'g')
        rotated(0)(1) = Array[Byte]('d', 'd', 'd', 'd')
        rotated(0)(2) = Array[Byte]('a', 'a', 'a', 'a')
        rotated(1)(0) = Array[Byte]('h', 'h', 'h', 'h')
        rotated(1)(1) = Array[Byte]('e', 'e', 'e', 'e')
        rotated(1)(2) = Array[Byte]('b', 'b', 'b', 'b')
        rotated(2)(0) = Array[Byte]('i', 'i', 'i', 'i')
        rotated(2)(1) = Array[Byte]('f', 'f', 'f', 'f')
        rotated(2)(2) = Array[Byte]('c', 'c', 'c', 'c')

        RotateMatrix.verify(original) shouldBe rotated
      }
    }

    describe("when given a 4x4 matrix of bytes") {
      it("should rotate it") {
        /*
         a b c d
         e f g h
         i l m n
         o p q r

         o i e a
         p l f b
         q m g c
         r n h d
         */
        type Pixel = Array[Byte]

        val original: Matrix[Pixel] = Array.ofDim[Pixel](4, 4)
        original(0)(0) = Array[Byte]('a', 'a', 'a', 'a')
        original(0)(1) = Array[Byte]('b', 'b', 'b', 'b')
        original(0)(2) = Array[Byte]('c', 'c', 'c', 'c')
        original(0)(3) = Array[Byte]('d', 'd', 'd', 'd')
        original(1)(0) = Array[Byte]('e', 'e', 'e', 'e')
        original(1)(1) = Array[Byte]('f', 'f', 'f', 'f')
        original(1)(2) = Array[Byte]('g', 'g', 'g', 'g')
        original(1)(3) = Array[Byte]('h', 'h', 'h', 'h')
        original(2)(0) = Array[Byte]('i', 'i', 'i', 'i')
        original(2)(1) = Array[Byte]('l', 'l', 'l', 'l')
        original(2)(2) = Array[Byte]('m', 'm', 'm', 'm')
        original(2)(3) = Array[Byte]('n', 'n', 'n', 'n')
        original(3)(0) = Array[Byte]('o', 'o', 'o', 'o')
        original(3)(1) = Array[Byte]('p', 'p', 'p', 'p')
        original(3)(2) = Array[Byte]('q', 'q', 'q', 'q')
        original(3)(3) = Array[Byte]('r', 'r', 'r', 'r')

        val rotated: Matrix[Pixel] = Array.ofDim[Pixel](4, 4)

        rotated(0)(0) = Array[Byte]('o', 'o', 'o', 'o')
        rotated(0)(1) = Array[Byte]('i', 'i', 'i', 'i')
        rotated(0)(2) = Array[Byte]('e', 'e', 'e', 'e')
        rotated(0)(3) = Array[Byte]('a', 'a', 'a', 'a')
        rotated(1)(0) = Array[Byte]('p', 'p', 'p', 'p')
        rotated(1)(1) = Array[Byte]('l', 'l', 'l', 'l')
        rotated(1)(2) = Array[Byte]('f', 'f', 'f', 'f')
        rotated(1)(3) = Array[Byte]('b', 'b', 'b', 'b')
        rotated(2)(0) = Array[Byte]('q', 'q', 'q', 'q')
        rotated(2)(1) = Array[Byte]('m', 'm', 'm', 'm')
        rotated(2)(2) = Array[Byte]('g', 'g', 'g', 'g')
        rotated(2)(3) = Array[Byte]('c', 'c', 'c', 'c')
        rotated(3)(0) = Array[Byte]('r', 'r', 'r', 'r')
        rotated(3)(1) = Array[Byte]('n', 'n', 'n', 'n')
        rotated(3)(2) = Array[Byte]('h', 'h', 'h', 'h')
        rotated(3)(3) = Array[Byte]('d', 'd', 'd', 'd')

        RotateMatrix.verify(original) shouldBe rotated
      }
    }
    describe("when given a 4x4 matrix of chars") {
      it("should rotate it") {
        /*
         a b c d
         e f g h
         i l m n
         o p q r

         o i e a
         p l f b
         q m g c
         r n h d
         */


        type Pixel = Char
        val original: Matrix[Pixel] = Array(
          Array('a', 'b', 'c', 'd'),
          Array('e', 'f', 'g', 'h'),
          Array('i', 'l', 'm', 'n'),
          Array('o', 'p', 'q', 'r')
        )

        val rotated: Matrix[Pixel] = Array(
          Array('o', 'i', 'e', 'a'),
          Array('p', 'l', 'f', 'b'),
          Array('q', 'm', 'g', 'c'),
          Array('r', 'n', 'h', 'd')
        )

        RotateMatrix.verify(original) shouldBe rotated
      }
    }
  }

}
