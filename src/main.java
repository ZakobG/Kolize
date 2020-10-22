public class main {
    public static void main(String[] args) {
        Player player = new Player();
        Dunno dunn = new Dunno();
        Wall wall = new Wall();

        try {
            System.out.println(EnTities.colliding("Player"));
            System.out.println(EnTities.colliding("Dunno"));
            System.out.println(EnTities.colliding("Wall"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}