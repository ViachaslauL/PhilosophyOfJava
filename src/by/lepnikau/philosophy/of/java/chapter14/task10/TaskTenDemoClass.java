package by.lepnikau.philosophy.of.java.chapter14.task10;

public class TaskTenDemoClass {

    private static char[] chars = {'a', 'b', 'c'};

    public static void main(String[] args) {

        System.out.println(isPrimitivesArr(chars));

    }

    private static boolean isPrimitivesArr(Object objects) {
        String[] primitives = {"bite", "short", "char", "int", "long", "float",
                "double", "boolean" };

        Class<?> aClass = objects.getClass();
        String typeName = aClass.getTypeName().replaceAll("[\\[\\]]", "");

        for (String primitive : primitives) {
            if (typeName.equals(primitive)) {
                return true;
            }
        }
        return false;
    }
}
