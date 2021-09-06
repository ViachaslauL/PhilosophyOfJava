package by.lepnikau.philosophy.of.java.chapter14.task08;

import java.lang.reflect.Field;

public class ObjectHierarchyBuilder {
    public static void buildHierarchy(Object obj) throws IllegalAccessException, InstantiationException {
        Class<?> aClass = obj.getClass();
        System.out.println("Class: " + aClass.getSimpleName());
        for (Field field : aClass.getDeclaredFields()) {
            System.out.println("    Field: " + field.getName());
        }

        Class<?> superclass = aClass.getSuperclass();

        if (superclass != null) {
            Object object = superclass.newInstance();
            buildHierarchy(object);
        }
    }
}
