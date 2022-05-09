package org.Factory;

import org.Noddles.*;

public abstract class SimpleNoddlesFactory {
    public static final int type_youpomian=1;
    public static final int type_daoxiaomian=2;
    public static final int type_lamian=3;

    public static Noddles createNoddles(int type){
        switch (type){
            case type_youpomian:
                return new YouPoNoddles();
            case type_daoxiaomian:
                return new DaoXiaoNoddles();
            case type_lamian:
            default:
                return new LaNoddles();
        }
    }

}
