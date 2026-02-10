package scopeo.capture;

public class ScpGlobalTraceIndex {
    private static ScpGlobalTraceIndex INSTANCE;

    private ScpGlobalTraceIndex() {
        }

    public static ScpGlobalTraceIndex getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ScpGlobalTraceIndex();
        }
        return INSTANCE;
    }

    private int traceIndex = 0;

    public int newTraceIndex(){
        return traceIndex += 1;
    }

}
