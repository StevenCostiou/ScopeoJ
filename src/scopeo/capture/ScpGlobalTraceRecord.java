package scopeo.capture;

import scopeo.model.ScpTrace;

import java.util.ArrayList;

public class ScpGlobalTraceRecord {
    private static ScpGlobalTraceRecord INSTANCE;

    private ScpGlobalTraceRecord() {
        }

    public static ScpGlobalTraceRecord getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ScpGlobalTraceRecord();
        }
        return INSTANCE;
    }

    private ScpTrace lastTrace;
    private ArrayList<ScpTrace> traces = new ArrayList<>();
    private int traceIndex = 0;

    public ScpTrace getLastTrace() {
        return lastTrace;
    }

    public void addTrace(ScpTrace newTrace) {
        newTrace.setTraceIndex(this.newTraceIndex());
        traces.add(newTrace);
    }
       private int newTraceIndex(){
        return traceIndex += 1;
    }



}
