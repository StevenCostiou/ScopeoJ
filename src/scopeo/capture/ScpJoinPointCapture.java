package scopeo.capture;

import org.aspectj.lang.JoinPoint;
import scopeo.model.ScpMethod;
import scopeo.model.ScpObject;
import scopeo.model.ScpTrace;

public final class ScpJoinPointCapture {

    public static ScpTrace captureCallBefore(JoinPoint callPoint) {
        ScpTrace trace = new ScpTrace();
        trace.setReceiver(new ScpObject(callPoint.getTarget()));
        trace.setSender(new ScpObject(callPoint.getThis()));
        trace.setMethod(new ScpMethod(callPoint));
        ScpGlobalTraceRecord.getInstance().addCallTrace(trace);
        return trace;
    }

    public static void captureReturnValue(Object returnValue) {
        ScpGlobalTraceRecord.getInstance().terminateLastCallTraceWithReturnedValue(new ScpObject(returnValue));
    }
}
