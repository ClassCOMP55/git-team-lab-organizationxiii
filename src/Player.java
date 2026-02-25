public abstract class Player extends Character {

    public Player(int hp, int atk, int spd, String nm) {
        super(hp, atk, spd, nm);
    }

    @Override
    public void revive() {
        super.revive();
    }
gtt
    public abstract boolean useAbility(int abilityID, Character target);
}
