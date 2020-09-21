public class Main {

    public static void main(String[] args) {
        Person e = new Person("Jay");
        System.out.println(e.getName());
        e.setName(e.getName() + " Richardson");
        System.out.println(e.getName());

    }
}
