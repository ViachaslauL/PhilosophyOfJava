package by.lepnikau.philosophy.of.java.chapter17.task08;

public class TaskEightDemo {
    public static void main(String[] args) {
        SList<String> sList = new SList<>();
        SList<String>.SListIterator sListIter = sList.sListIterator();
        sListIter.add("1");
        sListIter.add("2");
        sListIter.add("3");
        sListIter.add("4");

        /*while (sListIter.hasNext()) {
            System.out.println(sListIter.next());
        }*/

        System.out.println(sList.toString());
    }
}
