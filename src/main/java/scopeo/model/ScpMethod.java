package scopeo.model;

import org.aspectj.lang.JoinPoint;

public class ScpMethod {
    private String definingClassName;
    private String signature;

    public String getDefiningClassName() {
        return definingClassName;
    }

    private String fileName;
    private int line;

    public ScpMethod(JoinPoint callPoint) {
        signature = callPoint.getSignature().toString();
        definingClassName = callPoint.getSourceLocation().getWithinType().getCanonicalName();
        fileName = callPoint.getSourceLocation().getFileName();
        line = callPoint.getSourceLocation().getLine();
    }
}
