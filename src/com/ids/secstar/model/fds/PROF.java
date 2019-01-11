package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Wall Profile")
public class PROF extends Namelist {
    @DescribedBy("")
    private int FORMAT_INDEX = 1;
    @DescribedBy("")
    private String ID;
    @DescribedBy("")
    private String INIT_ID;
    @DescribedBy("")
    private double IOR;
    @DescribedBy("")
    private String QUANTITY;
    @DescribedBy("m")
    private double[] XYZ = new double[3];

}
