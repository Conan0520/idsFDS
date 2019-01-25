package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Wind and Atmospheric")
public class WindAndAtmospheric extends Namelist {

    @DescribedBy("风的方向——°")
    private double direction; //DIRECTION

    @DescribedBy("自然风X,Y,Z方向的力——Pa/m")
    private double[] forceVector = new double[3]; //FORCE_VECTOR

    @DescribedBy("地平面高度——m")
    private double groundLevel; //GROUND_LEVEL

    @DescribedBy("热稳定性——m")
    private double l = 0; //L

    @DescribedBy("气温垂直递减率——◦C/m")
    private double lapseRate = 0; //LAPSE_RATE

    @DescribedBy("根据时间变化的方向曲线")
    private String rampDirection; //RAMP_DIRECTION

    @DescribedBy("根据时间变化X方向力的大小曲线")
    private String rampFvxT; //RAMP_FVX_T

    @DescribedBy("根据时间变化Y方向力的大小曲线")
    private String rampFvyT; //RAMP_FVY_T

    @DescribedBy("根据时间变化Z方向力的大小曲线")
    private String rampFvzT; //RAMP_FVZ_T

    @DescribedBy("根据时间变化的水平速度曲线")
    private String rampSpeed; //RAMP_SPEED

    @DescribedBy("根据高度变化环境温度比曲线")
    private String rampTmp0Z; //RAMP_TMP0_Z

    @DescribedBy("根据时间变化X方向风速曲线")
    private String rampU0T; //RAMP_U0_T

    @DescribedBy("根据时间变化Y方向风速曲线")
    private String rampV0T; //RAMP_V0_T

    @DescribedBy("根据时间变化Z方向风速曲线")
    private String rampW0T; //RAMP_W0_T

    @DescribedBy("根据高度变化X方向风速曲线")
    private String rampU0Z; //RAMP_U0_Z

    @DescribedBy("根据高度变化Y方向风速曲线")
    private String rampV0Z; //RAMP_V0_Z

    @DescribedBy("根据高度变化Z方向风速曲线")
    private String rampW0Z; //RAMP_W0_Z

    @DescribedBy("")
    private int SPONGE_CELLS = 3;

    @DescribedBy("风初始化时的速度——m/s")
    private double speed = 0; //SPEED

    @DescribedBy("")
    private boolean STRATIFICATION = true;

    @DescribedBy("可能结垢的温度——K")
    private double thetaStar; //THETA_STAR

    @DescribedBy("X方向速度——m/s")
    private double u0 = 0; //U0

    @DescribedBy("Y方向速度——m/s")
    private double v0 = 0; //V0

    @DescribedBy("Z方向速度——m/s")
    private double w0 = 0; //W0

    @DescribedBy("摩擦速度——m/s")
    private double uStar; //U_STAR

    @DescribedBy("地型高度——m")
    private double z0 = 0.03; //Z_0

    @DescribedBy("参考高度——m")
    private double zRef = 2; //Z_REF

}
