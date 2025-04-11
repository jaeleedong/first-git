public class FighterT {
    public static void main(String[] args) {

    }
}

class Fighter extends Unit implements Fightable{
    public void move(int x, int y) {}
    public void attack(Unit u) {}
}

class Unit {
    int currentHP;
    int x;
    int y;
}

interface Fightable extends Movable, Attackable{}
interface Attackable { void attack(Unit u);}
interface Movable { void move(int x, int y);}
