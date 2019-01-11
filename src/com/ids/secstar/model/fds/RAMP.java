package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Ramp Function")
public class RAMP extends Namelist {
    @DescribedBy("")
    private String CTRL_ID;
    @DescribedBy("")
    private String DEVC_ID;
    @DescribedBy("")
    private double F;
    @DescribedBy("")
    private String ID;
    @DescribedBy("")
    private int NUMBER_INTERPOLATION_POINTS = 5000;
    @DescribedBy("s (or ◦C)")
    private double T;
    @DescribedBy("m")
    private double X;

}
