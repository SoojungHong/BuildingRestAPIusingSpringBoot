package hello;

/**
 * Created by a613274 on 04.04.2017.
 * To model the greeting representation, you create a resource representation class.
 * Provide a plain old java object with fields, constructors, and accessors for the id and content data:
 */
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
