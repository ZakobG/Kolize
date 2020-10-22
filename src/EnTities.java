public abstract class EnTities {
    public static int polohaX1;
    public static int polohaY1;
    public static int BigX;
    public static int BigY;

    public static boolean colliding(String typ) throws Exception {
        switch (typ) {
            case "Wall":
                if (Dunno.polohaY1 < Wall.polohaY1 || Player.polohaY1 < Wall.polohaY1) {
                    return true;
                } else {
                    return false;
                }
            case "Dunno":
                if (Dunno.polohaX1 < Player.polohaX1 + Player.BigX &&
                        Dunno.polohaX1 + Dunno.BigX > Player.polohaX1 &&
                        Dunno.polohaY1 < Player.polohaY1 + Player.BigY &&
                        Dunno.polohaY1 + Dunno.BigY > Player.polohaY1) {
                    return true;
                } else {
                    return false;
                }
            case "Player":
                if (Player.polohaX1 < Dunno.polohaX1 + Dunno.BigX &&
                        Player.polohaX1 + Player.BigX > Dunno.polohaX1 &&
                        Player.polohaY1 < Dunno.polohaY1 + Dunno.BigY &&
                        Player.polohaY1 + Player.BigY > Dunno.polohaY1) {
                    return true;
                } else {
                    return false;
                }
            default:
                throw new Exception("no parameter given");
        }
    }

    public static enum type {
        Player, Obstacle
    }
}