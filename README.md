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
