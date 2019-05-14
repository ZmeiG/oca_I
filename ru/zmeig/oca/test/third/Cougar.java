package ru.zmeig.oca.test.third;

interface HasTail{
  int getTailLength();
}

abstract class Puma implements HasTail {
  //compilation error protected: attempting to assign weaker access privileges; was public
  public int getTailLength(){
    return 4;
  }
}

public class Cougar extends Puma{
    public static void main(String[] args){
        Puma puma = new Cougar();
        System.out.println(puma.getTailLength());
    }

    public int getTailLength(int length){
      return 2;
    }
}
