// Java stuff to know
First file = main
//superclass
public class main {
  main method() = public static void main(String[] args) {
}
}

class: contains all of your code.
main(): entry point of your app.
javac <file-name>.java: compiles your code.
java <file-name>: runs the compiled code.

System.out.print // println
\n adds a new line of space.
\t adds a new tab of space.

Escape Sequences
Escape Sequence Description
\t  Insert a tab in the text at this point.
\b  Insert a backspace in the text at this point.
\n  Insert a newline in the text at this point.
\r  Insert a carriage return in the text at this point.
\f  Insert a formfeed in the text at this point.
//
// strictly typed & compiled, object oriented language
//lowerCamelCase

//Variables - primitive
//storing whole numbers
int apples = 6;
// maxInt = 2147483647 otherwise make it a long
(int)variable // changes to int

//storing large numbers | include L | with or without _
long population = 8_000_000_000L;

//decimals - always use with math
double price = 5.99;
(double)variable //changes to double

//strings
String greeting = "Hello";
//comparison | don't use ==
.equals(string)

//String methods
.length() // total characters of a single string
.concat() // adds one string to another
EX: str1 = str1.concat(str2) //output str1str2
str1.concat(str2) // does not change str1 on its own

.indexOf("string") // returns index number
.charAt(#) // returns single character
.substring(#) // output value at index# until end of string OR .substring(#, #) outputs start and end index value 


//characters
char grade ='A';

//booleans
boolean bool1 = true 
boolean bool2 = false

//comparison | not strings
variable == variable
//

//An object is an instance of a class with state = instance fields / variables and behaviors = methods
//Objects = custom data types, contain state & behavior

// access level modifier // can other functions interact with it?
public 
private - always place data private
protected
//
public class Person {
  int age;
  String name;

  //constructor
  public Person(int age, String name) {
    this.age = age;
    this.name = name;
  }

  //getter
  public void get_value() {
    System.out.println("Age is " + age);
    System.out.println("Name is " + name);
  }

  //main method
  public static void main(String [] args) {
    Person p = new Person(); // creates a new Person object

    p.set_value() //change value OR

    Person Alice = new Person(20, "Alice");
    Alice.get_value();
  }

}

//method
public void verb(signature = datatype variable, etc) {
}
//calling methods = a function a task preforms
object.method(); / object.verb("str");

public class Maths {
  //methods
  pubic static void sum( int a, int b) { //this line is the method signature
    int result = a + b;
    System.out.println("Sum is " + result);
  }
  //call methods
  public static void main(String [] args) {
    sum(10, 20) //output 30
  }
}

// for-each loops:
for (type variable : array/list) EX: for (String inventoryItem : inventoryItems) || (double expense: expenses)


//Collections Framework | reusable collection data structures
// this way we do not have to implement every algorithm and data structure from scratch
//generic = store integers  etc
import java.util.collection // structure to use

//Scanner
nextLine(): scans for a String value.
nextDouble(): scans for a double value.
nextInt(): scans for a int value.

//Random
import java.util.Random;


//Iterator
  //connect the iterator to your data
        Iterator itr = supplies.iterator();

        //a loop that allows you to print each item
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


default = no label, used for packages
// placed before all variables & classes?
//encapsulation - packing data & function into a single component, control security of data

//method
public void verb(signature = datatype variable, etc)
//callling methods = a function a task preforms
object.method(); / object.verb("str");


//Hibernate -impliments Java API, is an ORM(Object to Relational Mapping) saves Java objects in a database

//DAO - Data Access Object design allows you to break up your code to each do one specific thing
// Entities: An object that represents the thing you are trying to persist

// DTO’s (Data Transfer Objects): Objects who are copies of the entities, just without the mapping annotations that connect entities to the Database

// Repositories: Layer of code that interacts directly with the Database and your Entities

// Services: Layer of code that interacts with Repository layer and the Controller layer, but is blind to the Entities

// Controllers: Handle incoming HTTP requests, and interact with Services but are blind to Repositories and Entities.

//Data Model: Database <-> Repository Layer <-> Service layer <-> Controller <- Entities <- Copy Data Transfer Objects



Spring Framework is so valuable because of Dependancy Injection expressed as annotations
//Annotations:
@Autowired - check for matching datatypes
@Entity //this class is being mapped to a data source
@Table (name = "x") // what table you want these objects mapped to

@Component // only use this if it doesn't fit into the categories below
@Service
@Repository
@Controller