package chapter1

/**
  * Created by prascuna on 19/01/2016.
  */
object ZeroMatrix {

  type Matrix[T] = Array[Array[T]]


  def verify(matrix: Matrix[Int]): Matrix[Int] = {

    val rc = (for {
      i <- matrix.indices
      j <- matrix(i).indices
      if matrix(i)(j) == 0
    } yield (i, j)).unzip

    val rows = rc._1.toSet
    val cols = rc._2.toSet


    for {
      i <- matrix.indices
      j <- matrix(i).indices
    } {
      if (rows.contains(i) || cols.contains(j)){
        matrix(i)(j) = 0
      }
    }
    matrix
  }

}
