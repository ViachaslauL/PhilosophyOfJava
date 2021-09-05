package by.lepnikau.philosophy.of.java.chapter14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class ClassDynamicInfo {

    private static Pattern pattern = Pattern.compile("\\w+\\.|class \\[?\\w+\\.|final |native ");


    public static void getClassInfo(Class<?> clazz) {
        StringBuilder sb = new StringBuilder();
        Constructor<?>[] constructors = clazz.getConstructors();
        Method[] methods = clazz.getMethods();

        for (Constructor<?> constructor : constructors) {
            sb.append(getSimpleName(constructor.toString())).append("\n");
        }

        for (Method method : methods) {
            sb.append(getSimpleName(method.toString())).append("\n");
        }

        System.out.println(sb.toString());
    }

    private static String getSimpleName(String name) {
        return pattern.matcher(name).replaceAll("");
    }

    public static void main(String[] args) {
        ClassDynamicInfo.getClassInfo(SomeClass.class);
    }
}
