package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Wind and Atmospheric")
public class WIND extends Namelist {
    @DescribedBy("m")
    private double L = 0;
    @DescribedBy("◦C/m")
    private double LAPSE_RATE = 0;
    @DescribedBy("")
    private String RAMP_DIRECTION;
    @DescribedBy("")
    private String RAMP_FVX_T;
    @DescribedBy("")
    private String RAMP_FVY_T;
    @DescribedBy("")
    private String RAMP_FVZ_T;
    @DescribedBy("")
    private String RAMP_SPEED;
    @DescribedBy("")
    private String RAMP_TMP0_Z;
    @DescribedBy("")
    private String RAMP_U0_T;
    @DescribedBy("")
    private String RAMP_V0_T;
    @DescribedBy("")
    private String RAMP_W0_T;
    @DescribedBy("")
    private String RAMP_U0_Z;
    @DescribedBy("")
    private String RAMP_V0_Z;
    @DescribedBy("")
    private String RAMP_W0_Z;
    @DescribedBy("")
    private int SPONGE_CELLS = 3;
    @DescribedBy("m/s")
    private double SPEED = 0;
    @DescribedBy("")
    private boolean STRATIFICATION = true;
    @DescribedBy("K")
    private double THETA_STAR;
    @DescribedBy("m/s")
    private double U0 = 0;
    @DescribedBy("m/s")
    private double V0 = 0;
    @DescribedBy("m/s")
    private double W0 = 0;
    @DescribedBy("m/s")
    private double U_STAR;
    @DescribedBy("m")
    private double Z_0 = 0.03;
    @DescribedBy("m")
    private double Z_REF = 2;

}
