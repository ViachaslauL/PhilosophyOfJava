package by.lepnikau.philosophy.of.java.chapter14.nullobject;

import java.util.ArrayList;

public class Staff extends ArrayList<Position> {

    public void add(String title, Person person) {
        add(new Position(title, person));
    }

    public void add(String... titles) {
        for (String title : titles) {
            add(new Position(title));
        }
    }

    public Staff(String... titles) {
        add(titles);
    }

    public boolean positionAvailable(String title) {
        for (Position pos : this) {
            if (pos.getTitle().equals(title) && pos.getPerson().equals(Person.NULL)) {
                return true;
            }
        }
        return false;
    }

    public void fillPosition(String title, Person hire) {
        for (Position pos : this) {
            if (pos.getTitle().equals(title) && pos.getPerson().equals(Person.NULL)) {
                pos.setPerson(hire);
                return;
            }
        }
        throw new RuntimeException("Position " + title + " not available.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Position pos : this) {
            sb.append("Position: ");
            sb.append(pos.getTitle()).append(" | ");
            sb.append(pos.getPerson()).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Staff staff = new Staff(
                "President", "СТО",
                "Marketing Manager", "Product Manager",
                "Project Lead", "Software Engineer",
                "Software Engineer", "Software Engineer",
                "Software Engineer", "Test Engineer",
                "Technical Writer");

        staff.fillPosition("President",
                new Person("Me", "Last", "The Top, Lonely At"));
        staff.fillPosition("Project Lead",
                new Person("Janet", "Planner", "The Burbs"));

        if (staff.positionAvailable("Software Engineer")) {
            staff.fillPosition("Software Engineer",
                    new Person("Bob", "Coder", "Bright Light City"));
        }
        System.out.println(staff);
    }
}
