public class Sword extends Decoration {

    public Sword(Component C) {
        super(C);
    }

    public void Action() {
        super.Action();
    }

    public String GetDescription() {
        return super.GetDescription() + "\n Has a sword";
    }

}
