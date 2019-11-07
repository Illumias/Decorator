abstract public class Decoration extends Component {

    protected Component decoratingComponent;

    protected String decoration;

    public Decoration(Component C) {
        decoratingComponent = C;
    }

    public void Action() {
        decoratingComponent.Action();
    }

    public String GetDescription() {
        return decoratingComponent.GetDescription();
    }

}
