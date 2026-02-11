# ScopeoJ
A [Scopeo](https://github.com/scopeo-project/scopeo-execution-recorder) trace generation prototype for Java.

## Configuration
You'll need to:
- configure AspectJ in your build environment,
- clone this repository and configure it as a dependency.

For now you're alone with that...

## Usage
The Scopeo instrumentation model is designed to capture method calls and method execution return information using Aspects and their JoinPoints.

For example, to capture all method calls information into a Scopeo trace, we must first specify the package from which we're going to capture the data (here, a `test` example package) in a `Before` pointcut. In the pointcut code, we instantiate an ScpTrace as follows: 
```Java
    @Before("call(* test..*(..))")
    public void captureCallBefore(JoinPoint joinPoint) {
        ScpTrace trace = ScpJoinPointCapture.captureCallBefore(joinPoint);
    }
```

To capture return values from method execution, we use an `AfterReturning` pointcut that capture those return values into an `Object` type instance.
In Scopeo, that return value is set to the last generated trace from a call.
```Java
    @AfterReturning(value = "execution(* test..*(..))", returning = "returnValue")
    public void captureCallAfter(Object returnValue) {
        ScpJoinPointCapture.captureReturnValue(returnValue);
    }
```