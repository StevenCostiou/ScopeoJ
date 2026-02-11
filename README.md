# ScopeoJ
A [Scopeo](https://github.com/scopeo-project/scopeo-execution-recorder) trace generation prototype for Java.

## Usage

```Java
    @Before("call(* test..*(..))")
    public void captureCallBefore(JoinPoint joinPoint) {
        ScpTrace trace = ScpJoinPointCapture.captureCallBefore(joinPoint);
        System.out.println(trace.getMethod().getSignature());
    }
```

```Java
    @AfterReturning(value = "execution(* test..*(..))", returning = "returnValue")
    public void captureCallAfter(Object returnValue) {
        ScpJoinPointCapture.captureReturnValue(returnValue);
    }
```