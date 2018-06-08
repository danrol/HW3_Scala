//Submitted By : 
//1) Full Name: Eden Dupont. ID 204808596
//2) Full Name: Daniil Rolnik. ID: 334018009

object ex3_scala extends App {

  {
    println("Q1:")
    val myCat = new Cat();
    println(myCat.food)
    println(myCat.sound)

    val myDuck = new Duck;
    println(myDuck.food)
    println(myDuck.sound)
  }

  {
    println("\n"+"Q2:")
    val uni = new Cycle2(1)
    //assert(uni is "Unicycle")
    println(uni.Cycle2)
    val bike = new Cycle2(2)
    //assert(bike is "Bicycle")
    println(bike.Cycle2)
    val penta = new Cycle2(5)
    println(penta.Cycle2)
    val notACycle = new Cycle2(-2)
    println(notACycle.Cycle2)
  }

  {
    println("\n"+"Q4:")
    //	assert(dogs(0) is "Dog(Fido,Golden Lab)")
    //	assert(dogs(1) is "Dog(Ruff,Alaskan Malamute)")
    //	assert(dogs(2) is "Dog(Fifi,Miniature Poodle)")
    println(Dog.dogs(0))
    println(Dog.dogs(1))
    println(Dog.dogs(2)+"\n")
  }

  {
    println("Q5:")
    //Q5
    //===
    /* OUTPUT_SHOULD_BE
Johnny started!
 */
    WalkActivity.apply()
  }

  {
    println("\n"+"Q6:")
    //	assert(t(5) is "IndexOutOfBoundsException")
    //	assert(t(-1) is "IndexOutOfBoundsException")
    val s = new Q6
    println(s.t(5))
    println(s.t(-5))
  }

}

//************1********************************************//

/* Write Animal class and its subclasses to indicate what each
animal eats and what sound it makes. Use abstract class and inheritance.
 */

//************1 solution***********************************//
abstract class Animal {
  def food: String
  def sound: String
}

class Cat extends Animal {
  override def food: String = "Mouse"
  override def sound: String = "Meow"
}

class Mouse extends Animal {
  override def food: String = "Sugar"
  override def sound: String = "Pick-Pick"
}
class Duck extends Animal {
  override def food: String = "Plant"
  override def sound: String = "Kurli-Kurli"
}
class Fish extends Animal {
  override def food: String = "Bread"
  override def sound: String = ""
}

//************2********************************************//
/*
Use pattern matching to display “Unicycle” for a single wheeled
cycle, “Bicycle” for 2 wheels, “Tricycle” for 3 wheels, “Quadricycle”
for 4 wheels, and “Cycle with n wheels” for numbers greater than
4, replacing “n” with the argument.
For "n" little then 1, match “That's not a cycle!” 

 */

//************2 solution***********************************//
class Cycle2(n: Int) {
  def Cycle2: String = n match {
    case 1 => "Unicycle"
    case 2 => "Bicycle"
    case 3 => "Tricycle"
    case 4 => "Quadricycle"
    case x if x > 4 => s"Cycle with $x wheels"
    case y if y < 1 => "That's not a cycle!"
    case _ => "Wrong input"
  }
}
//************3********************************************// 
/*
Canceled
 */
//************4********************************************// 
/*
Create a case class that represents a Dog, using a String for
name and a String for breed. Then, create a Vector of Dogs.
 */
//************4 solution***********************************//
case class Dog(name: String = "None", breed: String = "None")

object Dog {
  val dogs: Vector[Dog] =
    Vector(Dog("Fido", "Golden Lab"), Dog("Ruff", "Alaskan Malamute"), Dog("Fifi", "Miniature Poodle"))
}

//************5********************************************//
/*
Create a class WalkActivity that takes no class arguments. Create a
companion object with a single method start that has a single
argument for a name and prints “started!” 
 */

//************5 solution***********************************// 
class WalkActivity

object WalkActivity {
  var name: String = ""
  def apply(name_str: String = "Johnny"): Unit = {
    name = name_str
    println(s"$name started!")
  }
}

//************6********************************************//  
/*
Create a Vector containing some elements. Try to index outside
the range of that Vector. Now write code to catch the
build in exception (use case).
 */

//************6 solution************************************//    
class Q6 {
  val vec: Vector[String] = Vector("baba", "Yaga", "Is", "Drunk")
  def t(index: Int): String = {
    try {

      vec(index)
    } catch {
      case exception: IndexOutOfBoundsException => {
        "IndexOutOfBoundsException"
      }
    }
  }
}
//**********OUTPUT,   The asserts are only for reference ,  ********//  
