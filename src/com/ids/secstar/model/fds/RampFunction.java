package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Ramp Function")
public class RampFunction extends Namelist {

    @DescribedBy("")
    private String CTRL_ID;

    @DescribedBy("")
    private String DEVC_ID;

    @DescribedBy("值")
    private double f; //F

    @DescribedBy("曲线名称")
    private String id; //ID

    @DescribedBy("")
    private int NUMBER_INTERPOLATION_POINTS = 5000;

    @DescribedBy("时间或温度——s (or ◦C)")
    private double t; //T

    @DescribedBy("m")
    private double X;

}
