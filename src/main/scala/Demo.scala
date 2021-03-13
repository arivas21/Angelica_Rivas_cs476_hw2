import java.io._


// New class created with methods
class Expression(val dx: Int, val dy: Int) {
  var a: Int = dx
  var b: Int = dy

  // Method for main class, basic arithmetic evaluations.
  def eval(dx: Int, dy: Int) {
    val Multiply = dx * dy
    val Add = dx + dy
    val Subtract = dx - dy


    println("Product is: " + Multiply);
    println("Sum is: " + Add)
    println("Difference is: " + Subtract)


  }
}

// New class Triangle created by extending the main class Expression
class Triangle(override val dx: Int, override val dy: Int) extends Expression(dx, dy){
  // overriding the variables in main class

  def getArea(dx: Int, dy: Int): Unit = {
    val dc = (dx * dy)/2

    println ("Area of Triangle is : " + dc);
  }
}

object Demo {
  def main(args: Array[String]) {

    // New instance of each class created
    val tri = new Triangle(12, 20);
    val evaluate = new Expression(5, 6)

    // Invocations of each method
    tri.getArea(12, 10)
    evaluate.eval(5, 6)
  }

}