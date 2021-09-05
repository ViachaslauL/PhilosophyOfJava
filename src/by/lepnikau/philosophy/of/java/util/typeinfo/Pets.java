package by.lepnikau.philosophy.of.java.util.typeinfo;

import by.lepnikau.philosophy.of.java.util.typeinfo.pets.pet.Pet;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Pets {

    public static ArrayList<Pet> arrayList(int size) {
        return new ArrayList<>(getList(size));
    }

    public static LinkedList<Pet> linkedList(int size) {
        return new LinkedList<>(getList(size));
    }

    public static Pet randomPet() {
        Random random = new Random();
        List<String> classesList = getClassesList();
        return createPetObject(classesList.get(random.nextInt(classesList.size())));
    }

    private static List<Pet> getList(int size) {
        List<Pet> petList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            petList.add(randomPet());
        }

        return petList;
    }

    private static Pet createPetObject(String className) {
        try {
            return (Pet) Class.forName(createClassNamePath() + className).newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static List<String> getClassesList() {
        File dir = new File(getPathToPetsFolder() + "/pets");
        File[] arrFiles = dir.listFiles();
        List<String> classes = new ArrayList<>();

        if (arrFiles != null) {
            for (File arrFile : arrFiles) {
                StringBuilder str = new StringBuilder(arrFile.toString());

                if (str.indexOf(".java") != -1) {
                    str.replace(0, str.lastIndexOf("\\") + 1, "");
                    str.replace(str.lastIndexOf("."), str.length(), "");
                    classes.add(str.toString());
                }
            }
        }

        return classes;
    }

    private static String createClassNamePath() {
        String name = Pets.class.getName();
        return name.substring(0, name.length() - 4) + "pets.";
    }

    public static String getPathToPetsFolder() {
        StringBuilder path = new StringBuilder();
        path.append("src/").append(Pets.class.getName().replace(".", "/"));
        path.replace(path.lastIndexOf("/"), path.length(), "");
        return path.toString();
    }
}
