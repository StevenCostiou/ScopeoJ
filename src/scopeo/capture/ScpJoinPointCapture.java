package scopeo.capture;

import org.aspectj.lang.JoinPoint;
import scopeo.model.ScpObject;
import scopeo.model.ScpTrace;



public class ScpJoinPointCapture {


    public void captureCallBefore(JoinPoint callPoint) {
        ScpTrace trace = new ScpTrace();
        trace.setTraceIndex(ScpGlobalTraceIndex.getInstance().newTraceIndex());
        trace.setReceiver(new ScpObject(callPoint.getTarget()));
        trace.setSender(new ScpObject(callPoint.getThis()));

        callPoint.getSourceLocation();


    }
}
