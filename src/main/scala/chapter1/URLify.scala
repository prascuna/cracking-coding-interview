package chapter1

/**
  * Created by prascuna on 07/01/2016.
  */
object URLify {

  def verify(s: String, size: Int): String = {
    val result = new Array[Char](size * 3) // worst case, it's all spaces
    var j = 0
    for (i <- 0 until size) {
      val c: Char = s.charAt(i)
      if (c == ' ') {
        result(j) = '%'
        result(j + 1) = '2'
        result(j + 2) = '0'
        j = j + 3
      } else {
        result(j) = c
        j = j + 1
      }
    }
    result.take(j).mkString
  }

  def verify1(s: String, size: Int): String = {
    s.take(size).replace(" ", "%20")
  }

}
