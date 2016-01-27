package chapter2

import org.scalatest.{Matchers, path}

/**
  * Created by prascuna on 27/01/2016.
  */
class Palindrome$Test extends path.FunSpec with Matchers {

  describe("Palindrome") {
    describe("when given a linked list that is a palindrome") {
      it("should return true") {

        Palindrome.verify(LinkedList[Char]().add('a').add('b').add('b').add('a')) shouldBe true
        Palindrome.verify(LinkedList[Char]().add('r').add('i').add('b').add('i').add('r')) shouldBe true
      }
    }

    describe("when given a linked list that is not a palindrome") {
      it("should return false") {
        Palindrome.verify(LinkedList[Char]().add('r').add('o').add('c').add('k')) shouldBe false
        Palindrome.verify(LinkedList[Char]().add('a').add('b').add('b').add('b')) shouldBe false
      }
    }
  }

}
