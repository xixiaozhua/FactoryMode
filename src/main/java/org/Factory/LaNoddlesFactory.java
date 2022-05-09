package org.Factory;

import org.Noddles.*;

public class LaNoddlesFactory extends NoddlesFactory{

    @Override
    public Noddles create(){
        return new LaNoddles();
    }
}
