public class Main {

    public static void main(String[] args) {
        Component c = new Sword(new Shield(new Player()));
        System.out.println(c.GetDescription());
        System.out.println(""); 
        c = new Sword(new Sword(new Sword(new Enemy())));
        System.out.println(c.GetDescription());
    }
}
