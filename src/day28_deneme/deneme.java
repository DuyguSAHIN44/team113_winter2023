package day28_deneme;
import day28_accessModifier_encapsuiation.C01;

public class deneme {

    public static void main(String[] args) {

        C01 obj=new C01();
      //  obj.str="Fava";  Farklı package default access modifier

       // C01.s="Fava";  Farklı package default access modifier

      //  obj.b=10; private access modifier

      //  C01.c=30; private access modifier ULAŞILAMAZ

        obj.d=50;
        C01.a=30;
    }
}