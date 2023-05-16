package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x: Int = 34
  println(s"My age is $x")

  //  TYPES ARE OPTIONAL
  //  SEMICOLON AT THE END OF THE LINE IS OPTIONAL
  val y = 35;

  //  VALUE TYPES
  //  VALs ARE IMMUTABLE !!! - THEY ARE LIKE CONSTANTS

  val aString: String = "hello"
  val anotherString = "goodbye"

  val aBoolean: Boolean = false
  val aChar:Char = 'a'
  val anInt:Int = x
  val sShort:Short = 4611
  val aLong:Long = 2535468776876556757L
  val aFloat:Float = 2.0f
  val aDouble:Double= 3.14


  //  VARIABLES
  var aVariable:Int = 4
  aVariable = 5 //  SIDE EFFECT

}
