package org.Create;

import org.Noddles.*;
import org.Factory.*;

public abstract class Run {

    public static void main(String args[]){
//        //静态
//        Noddles noddles = SimpleNoddlesFactory.createNoddles(SimpleNoddlesFactory.type_daoxiaomian);
//        noddles.desc();
        
        //多方法
        Noddles noddles_1 = MethodNoddlesFactory.createYouPoNoddles();
        noddles_1.desc();
    }
}
