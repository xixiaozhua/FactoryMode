package org.Factory;

import org.Noddles.DaoXiaoNoddles;
import org.Noddles.Noddles;
import org.Noddles.YouPoNoddles;

public class DaoXiaoNoddlesFactory extends NoddlesFactory{

    @Override
    public Noddles create(){
        return new DaoXiaoNoddles();
    }
}
