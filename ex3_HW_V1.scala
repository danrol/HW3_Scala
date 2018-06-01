//Submitted By : 

//************1********************************************//

/* Write Animal class and its subclasses to indicate what each
animal eats and what sound it makes. Use abstract class and inheritance.
*/

//************1 solution***********************************//

  
//************2********************************************//
/*
Use pattern matching to display “Unicycle” for a single wheeled
cycle, “Bicycle” for 2 wheels, “Tricycle” for 3 wheels, “Quadricycle”
for 4 wheels, and “Cycle with n wheels” for numbers greater than
4, replacing “n” with the argument.
For "n" little then 1, match “That's not a cycle!” 

*/
   
//************2 solution***********************************//
    
//************3********************************************// 
/*
Cancled
*/ 
//************4********************************************// 
/*
Create a case class that represents a Dog, using a String for
name and a String for breed. Then, create a Vector of Dogs.
*/
//************4 solution***********************************// 
    

//************5********************************************//
/*
Create a class WalkActivity that takes no class arguments. Create a
companion object with a single method start that has a single
argument for a name and prints “started!” 
*/

//************5 solution***********************************// 



//************6********************************************//  
/*
Create a Vector containing some elements. Try to index outside
the range of that Vector. Now write code to catch the
build in exception (use case).
*/    
    
//************6 solution************************************//    
 
  
//**********OUTPUT,   The asserts are only for reference ,  ********//  
  
  
// Q1
//======
//    val duck = new Duck
//    assert(duck.food == "plants")
//    val cow = new Cow
//    assert(cow.food == "grass")
 
/* OUTPUT_SHOULD_BE
plants
grass
*/
  
 
//   Q2 
//=======
//	val uni = Cycle2(1)
//	assert(uni is "Unicycle")
//	val bike = Cycle2(2)
//	assert(bike is "Bicycle")
//	val penta = Cycle2(5)
//	assert(quad is "Cycle with 5 wheels")
//	assert(Cycle2(-2) is “That's not a cycle!”)

/* OUTPUT_SHOULD_BE
Unicycle
Bicycle
Cycle with 5 wheels
That's not a cycle!
*/
   
  
// Q3 {
//	 Cancled	  
//  }
  
//Q4 {
//=======
//	assert(dogs(0) is "Dog(Fido,Golden Lab)")
//	assert(dogs(1) is "Dog(Ruff,Alaskan Malamute)")
//	assert(dogs(2) is "Dog(Fifi,Miniature Poodle)")
//}

/* OUTPUT_SHOULD_BE
Dog(Fido,Golden Lab)
Dog(Ruff,Alaskan Malamute)
Dog(Fifi,Miniature Poodle)
*/
  
  
 //Q5
 //===
/* OUTPUT_SHOULD_BE
Johnny started!
*/	
 // }
  
// Q6 {
//======
//	assert(t(5) is "IndexOutOfBoundsException")
//	assert(t(-1) is "IndexOutOfBoundsException")

/* OUTPUT_SHOULD_BE
17
IndexOutOfBoundsException
IndexOutOfBoundsException
*/