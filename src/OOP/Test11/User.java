package OOP.Test11;

/**
 * Created by Ps1X on 19.01.2017.
 */
public class User implements DBObject {
    long id;
    String name;

    @Override
    public User initializeIdAndName(long id, String name) {
        this.id = id;
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return String.format("User has name %s, id = %d", name, id);
    }
}
