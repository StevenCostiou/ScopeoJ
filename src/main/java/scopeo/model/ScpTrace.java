package scopeo.model;

import java.util.ArrayList;

public class ScpTrace {
    private int traceIndex;
    private ScpObject receiver;

    public int getTraceIndex() {
        return traceIndex;
    }

    public ScpObject getReceiver() {
        return receiver;
    }

    public ScpObject getSender() {
        return sender;
    }

    public ScpObject getResult() {
        return result;
    }

    public ScpMethod getMethod() {
        return method;
    }

    public ArrayList<ScpObject> getArguments() {
        return arguments;
    }

    public void setArguments(ArrayList<ScpObject> args) {
        arguments = args;
    }

    private ScpObject sender;
    private ScpObject result;
    private ScpMethod method;
    private ArrayList<ScpObject> arguments = new ArrayList<>();

    public void setTraceIndex(int traceIndex) {
        this.traceIndex = traceIndex;
    }
    public void setReceiver(ScpObject receiver) {
        this.receiver = receiver;
    }
    public void setSender(ScpObject sender) {
        this.sender = sender;
    }
    public void setResult(ScpObject result) {
        this.result = result;
    }
    public void setMethod(ScpMethod method) {
        this.method = method;
    }


}
