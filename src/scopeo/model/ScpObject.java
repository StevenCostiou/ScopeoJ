package scopeo.model;

public class ScpObject {
    public String className;
    public int objectID;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getObjectID() {
        return objectID;
    }

    public void setObjectID(int objectID) {
        this.objectID = objectID;
    }

    public ScpObject(Object target) {
        try {
            this.setClassName(target.getClass().toString());
            this.setObjectID(target.hashCode());
        } catch (NullPointerException e) {
            this.setClassName("null");
        }
    }
}
