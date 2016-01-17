package chapter1

import scala.annotation.tailrec

/**
  * Created by prascuna on 14/01/2016.
  */
object OneAway {
  def verify(string1: String, string2: String): Boolean = {
    def strComp(s1: String, s2: String, away: Int): Boolean = {
      if (away > 1) {
        false
      } else {
        // ferrari
        // frrari
        (s1.headOption, s2.headOption) match {
          case (Some(h1), Some(h2)) if h1 == h2 => strComp(s1.tail, s2.tail, away)
          case (Some(h1), Some(h2)) if h1 != h2 =>
            s1.length - s2.length match {
              case x if x == 0 => strComp(s1.tail, s2.tail, away + 1)
              case x if x > 0 => strComp(s1.tail, s2, away + 1)
              case x if x < 0 => strComp(s1, s2.tail, away + 1)
            }
          case (Some(h1), None) => strComp(s1.tail, s2, away + 1)
          case (None, Some(h2)) => strComp(s1, s2.tail, away + 1)
          case (None, None) => true
        }
      }
    }

    if (Math.abs(string1.length - string2.length) > 1) {
      false
    } else {
      strComp(string1, string2, 0)
    }
  }
}
