package version.java8;

public class ImplementationClass {
    public static void main(String[] args) {
        Java8Interface java8Interface = (firstName, lastName)-> {
            System.out.println(firstName + " " + lastName);
        };

        java8Interface.display("Rajat", "Tiwari");
    }

}
