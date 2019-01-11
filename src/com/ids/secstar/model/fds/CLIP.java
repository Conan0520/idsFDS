package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Clipping")
// range of values for density, temperature and mass fraction.
public class CLIP extends Namelist {
    @DescribedBy("kg/m3")
    private double MAXIMUM_DENSITY;

    @DescribedBy("kg/m3")
    private double MINIMUM_DENSITY;

    @DescribedBy("◦C")
    private double MAXIMUM_TEMPERATURE;

    @DescribedBy("◦C")
    private double MINIMUM_TEMPERATURE;
}
