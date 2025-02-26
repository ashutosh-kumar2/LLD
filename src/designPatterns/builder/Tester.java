package designPatterns.builder;

public class Tester {
    public static void main(String[] args) {
        User u = new User.Builder(1, "Vivek").phoneNumber("2345656466").age(10).build();
        User u1 = new User.Builder(2, "Bharat").age(-9).build();
    }
}
