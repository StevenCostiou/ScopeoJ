package scopeo.capture;

import scopeo.model.ScpObject;
import scopeo.model.ScpTrace;


import java.io.File;
import java.util.ArrayList;
import java.util.Stack;
import tools.jackson.databind.ObjectMapper;

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

    private Stack<ScpTrace> stackTrace = new Stack<>();
    private ArrayList<ScpTrace> traces = new ArrayList<>();
    private int traceIndex = 0;

    public void terminateLastCallTraceWithReturnedValue(ScpObject returnValue) {
        ScpTrace trace = stackTrace.pop();
        trace.setResult(returnValue);
    }

    public void addCallTrace(ScpTrace newTrace) {
        newTrace.setTraceIndex(this.newTraceIndex());
        traces.add(newTrace);
        stackTrace.push(newTrace);
    }

       private int newTraceIndex(){
        return traceIndex += 1;
    }

    public void serializeTraces() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("traces/traces.json"), traces);
    }


}
