package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

import java.util.List;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Radiation")
public class RADI extends Namelist {
    @DescribedBy("")
    private int ANGLE_INCREMENT = 5;
    @DescribedBy("µm")
    private List<Double> BAND_LIMITS;
    @DescribedBy("")
    private double C_MAX = 100;
    @DescribedBy("")
    private double C_MIN = 1;
    @DescribedBy("")
    private int INITIAL_RADIATION_ITERATIONS = 3;
    @DescribedBy("1/m")
    private double KAPPA0 = 0;
    @DescribedBy("µm")
    private double MIE_MINIMUM_DIAMETER = 0.5;
    @DescribedBy("µm")
    private double MIE_MAXIMUM_DIAMETER;// 1.5×D ;
    @DescribedBy("")
    private int MIE_NDG = 50;
    @DescribedBy("")
    private int NMIEANG = 15;
    @DescribedBy("")
    private int NUMBER_RADIATION_ANGLES = 100;
    @DescribedBy("m")
    private double PATH_LENGTH;
    @DescribedBy("kW/m3")
    private double QR_CLIP = 10;
    @DescribedBy("")
    private boolean RADIATION = true;
    @DescribedBy("")
    private int RADIATION_ITERATIONS = 1;
    @DescribedBy("◦C")
    private double RADTMP = 900;
    @DescribedBy("")
    private int TIME_STEP_INCREMENT = 3;
    @DescribedBy("")
    private boolean WIDE_BAND_MODEL = false;

}
