package by.lepnikau.philosophy.of.java.chapter09;

public class TaskFour {
    public static void main(String[] args) {

        TaskFourBaseClass taskFourBaseClass = new TaskFourDerivativeClass();
        someStaticMethod(taskFourBaseClass);
    }


    public static void someStaticMethod(TaskFourBaseClass ref) {
        TaskFourDerivativeClass ref1 = (TaskFourDerivativeClass) ref;
        ref1.someMethod();
    }
}

abstract class TaskFourBaseClass {

    abstract void someMethod();

}

class TaskFourDerivativeClass extends TaskFourBaseClass{

    void someMethod() {
        System.out.println("Some method");
    }
}