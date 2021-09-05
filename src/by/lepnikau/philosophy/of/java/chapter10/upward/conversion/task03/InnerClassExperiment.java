package by.lepnikau.philosophy.of.java.chapter10.upward.conversion.task03;

interface Inner {
    void action();
}

public class InnerClassExperiment {

    public Inner getInnerObject() {

        class InnerClass implements Inner {
            @Override
            public void action() {
                System.out.println("Action in inner class.");
            }
        }
        return new InnerClass();
    }

    public static void main(String[] args) {

        InnerClassExperiment experiment = new InnerClassExperiment();
        experiment.getInnerObject().action();

    }
}
