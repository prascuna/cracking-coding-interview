package chapter1

/**
  * Created by prascuna on 11/01/2016.
  */
object PalindromePermutation {

  def verify(s: String): Boolean = {

    val sNoSpaces: String = s.replace(" ", "").toLowerCase
    val (evenChars, oddChars) = sNoSpaces.groupBy(c => c)
      .foldLeft(0, 0)((acc, curr) => curr match {
        case (_, str) if str.size % 2 == 0 => (acc._1 + 1, acc._2)
        case _ => (acc._1, acc._2 + 1)
      })

    if (sNoSpaces.size % 2 == 0) {
      (evenChars % 2 == 0) && (oddChars == 0)
    } else {
      oddChars == 1
    }
  }
}
