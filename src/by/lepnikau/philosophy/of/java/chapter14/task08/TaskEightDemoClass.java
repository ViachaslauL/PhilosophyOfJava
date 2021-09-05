package by.lepnikau.philosophy.of.java.chapter14.task08;

import by.lepnikau.philosophy.of.java.chapter14.task08.hierarchy.ChildClassOne;

public class TaskEightDemoClass {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        //ClassHierarchyBuilder.hierarchyBuilderClass(ChildClassOne.class);
        ClassHierarchyBuilder.hierarchyBuilderObject(new ChildClassOne());
    }
}
