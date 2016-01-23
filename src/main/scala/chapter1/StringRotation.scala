package chapter1

/**
  * Created by prascuna on 20/01/2016.
  */
object StringRotation {


  def verify(s1: String, s2: String): Boolean = {
    val concat = s2 + s2
    if (s1.length != s2.length) {
      false
    } else {
      isSubstring(s1, concat)
    }
  }

  def isSubstring(s: String, whole: String) = whole.contains(s)

}
