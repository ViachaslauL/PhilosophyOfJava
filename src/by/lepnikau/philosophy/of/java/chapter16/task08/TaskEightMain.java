package by.lepnikau.philosophy.of.java.chapter16.task08;

public class TaskEightMain {
    private static String[] strings = new String[10];
    private static Object[] objects = new Object[10];

    public static void main(String[] args) {
        Integer i = 10;
        Double d = 11.2;
        String str = "str";

        addObject(i);
        addObject(d);
        addObject(str);

        for (Object obj : objects) {
            if (obj != null) {
                System.out.println(obj.getClass().getSimpleName());
            }
        }

        //addString(i);
        addString(str);

    }

    private static void addString(String str) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[0] == null) {
                strings[0] = str;
                break;
            } else if (strings[i] == null && strings[i - 1] != null) {
                strings[i] = str;
                break;
            }
        }
    }

    private static void addObject(Object object) {
        for (int i = 0; i < objects.length; i++) {
            if (objects[0] == null) {
                objects[0] = object;
                break;
            } else if (objects[i] == null && objects[i - 1] != null) {
                objects[i] = object;
                break;
            }
        }
    }
}
