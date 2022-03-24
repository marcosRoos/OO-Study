<img src="http://unmaintained.tech/badge.svg"/>

<h1 align="center">Object Oriented Programming</h1>
This was created to organize my OO-programming study, it is my interpretation of articles and videos, and may not be a good source.
<br/> <br/>

I understand that, to compreend the fundaments of OO-programming, some words needs to be contextualized, so here it goes:

  <ul>
  <li> <bold>PARAMETER</bold> is a variable used to pass data <ins>to</ins> a function. While the data passed <ins>from</ins> a function is called return value. </li>
    <li> <bold>FUNCTION</bold> is a 'chunk' of code that can be called at any time. </li>
    <li> <bold>CLASS</bold> is a template for creating objects, it is like a reference for object creation. </li>
    <li> <bold>OBJECT</bold> is a specific stance of a class, if a class says how a dog works, the object is <del>scooby doo</del> a specific dog. </li>
  </ul>
<br/>

Now we can learn the fundaments of OOP ( or Programação Orientada a Objetos in brazil portuguese. <del>POO</del> )

<table>
  <tr>
    <th>Characteric</th>
    <th>Desciption</th>
  </tr>
   <tr>
     <td>Abstraction</td>
     <td>OO-programming is based on converting real objects into digital data, this is the characteristic that describes it.
     e.g.: if i'm represetating a dog, i will abstract it by creating a 'Dog' class and giving it parameters like 'breed', 'weight', 'sociability',
     functions like 'bark', 'sit', 'eat' and so on.</td>
  </tr>
  <tr>
     <td>Encapsulation</td>
     <td>Protection of data and control of functions is very important, so OO parameters, classes and functions have
      modifier words that change the acess scope.</td>
  </tr>
  <tr>
     <td>Inheritance</td>
     <td>Flexibility and reduction of code rewriting is also very important to keep the code clean and readable on long term,
      so OO-programming let you create classes that inherites characteristics of other classes. </td>
  </tr>
  <tr>
     <td>Polymorphism</td>
     <td>Alright, the class inherited the parent class parameters and functions, but i need to complement or resignificate a parameter or function
      that the parent class has, can i? yes, that is what polymorphism is. </td>
  </tr>
</table>

Togheter abstraction, encapsulation, inheritance and polymorphism forms the <del>four horsemen of apocalypse</del> four fundaments of Object Oriented Programming.

## About Encapsulation
  To achieve encapsulation, we need to control the acess scope of variables and methods, we have some tools to do so:
  <ul>
    <li>Acess level modifiers
      <ul>
        <li>PUBLIC: can be acessed by any method from any class, as the name suggest it is public to everyones acess.</li>
        <li>PROTECTED: can be acessed only by its native class and its childs, but no other classes/objects.</li>
        <li>PRIVATE: can only be acessed by its native class and no one else, not even by its child classes.</li>
      </ul>
    </li>
    <li>Acess methods
      <ul>
        <li>SET: set is a public method that receives a parameter and pass it to a private or protected variable.</li>
        <li>GET: get is a public method that returns the value of a private variable.</li>
        -The path to maintain the protection of data is to be cautelous when to use those methods.
      </ul>
    </li>
  </ul>


## About Inheritance
  In java a child class can only have one parent, but in c++ you can have a child with two parents, it is called multiple inheritance, and comes with some dilemas. The most popular dilema is the diamond problem. 
<br/>e.g.: an Root Class has two child classes, Class A and Class B, both overrides a Root Class method, then you create a Resultant Class, which inherits from both Class A and Class B, but you have two different methods with the same name, how will the program handle that ? this dilema <del>causes problems</del> is handled diferently by each language, that is the reason why java does not support multiple inheritance.

<br/>
<p align="center">
  <img src="https://github.com/marcosRoos/OO-Study/blob/main/diamond-problem.png" title="diamond problem example"/>
