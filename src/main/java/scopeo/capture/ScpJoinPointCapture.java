package scopeo.capture;

import org.aspectj.lang.JoinPoint;
import scopeo.model.ScpMethod;
import scopeo.model.ScpObject;
import scopeo.model.ScpTrace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public final class ScpJoinPointCapture {

    public static void captureCallBefore(JoinPoint callPoint) {
        ScpTrace trace = new ScpTrace();
        trace.setReceiver(new ScpObject(callPoint.getTarget()));
        trace.setSender(new ScpObject(callPoint.getThis()));
        trace.setMethod(new ScpMethod(callPoint));

        ArrayList<ScpObject> args = new ArrayList<>();
        for (Object o: callPoint.getArgs()) {
            args.add(new ScpObject(o));
        }
        trace.setArguments(args);

        ScpGlobalTraceRecord.getInstance().addCallTrace(trace);
    }

    public static void captureReturnValue(Object returnValue) {
        ScpGlobalTraceRecord.getInstance().terminateLastCallTraceWithReturnedValue(new ScpObject(returnValue));
    }
}
