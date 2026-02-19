package ObjectAndEntity;

public class Client {
    static void main(String[] args) {
        Student joe = new Student();
        joe.setId("1");
        joe.setName("Joe");
        joe.setGrade("4.5");

        System.out.println("Student details: Id: " + joe.getId()+" Name: "+joe.getName()+" Grade: "+joe.getGrade());
    }
}