</p>
  
  
## About Polymorphism
  Inheriting from a parent class does not mean you are stuck with its handling, you can adapt <del>and overcome</del> a good part of it. There is 
  no problem with rewriting a method with a different handling, parameters and return type, actually it has a name: <ins>OVERRIDING</ins>.
  Okay, so i can resignificate methods on child classes, but what if i want a method to accept different types of parameters ? you can! that is <ins>OVERLOADING</ins>.

<br/><hr/><br/>

## Getting a little more complex
Okay, until here we can create classes, protect their data, inherit their relevant characteristics to other classes and adapt their methods. But, what if i want to receive any of the child classes ? one option is to use the parent class as the variable type, but you will be limited to its methods. So, if you need more specific methods on the childs, but the parent class will not be used, you can use an <ins>ABSTRACT CLASS</ins>.

<br/><br/> e.g. in java: 

```
public abstract class Parent {
  private String name;

  public Parent() {}
  public Parent(String name) {
    this.name = name;
  }
  public void doSomething() {}
}


public class ChildA extends parent {
  public ChildA() {
    super("no one");
  }
  public ChildA(String name) {
    super(name);
  }
  public void doSomething() {
    System.out.println("hello world from " + name + "![A]");
  }
}


public class ChildB extends parent {
  public ChildB() {
    super("someone");
  }
  public ChildB(String name) {
    super(name);
  }
  public void doSomething() {
    System.out.println("hello world from " + name + "![B]");
  }
}

public class app {
  public static void main(String[] args) {
    //Parent parent = new Parent("John"); Abstract classes can't be instantiated!
    Parent childA = new ChildA();
    Parent childB = new ChildB();

    childA.doSomething();
    childB.doSomething();
  }
}

```
it would return:
```
hello world from no one![A]
hello world from someone![B]

```
As you can see, the parent class type does accept the childs instance. <br/>
Java 8 let you insert a child that have more methods than its parent on the parent, but you would not be able to call those methods. <br/>
C++ let you have multiple inheritance, meanwhile java has something called <ins>INTERFACE</ins>, which are like abstract classes, but they have no parameters, only constants and method prototypes (no content on the methods). With interfaces, you can create a child class that extends parent class and implement multiple interfaces.

<br/>
<p align="center">
<img src="https://github.com/marcosRoos/OO-Study/blob/main/interface.png" title="interface example"/>
</p>

## Relationships
Relations one-to-one, one-to-many an many-to-many is used on databases to relate data of different classes trough the id key, for example, you can relate a client of yours with n contacts of his (cellphone, enterprise phone, email, etc..), or an ifood account with multiple adresses for example. If you need to find the contacts of a client trough the clients name, then you put the contact id key in a client class variable.
On local java 8 algorithms you could reference the object of contact directly on client class variable.

<br/>
<p align=center>
  <img src="https://github.com/marcosRoos/OO-Study/blob/main/relation.png" title="Relation example"/>
</p>

<br/> <br/>
Object Oriented Programming inheritance characteristic means i can extend classes, so i can extend any class ? No! In java 8 a lot of classes can't be extended, String is one of them, this is meant to avoid changes that can break them and to help creating a standard. <br/> 

## final
This modifier word makes things unchangeable. <br/>
```
final String standardErrorMessage = "error 404: could not find what you where searching for";
```
This case shows a String that can not be changed later in the code, a constant. <br/> <br/>
final also works with classes: 
```
public final class Dog {
  public Dog() {}
} 
```

## static
When you want to create a class, not to instantiate an object from it but to use it as a collection of methods, you can use this word to make it acessible.
```
public static class Mathemathics {
  public Mathemathics() {}
  public static sum(List<Integer> values) {
    int total = 0;
    for(int i=0; i<values.size()-1; i++) {
      total += values.get(i);
    }
  }
}

public void App {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList();
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    System.out.println( Mathemathics.sum(numbers) );
  }
}

```
Would return:
```
60
```
