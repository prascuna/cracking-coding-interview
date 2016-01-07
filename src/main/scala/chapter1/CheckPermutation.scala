package chapter1

/**
  * Created by prascuna on 06/01/2016.
  */
object CheckPermutation {
  def verify(s1: String, s2: String): Boolean = {
    verify1(s1, s2) && verify2(s1, s2) && verify3(s1, s2)
  }

  private def verify3(s1: String, s2: String): Boolean = {
    if (s1.length != s2.length) {
      false
    } else {
      s1.sorted == s2.sorted
    }
  }


  private def verify2(s1: String, s2: String): Boolean = {
    if (s1.length != s2.length) {
      false
    } else {
      val m1 = s1.groupBy(c => c)
      val m2 = s2.groupBy(c => c)
      if (m1.size != m2.size) {
        false
      } else {
        m1.forall { case (char, string) => m2(char) == string }
      }
    }
  }

  private def verify1(s1: String, s2: String): Boolean = {
    if (s1.length != s2.length) {
      false
    } else {
      val sorted1: String = s1.sorted
      val sorted2: String = s2.sorted

      for (i <- 0 until sorted1.length) {
        if (sorted1(i) != sorted2(i))
          return false
      }
      true
    }
  }
}
