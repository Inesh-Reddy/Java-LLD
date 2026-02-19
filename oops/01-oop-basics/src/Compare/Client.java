package Compare;

public class Client {

    static void main(String[] args) {
        Movie m1 = new Movie();
        m1.setTitle("Inception");
        m1.setDirector("Nolan");
        m1.setRating("4.0");

        Movie m2 = new Movie();
        m2.setTitle("Interstellar");
        m2.setDirector("Nolan");
        m2.setRating("4.5");


        String m1Rating = m1.display();
        String m2Rating = m2.display();

        if(Double.parseDouble(m2Rating) > Double.parseDouble(m1Rating)){
            System.out.println(m2.getTitle()+": "+m2Rating);
        } else {
            System.out.println(m1.getTitle()+": "+m1Rating);
        }

    }
}
