package by.lepnikau.philosophy.of.java.chapter17.example.prediction;

import java.lang.reflect.*;
import java.util.*;

import static by.lepnikau.philosophy.of.java.util.PrintLN.*;

class SpringDetector {
    // Uses a Groundhog or class derived from Groundhog:
    public static <T extends Groundhog> void detectSpring(Class<T> type) throws Exception {
        Constructor<T> gHog = type.getConstructor(int.class);
        Map<Groundhog, Prediction> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put(gHog.newInstance(i), new Prediction());
        }
        print("map = ");

        for (Map.Entry<Groundhog, Prediction> e: map.entrySet()) {
            System.out.println(e.getKey() + "=" + e.getValue());
        }

        Groundhog gh = gHog.newInstance(3);
        print("Looking up prediction for " + gh);

        if (map.containsKey(gh)) {
            print(map.get(gh));
        } else {
            print("Key not found: " + gh);
        }
    }

    public static void main(String[] args) throws Exception {
        detectSpring(Groundhog.class);
    }
}
