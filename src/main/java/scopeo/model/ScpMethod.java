package scopeo.model;

import org.aspectj.lang.JoinPoint;

public class ScpMethod {
    private String definingClassName;
    private String signature;
    private String fileName;
    private int line;

    public String getDefiningClassName() {
        return definingClassName;
    }

    public void setDefiningClassName(String definingClassName) {
        this.definingClassName = definingClassName;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public ScpMethod(JoinPoint callPoint) {

        signature = callPoint.getSignature().toString();
        definingClassName = callPoint.getSourceLocation().getWithinType().getCanonicalName();
        fileName = callPoint.getSourceLocation().getFileName();
        line = callPoint.getSourceLocation().getLine();
    }

}
