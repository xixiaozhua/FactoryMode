package org.testNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result){}

    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println("执行成功啦"+result.getName());
    }
    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("执行失败啦"+result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result){
        System.out.println("执行跳过啦"+result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result){
        System.out.println("执行xxx啦"+result.getName());
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result){
        System.out.println("执行超时啦"+result.getName());
    }

    @Override
    public void onStart(ITestContext context){
        System.out.println("执行开始啦" + context);
    }
    @Override
    public void onFinish(ITestContext context){
        System.out.println("执行结束啦" + context);
    }


}
