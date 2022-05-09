package org.Drunk;

public abstract class Water extends Drunk{
    @Override
    public void  desc(){
        System.out.println("我要喝水");
    }

    public static int jisuanqi(int a,int b){
        int d = a + b;
        return d;
    }
}
