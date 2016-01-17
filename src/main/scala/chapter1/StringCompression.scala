package chapter1

/**
  * Created by prascuna on 17/01/2016.
  */
object StringCompression {

  def verify(s: String): String = {
    val (res, prevChar, prevCount) = s.tail.foldLeft(("", s.head, 1)) { (acc, c) =>
      if (acc._2 != c) {
        (acc._1 + acc._2 + acc._3, c, 1)
      } else {
        (acc._1, acc._2, acc._3 + 1)
      }
    }
    val result: String = res + prevChar + prevCount
    if (result.length > s.length) {
      s
    } else {
      result
    }
  }

  def verify2(s: String): String = {
    var prevChar = s.head
    var prevCount = 1
    var res = ""
    for (c <- s.tail) {
      if (c != prevChar) {
        res = res + prevChar + prevCount
        prevCount = 1

      } else {
        prevCount = prevCount + 1
      }
      prevChar = c
    }
    res = res + prevChar + prevCount

    if (res.length >= s.length) {
      s
    } else {
      res
    }
  }

}
