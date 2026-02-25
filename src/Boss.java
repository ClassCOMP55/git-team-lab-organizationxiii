public abstract class Boss extends Character {

    protected int thirdOfHealth;
    protected int halfOfHealth;

    public Boss(int hp, int atk, int spd, String nm) {
        super(hp, atk, spd, nm);

        thirdOfHealth = maxHP / 3;
        halfOfHealth = maxHP / 2;
    }

    @Override
    public void revive() {
        super.revive();
    }
    public abstract void takeTurn(Character player);

    public void startTurn() {
    }
}
