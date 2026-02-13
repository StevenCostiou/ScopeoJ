package scopeo.model;

import java.util.ArrayList;

public class ScpTrace {
    private int traceIndex;
    private ScpObject receiver;
    private ScpObject sender;
    private ScpObject result;
    private ScpMethod method;
    private ArrayList<ScpObject> arguments = new ArrayList<>();

    public int getTraceIndex() {
        return traceIndex;
    }

    public void setTraceIndex(int traceIndex) {
        this.traceIndex = traceIndex;
    }

    public ScpObject getReceiver() {
        return receiver;
    }

    public void setReceiver(ScpObject receiver) {
        this.receiver = receiver;
    }

    public ScpObject getSender() {
        return sender;
    }

    public void setSender(ScpObject sender) {
        this.sender = sender;
    }

    public ScpObject getResult() {
        return result;
    }

    public void setResult(ScpObject result) {
        this.result = result;
    }

    public ScpMethod getMethod() {
        return method;
    }

    public void setMethod(ScpMethod method) {
        this.method = method;
    }
}
