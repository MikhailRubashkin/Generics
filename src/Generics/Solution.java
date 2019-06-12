package Generics;

//	Дан класс Solution, параметризированный T. Ограничьте параметр T.
//T должен быть наследником класса ClassForGenerics и одновременно реализовывать интерфейс InterfaceForGenerics. Менять можно только класс Solution.

public class Solution <T extends Solution.ClassForGenerics & Solution.ClassForGenerics.ForGenerics> {


   public static  class ClassForGenerics {
        public void doSomething() {
            System.out.println("Doing something.");
        }

        public static interface ForGenerics {

            public void swim();
        }
    }
}
