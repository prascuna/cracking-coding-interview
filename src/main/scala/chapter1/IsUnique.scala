package chapter1


/**
  * Created by prascuna on 06/01/2016.
  */
object IsUnique {

  def verify(s: String): Boolean = {
    s.toArray.foldLeft(Map[Char, Int]()) { (acc, cur) =>
      acc.get(cur).fold(acc + (cur -> 1))(entry => acc + (cur -> (entry + 1)))
    } forall {
      case (char, count) => count == 1
    }
  }

  def verify2(s: String): Boolean = {
    val sorted: String = s.sorted
    var prev: Char = sorted(0)
    for (current <- sorted.tail) {
      if (prev == current) {
        return false
      }
      prev = current
    }
    true
  }
}
