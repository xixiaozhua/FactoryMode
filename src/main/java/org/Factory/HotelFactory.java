package org.Factory;

import org.Noddles.*;
import org.Drunk.*;

public abstract class HotelFactory {

    public abstract Noddles createNoddles();

    public abstract Drunk createDrunk();

}
