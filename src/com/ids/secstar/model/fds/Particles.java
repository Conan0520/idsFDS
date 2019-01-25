package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Lagrangian Particles/Droplets")
public class Particles extends Namelist {

    @DescribedBy("粒子在模拟中保留的时间——s")
    private double age = 10 ^ 5; //AGE

    @DescribedBy("分解")
    private boolean BREAKUP = false;

    @DescribedBy("分解曲线")
    private String BREAKUP_CNF_RAMP_ID;

    @DescribedBy("解体分配")
    private String BREAKUP_DISTRIBUTION = "ROSIN...";

    @DescribedBy("分解伽马值")
    private double BREAKUP_GAMMA_D = 2.4;

    @DescribedBy("分解率")
    private double BREAKUP_RATIO = 3 / 7;

    @DescribedBy("分解西格玛值")
    private double BREAKUP_SIGMA_D;

    @DescribedBy("检查分配")
    private boolean CHECK_DISTRIBUTION = false;

    @DescribedBy("配置文件曲线图")
    private String CNF_RAMP_ID;

    @DescribedBy("颜色")
    private String color = "BLACK"; //COLOR

    @DescribedBy("复折射率")
    private double COMPLEX_REFRACTIVE_INDEX = 0.01;

    @DescribedBy("控制功能")
    private String CTRL_ID;

    @DescribedBy("固体粒子体积分数")
    private double denseVolumeFraction = 10 ^ (-5); //DENSE_VOLUME_FRACTION

    @DescribedBy("设备控制逻辑")
    private String devcId; //DEVC_ID

    @DescribedBy("体积中值直径——µm")
    private double diameter; //DIAMETER

    @DescribedBy("分布方式")
    private String distribution = "ROSIN..."; //DISTRIBUTION

    @DescribedBy("阻力系数")
    private double dragCoefficient; //DRAG_COEFFICIENT

    @DescribedBy("阻力规律(按形状)")
    private String dragLaw = "SPHERE"; //DRAG_LAW

    @DescribedBy("自由面积")
    private double FREE_AREA_FRACTION;

    @DescribedBy("伽马分布")
    private double gammaD = 2.4; //GAMMA_D

    @DescribedBy("燃烧产生的热量——kJ/kg")
    private double HEAT_OF_COMBUSTION;

    @DescribedBy("水平速度——m/s")
    private double HORIZONTAL_VELOCITY = 0.2;

    @DescribedBy("ID")
    private String ID;

    @DescribedBy("初始温度——◦C")
    private double INITIAL_TEMPERATURE; //	TMPA

    @DescribedBy("无质量")
    private boolean MASSLESS = false;

    @DescribedBy("最大直径——µm")
    private double maximumDiameter = Double.MAX_VALUE; //MAXIMUM_DIAMETER

    @DescribedBy("最小直径——µm")
    private double minimumDiameter = 20; //MINIMUM_DIAMETER

    @DescribedBy("尺寸分布默认不变的")
    private boolean monodisperse = false; //MONODISPERSE

    @DescribedBy("")
    private int N_STRATA = 6;

    @DescribedBy("方向")
    private double[] ORIENTATION = new double[3];

    @DescribedBy("X周期")
    private boolean PERIODIC_X = false;

    @DescribedBy("Y周期")
    private boolean PERIODIC_Y = false;

    @DescribedBy("Z周期")
    private boolean PERIODIC_Z = false;

    @DescribedBy("渗透性")
    private double[] PERMEABILITY = new double[3];

    @DescribedBy("多孔容积率")
    private double POROUS_VOLUME_FRACTION;

    @DescribedBy("装置特性")
    private String PROP_ID;

    @DescribedBy("通过液滴的属性来给粒子上色")
    private String quantities; //QUANTITIES

    @DescribedBy("大量物种")
    private String QUANTITIES_SPEC_ID;

    @DescribedBy("辐射属性表")
    private double RADIATIVE_PROPERTY_TABLE;

    @DescribedBy("真折射率")
    private double REAL_REFRACTIVE_INDEX = 1.33;

    @DescribedBy("颜色")
    private int[] RGB = new int[3];

    @DescribedBy("运行平均系数")
    private double RUNNING_AVERAGE_FACTOR = 0.5;

    @DescribedBy("采样因子,大于1可以减小粒子输出的大小")
    private int samplingFactor = 1; //SAMPLING_FACTOR

    @DescribedBy("二阶粒子输运")
    private boolean SECOND_ORDER_PARTICLE_TRANSPORT = false;

    @DescribedBy("形态因子")
    private double SHAPE_FACTOR = 0.25;

    @DescribedBy("西格玛分布")
    private double sigmaD; //SIGMA_D

    @DescribedBy("物质类型")
    private String specId; //SPEC_ID

    @DescribedBy("粒子是否可以移动")
    private boolean isStatic = false; //STATIC

    @DescribedBy("表面张力——N/m")
    private double SURFACE_TENSION = 7.28 * (10 ^ (-2));

    @DescribedBy("固体粒子表面特性")
    private String surfId; //SURF_ID

    @DescribedBy("湍流扩散")
    private boolean TURBULENT_DISPERSION = false;

    @DescribedBy("垂直速度——m/s")
    private double VERTICAL_VELOCITY = 0.5;

}
