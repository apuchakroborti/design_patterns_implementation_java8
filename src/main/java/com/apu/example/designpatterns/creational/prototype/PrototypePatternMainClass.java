package com.apu.example.designpatterns.creational.prototype;

/*
 The prototype pattern is a design pattern that is used to create new objects by copying existing objects.
 It allows you to create new objects by copying an instance of an object that you already have,
 rather than creating the object from scratch or using a factory method.

The main advantage of using the prototype pattern is that it can be more efficient than creating a new object from scratch,
 especially if the object you are creating is complex or time-consuming to create.
 It can also make it easier to create new objects that are similar to existing objects,
 because you can simply copy the existing object and make any necessary modifications rather than starting from scratch.

Here is an example of how the prototype pattern might be implemented in Java:
class Prototype implements Cloneable {
  @Override
  public Prototype clone() {
    try {
      return (Prototype) super.clone();
    } catch (CloneNotSupportedException e) {
      return null;
    }
  }
}

class ConcretePrototype extends Prototype {
  private String field;

  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }
}
-->To use this prototype to create a new object, you would do something like this:

ConcretePrototype prototype = new ConcretePrototype();
prototype.setField("value");

ConcretePrototype copy = prototype.clone();

-->This creates a new ConcretePrototype object that is a copy of the prototype object.
You can then modify the copy as needed to create a new, unique object.
 Reference: chatGPT
 */
public class PrototypePatternMainClass {

    public void testPrototypePattern(){
        ProfessionCache.loadProfessionCache();

        Profession docProfession = ProfessionCache.getCloneNewProfession(1);
        System.out.println(docProfession);

        Profession engProfession = ProfessionCache.getCloneNewProfession(2);
        System.out.println(engProfession);

        Profession teacherProfession = ProfessionCache.getCloneNewProfession(3);
        System.out.println(teacherProfession);

        Profession docProfession2 = ProfessionCache.getCloneNewProfession(1);
        System.out.println(docProfession2);
    }
    public static void main(String[] args) {
        new PrototypePatternMainClass().testPrototypePattern();
    }
}
