package by.lepnikau.philosophy.of.java.chapter17.task07;

import by.lepnikau.philosophy.of.java.util.countries.Countries;

import java.util.*;

class TaskSevenDemo {
    public static void main(String[] args) {
        List<String> aList = new ArrayList<>(Countries.names(0, 5));
        List<String> lList = new LinkedList<>(Countries.names(5, 5));

        printList(aList);
        printList(lList);


        //insertList(aList, 3, lList);

        //printList(aList);

        insertListRevers(aList, lList);

        printList(aList);
    }

    private static void insertListRevers(List<String> destList, List<String> srcList) {
        ListIterator<String> listIter = srcList.listIterator(srcList.size() - 1);

        destList.add(srcList.get(srcList.size() - 1));
        while (listIter.hasPrevious()) {
            destList.add(listIter.previous());
        }
    }

    private static void insertList(List<String> destList, int destIndex, List<String> srcList) {
        int i = destIndex;
        for (String s : srcList) {
            destList.add(i++, s);
        }
    }

    private static void printList(List<String> list) {
        System.out.println("---" + list.getClass().getSimpleName() + "---");

        Iterator<String> arrayListIter = list.iterator();
        while (arrayListIter.hasNext()) {
            System.out.println(arrayListIter.next());
        }
    }
}
