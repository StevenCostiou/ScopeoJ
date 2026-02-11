package scopeo.capture;

import scopeo.model.ScpObject;
import scopeo.model.ScpTrace;

import java.util.ArrayList;
import java.util.Stack;

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
    private Stack<ScpTrace> stackTrace = new Stack<>();
    private ArrayList<ScpTrace> traces = new ArrayList<>();
    private int traceIndex = 0;

    public ScpTrace getLastTrace() {
        return lastTrace;
    }

    public void terminateLastCallTraceWithReturnedValue(ScpObject returnValue) {
        stackTrace.pop().setResult(returnValue);
    }

    public void addCallTrace(ScpTrace newTrace) {
        newTrace.setTraceIndex(this.newTraceIndex());
        traces.add(newTrace);
        stackTrace.push(newTrace);
    }
       private int newTraceIndex(){
        return traceIndex += 1;
    }



}
