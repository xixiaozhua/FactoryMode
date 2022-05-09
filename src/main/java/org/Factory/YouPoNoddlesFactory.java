package org.Factory;

import org.Noddles.*;

public class YouPoNoddlesFactory extends NoddlesFactory{

    @Override
    public Noddles create(){
        return new YouPoNoddles();
    }
}
