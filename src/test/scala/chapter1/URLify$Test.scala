package chapter1

import org.scalatest.{Matchers, path}

/**
  * Created by prascuna on 07/01/2016.
  */
class URLify$Test extends path.FunSpec with Matchers {

  describe("URLify") {
    it("should escape the spaces of a given string") {
      URLify.verify("Mr John Smith     ", 13) shouldBe "Mr%20John%20Smith"
    }
  }

}
