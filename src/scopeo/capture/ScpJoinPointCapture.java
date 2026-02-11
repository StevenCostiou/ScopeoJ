package scopeo.capture;

import org.aspectj.lang.JoinPoint;
import scopeo.model.ScpMethod;
import scopeo.model.ScpObject;
import scopeo.model.ScpTrace;



public class ScpJoinPointCapture {

    public ScpTrace captureCallBefore(JoinPoint callPoint) {
        ScpTrace trace = new ScpTrace();
        trace.setReceiver(new ScpObject(callPoint.getTarget()));
        trace.setSender(new ScpObject(callPoint.getThis()));
        trace.setMethod(new ScpMethod(callPoint));
        ScpGlobalTraceRecord.getInstance().addTrace(trace);
        return trace;
    }

    public void captureReturnValue(Object returnValue) {
        ScpGlobalTraceRecord.getInstance().getLastTrace().setResult(new ScpObject(returnValue));
    }
}
