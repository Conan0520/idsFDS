package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

import java.util.List;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Device Properties")
public class DeviceProperties extends Namelist {
    @DescribedBy("阈值——%/m")
    private double ACTIVATION_OBSCURATION = 3.24;

    @DescribedBy("激活温度——◦C")
    private double activationTemperature = 74; //ACTIVATION_TEMPERATURE

    @DescribedBy("")
    private double ALPHA_C = 1.8;

    @DescribedBy("")
    private double ALPHA_E = 0;

    @DescribedBy("")
    private double BETA_C = 1;

    @DescribedBy("")
    private double BETA_E = 1;

    @DescribedBy("热电偶(珠子)直径——mm")
    private double beadDiameter; //BEAD_DIAMETER

    @DescribedBy("热电偶(珠子)发射率")
    private double beadEmissivity; //BEAD_EMISSIVITY

    @DescribedBy("热电偶(珠子)密度——kg/m2")
    private double beadDensity; //BEAD_DENSITY

    @DescribedBy("热电偶(珠子)比热——kJ/(kg·K)")
    private double beadSpecificHeat; //BEAD_SPECIFIC_HEAT

    @DescribedBy("特征速度——m/s")
    private double CHARACTERISTIC_VELOCITY = 1;

    @DescribedBy("C因子——(m/s)1/2")
    private double cFactor = 0; //C_FACTOR

    @DescribedBy("密度——kg/m3")
    private double DENSITY = 8908;

    @DescribedBy("直径——m")
    private double DIAMETER = 0.001;

    @DescribedBy("发射率")
    private double EMISSIVITY = 0.85;

    @DescribedBy("流动速率变化曲线")
    private String flowRamp; //FLOW_RAMP

    @DescribedBy("流动速率——L/min")
    private double flowRate; //FLOW_RATE

    @DescribedBy("流动速率上升时间——s")
    private double flowTau = 0; //FLOW_TAU

    @DescribedBy("仪表发射率")
    private double GAUGE_EMISSIVITY = 0.9;

    @DescribedBy("仪表温度——◦C")
    private double GAUGE_TEMPERATURE; //TMPA

    @DescribedBy("传热系数——W/(m2 ·K)")
    private double HEAT_TRANSFER_COEFFICIENT;

    @DescribedBy("id")
    private String ID;

    @DescribedBy("初始温度——◦C")
    private double initialTemperature; //INITIAL_TEMPERATURE

    @DescribedBy("K因子——L/(min·bar 12 )")
    private double kFactor = 1; //K_FACTOR

    @DescribedBy("长度——m")
    private double LENGTH = 1.8;

    @DescribedBy("质量流率kg/s")
    private double MASS_FLOW_RATE;

    @DescribedBy("补偿——m")
    private double offset = 0.05; //OFFSET

    @DescribedBy("操作压力——bar")
    private double operatingPressure = 1; //OPERATING_PRESSURE

    @DescribedBy("孔的直径——m")
    private double orificeDiameter = 0; //ORIFICE_DIAMETER

    @DescribedBy("m/s")
    private double P = 0;

    @DescribedBy("m/s")
    private double[] PX = new double[3];

    @DescribedBy("m/s")
    private double[] PXX = new double[9];

    @DescribedBy("每秒粒子数")
    private int particlesPerSecond = 5000; //PARTICLES_PER_SECOND

    @DescribedBy("粒子速度——m/s")
    private double particleVelocity = 0; //PARTICLE_VELOCITY

    @DescribedBy("")
    private String PART_ID;

    @DescribedBy("s")
    private double PDPA_END;//T_END

    @DescribedBy("")
    private boolean PDPA_HISTOGRAM = false;

    @DescribedBy("")
    private boolean PDPA_HISTOGRAM_CUMULATIVE = false;

    @DescribedBy("")
    private List<Double> PDPA_HISTOGRAM_LIMITS;

    @DescribedBy("")
    private int PDPA_HISTOGRAM_NBINS = 10;

    @DescribedBy("")
    private boolean PDPA_INTEGRATE = true;

    @DescribedBy("")
    private int PDPA_M = 0;

    @DescribedBy("")
    private int PDPA_N = 0;

    @DescribedBy("")
    private boolean PDPA_NORMALIZE = true;

    @DescribedBy("m")
    private double PDPA_RADIUS = 0;

    @DescribedBy("s")
    private double PDPA_START = 0;

    @DescribedBy("压力变化曲线")
    private String pressureRamp; //PRESSURE_RAMP

    @DescribedBy("√")
    private String QUANTITY;

    @DescribedBy("响应时间指数——m·s")
    private double rti = 100; //RTI

    @DescribedBy("smokeview")
    private List<String> SMOKEVIEW_ID;

    @DescribedBy("smokeview参数")
    private List<String> SMOKEVIEW_PARAMETERS;

    @DescribedBy("粒子")
    private String SPEC_ID;

    @DescribedBy("kJ/(kg·K)")
    private double SPECIFIC_HEAT = 0.44;

    @DescribedBy("经纬角度——degrees")
    private double[] sprayAngle = new double[]{60., 75.}; //SPRAY_ANGLE

    @DescribedBy("degrees")
    private double SPRAY_PATTERN_BETA = 5;

    @DescribedBy("degrees")
    private double SPRAY_PATTERN_MU = 0;

    @DescribedBy("")
    private String SPRAY_PATTERN_SHAPE = "GAUSSIAN";

    @DescribedBy("喷雾表格")
    private String sprayPatternTable; //SPRAY_PATTERN_TABLE

    @DescribedBy("")
    private int VELOCITY_COMPONENT;

}
