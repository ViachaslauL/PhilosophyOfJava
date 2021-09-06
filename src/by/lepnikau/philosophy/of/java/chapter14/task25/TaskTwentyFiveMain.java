package by.lepnikau.philosophy.of.java.chapter14.task25;

import by.lepnikau.philosophy.of.java.chapter14.task25.pack.DifferentAccessLevelsClass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TaskTwentyFiveMain {
    public static void main(String[] args)
            throws InvocationTargetException, IllegalAccessException {
        DifferentAccessLevelsClass dalc = new DifferentAccessLevelsClass();
        getMethodAccess(dalc);
        Class<? extends DifferentAccessLevelsClass> aClass = dalc.getClass();
        ClassLoader classLoader = aClass.getClassLoader();

    }

    private static void getMethodAccess(Object obj)
            throws InvocationTargetException, IllegalAccessException {
        Method[] declaredMethods = obj.getClass().getDeclaredMethods();
        for (Method method: declaredMethods) {
            method.setAccessible(true);
            method.invoke(obj);
        }
    }
}
