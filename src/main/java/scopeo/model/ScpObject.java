package scopeo.model;

public class ScpObject {
    private String className;
    private int objectID;

    public ScpObject(Object target) {
        try {
            className = target.getClass().getCanonicalName();
            objectID = target.hashCode();
        } catch (NullPointerException e) {
            className = "null";
        } catch (java.lang.Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
