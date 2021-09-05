package by.lepnikau.philosophy.of.java.chapter14.task08;

public class ClassHierarchyBuilder {


    public static void hierarchyBuilderClass(Class<?> clazz) {
        System.out.println(clazz.getSimpleName());
        Class<?> superclass = clazz.getSuperclass();

        if (superclass != null) {
            hierarchyBuilderClass(superclass);
        }
    }

    public static void hierarchyBuilderObject(Object obj) throws IllegalAccessException, InstantiationException {
        Class<?> aClass = obj.getClass();
        System.out.println(aClass.getSimpleName());
        Class<?> superclass = aClass.getSuperclass();

        if (superclass != null) {
            Object object = superclass.newInstance();
            hierarchyBuilderObject(object);
        }

    }
}
