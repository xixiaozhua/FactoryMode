package org.testNg;


import org.Drunk.Water;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

@Listeners(org.testNg.Listener.class)
public class runTest {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("这是beforeSuite");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("这是beforeClass");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("这是beforeTest");
    }
    @BeforeGroups
    public void beforeGroups(){
        System.out.println("这是beforeGroups");
    }
    @BeforeMethod
    public void beforMethod(){
        System.out.println("这是beforeMethod");
    }
    @Test(priority = 2,groups = "第一批",timeOut = 1)
    public void test_1() throws InterruptedException {
        Thread.sleep(100);
        int a = Water.jisuanqi(1,0);
        sa.assertTrue(false,"这里是错误信息啦啦啦啦");
        Reporter.log(Integer.toString(a));
    }
    SoftAssert sa = new SoftAssert();
    @Test(priority = 1,groups = "第一批",invocationCount = 2)
    public void test_2(){
        int a = Water.jisuanqi(1,1);
        Reporter.log(Integer.toString(a));
        sa.assertTrue(false,"这里是错误信息啦啦啦啦");
        Reporter.log("错啦");
    }
    @Test(priority = 1,groups = "第二批")
    public void test_3(){
        int a = Water.jisuanqi(1,2);
        Reporter.log(Integer.toString(a));
    }

    @Test(priority = 2,groups = "第二批")
    public void test_4(){
        int a = Water.jisuanqi(1,3);
        Reporter.log(Integer.toString(a));
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("这是afterMethod");
    }
    @AfterGroups
    public void afterGroups(){
        System.out.println("这是afterGroups");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("这是afterTest");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("这是afterClass");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("这是afterSuite");
    }



}
