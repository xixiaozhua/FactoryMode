package org.Factory;

import org.Noddles.DaoXiaoNoddles;
import org.Noddles.LaNoddles;
import org.Noddles.Noddles;
import org.Noddles.YouPoNoddles;

public abstract class MethodNoddlesFactory {

    public static Noddles createYouPoNoddles(){
        return new YouPoNoddles();
    }

    public static Noddles createDaoXiaoNoddles(){
        return new DaoXiaoNoddles();
    }

    public static Noddles createLaNoddles(){
        return new LaNoddles();
    }
}
