package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

import java.util.List;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Radiation")
public class Radiation extends Namelist {

    @DescribedBy("角度增量")
    private int angleIncrement = 5; //ANGLE_INCREMENT

    @DescribedBy("µm")
    private List<Double> BAND_LIMITS;

    @DescribedBy("")
    private double C_MAX = 100;

    @DescribedBy("")
    private double C_MIN = 1;

    @DescribedBy("")
    private int INITIAL_RADIATION_ITERATIONS = 3;

    @DescribedBy("恒吸收系数——1/m")
    private double kappa0 = 0; //KAPPA0

    @DescribedBy("µm")
    private double MIE_MINIMUM_DIAMETER = 0.5;

    @DescribedBy("µm")
    private double MIE_MAXIMUM_DIAMETER;// 1.5×D ;

    @DescribedBy("")
    private int MIE_NDG = 50;

    @DescribedBy("辐射极角度数")
    private int nmieang = 15; //NMIEANG

    @DescribedBy("辐射立体角度数")
    private int numberRadiationAngles = 100; //NUMBER_RADIATION_ANGLES

    @DescribedBy("路径长度——m")
    private double pathLength; //PATH_LENGTH

    @DescribedBy("kW/m3")
    private double QR_CLIP = 10;

    @DescribedBy("开启辐射传输计算器")
    private boolean radiation = true; //RADIATION

    @DescribedBy("")
    private int RADIATION_ITERATIONS = 1;

    @DescribedBy("假定辐射源温度——◦C")
    private double radtmp = 900; //RADTMP

    @DescribedBy("时间步长增量")
    private int timeStepIncrement = 3; //TIME_STEP_INCREMENT

    @DescribedBy("使用宽带模型(较慢)")
    private boolean wideBandModel = false; //WIDE_BAND_MODEL

}
