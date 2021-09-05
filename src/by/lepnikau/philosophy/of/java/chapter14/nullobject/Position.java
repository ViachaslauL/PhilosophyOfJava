package by.lepnikau.philosophy.of.java.chapter14.nullobject;

public class Position {

    private String title;
    private Person person;

    public Position(String jobTitle) {
        title = jobTitle;
        person = Person.NULL;
    }

    public Position(String jobTitle, Person employee) {
        title = jobTitle;
        person = employee;
        if (person == null) {
            person = Person.NULL;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person employee) {
        person = employee;
        if (person == null) {
            person = Person.NULL;
        }
    }

    @Override
    public String toString() {
        return "Position: " + title + " " + person;
    }
}
