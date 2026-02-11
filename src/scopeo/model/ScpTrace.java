package scopeo.model;

public class ScpTrace {
    public int traceIndex;
    public ScpObject receiver;
    public ScpObject sender;
    public ScpObject result;
    public ScpMethod method;

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
