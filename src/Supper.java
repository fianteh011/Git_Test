public class Supper extends Sup {

    String type;

    public Supper(int ID, String name, String type) {
        super(ID, name);

    }

    public void setType(String type) {
        if (type == null){
            throw new IllegalArgumentException("Type cannot be empty");
        }

        this.type = type;
    }
}
