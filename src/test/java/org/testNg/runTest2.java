package org.testNg;


import org.Drunk.Water;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

@Listeners(Listener.class)
public class runTest2 {
    @BeforeTest
    public void beforeTest(){
        System.out.println("这是runtest2的用例");
    }

    @Test(priority = 2,groups = "第一批",timeOut = 1)
    public void test_1() throws InterruptedException {
        Thread.sleep(100);
        int a = Water.jisuanqi(1,0);
        System.out.println(a);
    }
    SoftAssert sa = new SoftAssert();
    @Test(priority = 1,groups = "第一批",invocationCount = 2)
    public void test_2(){
        int a = Water.jisuanqi(1,1);
        System.out.println(a);
        sa.assertTrue(false);
        System.out.println("错啦");
    }
    @Test(priority = 1,groups = "第二批")
    public void test_3(){
        int a = Water.jisuanqi(1,2);
        System.out.println(a);
    }

    @Test(priority = 2,groups = "第二批")
    public void test_4(){
        int a = Water.jisuanqi(1,3);
        System.out.println(a);
    }



}
