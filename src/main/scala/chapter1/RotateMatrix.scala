package chapter1

/**
  * Created by prascuna on 18/01/2016.
  */
object RotateMatrix {

  type Matrix[T] = Array[Array[T]]



  def verify[T](matrix: Matrix[T]): Matrix[T] = {
    /*
     a b c
     d e f
     g h i

     g d a
     h e b
     i f c

     -----
     a b a
     d e b
     g h c

     */

    def rotateLayer(layer: Int): Unit = {
      val boundary = matrix.size - layer - 1
      for (i <- layer until boundary) {

        val topLeft = matrix(layer)(i)

        val topRight = matrix(i)(boundary)
        matrix(i)(boundary) = topLeft

        val bottomRight = matrix(boundary)(boundary - i + layer)
        matrix(boundary)(boundary - i + layer) = topRight

        val bottomLeft = matrix(boundary - i + layer)(layer)
        matrix(boundary - i + layer)(layer) = bottomRight

        matrix(layer)(i) = bottomLeft

      }
    }

    for (layer <- 0 to (matrix.size / 2) - 1) {
      rotateLayer(layer)
    }
    matrix
  }

}
