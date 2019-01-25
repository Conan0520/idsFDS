package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;
import com.ids.secstar.model.fds.type.FluxLimiter;
import com.ids.secstar.model.fds.type.SimulationMode;
import com.ids.secstar.model.fds.type.TurbulenceModel;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Miscellaneous")
public class Miscellaneous extends Namelist {
    private final static Miscellaneous Instance = new Miscellaneous();

    @DescribedBy("环境压力——Pa")
    private double pInf = 101325; // P_INF

    @DescribedBy("环境温度，模拟开始时的所有温度——◦C")
    private double tmpa = 20; //TMPA

    @DescribedBy("模拟模式")
    private SimulationMode simulationMode = SimulationMode.VLES; //SIMULATION_MODE

    @DescribedBy("斜压涡")
    private boolean baroclinic = true; //BAROCLINIC

    @DescribedBy("")
    private boolean CHECK_VN = true;

    @DescribedBy("")
    private boolean CONSTANT_SPECIFIC_HEAT_RATIO = false;

    @DescribedBy("")
    private boolean PROJECTION = false;

    @DescribedBy("")
    private boolean RESTART = false;

    @DescribedBy("")
    private String RESTART_CHID;//CHID

    @DescribedBy("X、Y、Z方向的重力设置——m/s2")
    private double[] gvec = new double[]{0, 0, -9.81}; //GVEC

    @DescribedBy("")
    private TurbulenceModel TURBULENCE_MODEL = TurbulenceModel.DEARDORFF;

    @DescribedBy("")
    private TurbulenceModel NEAR_WALL_TURBULENCE_MODEL;

    @DescribedBy("")
    // 0 - VLES default, corresponds to L¥ norm of velocity vector
    // 1 - DNS default, most restrictive, corresponds to L1 norm of velocity vector
    // 2 - LES default, L2 norm of velocity vector
    // 3 - SVLES default, least restrictive, corresponds to L¥ norm of velocity vector without the velocity divergence
    private int CFL_VELOCITY_NORM;

    @DescribedBy("最大CFL数")
    private double cflMax = 1; //CFL_MAX

    @DescribedBy("最小CFL数")
    private double cflMin = 0.8; //CFL_MIN

    @DescribedBy("冯·诺依曼约束最大值")
    private double vnMax = 1; // VN_MAX

    @DescribedBy("冯·诺依曼约束最小值")
    private double vnMin = 0.8; //VN_MIN

    @DescribedBy("")
    private boolean PARTICLE_CFL = false; // TRUE to activates PARTICLE_CFL_MAX constraint

    @DescribedBy("")
    private double PARTICLE_CFL_MAX = 1; // A value of 1 (default) means that the fastest moving particle can move a distance of one grid cell during the time step.

    @DescribedBy("")
    private boolean CHECK_HT = false; // True to enable the heat transfer stability check

    @DescribedBy("")
    private FluxLimiter FLUX_LIMITER = FluxLimiter.SUPERBEE;

    @DescribedBy("")
    private boolean NOISE = true; // True to enable NOISE_VELOCITY

    @DescribedBy("m/s")
    private double NOISE_VELOCITY = 0.005; // Background Noise

    @DescribedBy("")
    private boolean OVERWRITE = true; // Protecting Old Cases

    @DescribedBy("")
    private boolean FREEZE_VELOCITY = false; // Turning off the Flow Field

    @DescribedBy("")
    private boolean ALLOW_SURFACE_PARTICLES = true;

    @DescribedBy("允许底部液滴")
    private boolean allowUndersideParticles = false; //ALLOW_UNDERSIDE_PARTICLES

    @DescribedBy("◦C")
    private double ASSUMED_GAS_TEMPERATURE;

    @DescribedBy("")
    private String ASSUMED_GAS_TEMPERATURE_RAMP;

    @DescribedBy("")
    private boolean BNDF_DEFAULT = true;

    @DescribedBy("")
    private double C_DEARDORFF = 0.1;

    @DescribedBy("马格林斯基常数")
    private double cSmagorinsky = 0.2; //C_SMAGORINSKY

    @DescribedBy("")
    private double C_VREMAN = 0.07;

    @DescribedBy("")
    private double C_WALE = 0.6;

    @DescribedBy("")
    private double CNF_CUTOFF = 0.005;

    @DescribedBy("")
    private boolean DEPOSITION = true;

    @DescribedBy("")
    private double DRAG_CFL_MAX = 1;

    @DescribedBy("")
    private boolean EVACUATION_DRILL = false;

    @DescribedBy("")
    private boolean EVACUATION_MC_MODE = false;

    @DescribedBy("")
    private int EVAC_PRESSURE_ITERATIONS = 50;

    @DescribedBy("")
    private int EVAC_TIME_ITERATIONS = 50;

    @DescribedBy("")
    private double GAMMA = 1.4;

    @DescribedBy("")
    private boolean GRAVITATIONAL_DEPOSITION = true;

    @DescribedBy("")
    private boolean GRAVITATIONAL_SETTLING = true;

    @DescribedBy("◦C")
    private double H_F_REFERENCE_TEMPERATURE = 25;

    @DescribedBy("s")
    private boolean HVAC_LOCAL_PRESSURE;

    @DescribedBy("")
    private boolean HVAC_MASS_TRANSPORT = false;

    @DescribedBy("")
    private double HVAC_PRES_RELAX = 0.5;

    @DescribedBy("相对湿度——%")
    private double humidity = 40; //HUMIDITY

    @DescribedBy("")
    private boolean IBLANK_SMV = true;

    @DescribedBy("")
    private int MAX_LEAK_PATHS = 200;

    @DescribedBy("最大能见度——m")
    private double maximumVisibility = 30; //MAXIMUM_VISIBILITY

    @DescribedBy("s")
    private double MPI_TIMEOUT = 10;

    @DescribedBy("")
    private boolean NO_EVACUATION = false;

    @DescribedBy("")
    private boolean NO_RAMPS = false;

    @DescribedBy("多孔地板，液滴会在地板上消失")
    private boolean porousFloor = true; //POROUS_FLOOR

    @DescribedBy("普朗特数/Prandtl Number")
    private double pr = 0.5; //PR

    @DescribedBy("")
    private boolean PROCESS_ALL_MESHES = false;

    @DescribedBy("X方向的重力设置曲线")
    private String rampGx; //RAMP_GX

    @DescribedBy("Y方向的重力设置曲线")
    private String rampGy; //RAMP_GY

    @DescribedBy("Z方向的重力设置曲线")
    private String rampGz; //RAMP_GZ

    @DescribedBy("施密特数/Schmidt number")
    private double sc = 0.5; //SC

    @DescribedBy("")
    private boolean SHARED_FILE_SYSTEM = true;

    @DescribedBy("")
    private double SMOKE_ALBEDO = 0.3;

    @DescribedBy("")
    private boolean SOOT_OXIDATION = false;

    @DescribedBy("")
    private boolean SOLID_PHASE_ONLY = false;

    @DescribedBy("s")
    private double TAU_DEFAULT = 1;

    @DescribedBy("纹理起点——m")
    private double[] textureOrigin = new double[]{0.0, 0.0, 0.0}; //TEXTURE_ORIGIN

    @DescribedBy("")
    private boolean THERMOPHORETIC_DEPOSITION = true;

    @DescribedBy("")
    private boolean THERMOPHORETIC_SETTLING = true;

    @DescribedBy("")
    private boolean THICKEN_OBSTRUCTIONS = false;

    @DescribedBy("")
    private boolean TURBULENT_DEPOSITION = true;

    @DescribedBy("")
    private boolean VERBOSE;

    @DescribedBy("能见度系数")
    private double visibilityFactor = 3; //VISIBILITY_FACTOR

    @DescribedBy("环境中二氧化碳的质量分数——kg/kg")
    private double yCo2Infty; //Y_CO2_INFTY

    @DescribedBy("环境中氧的质量分数——kg/kg")
    private double yO2Infty; //Y_O2_INFTY

    @DescribedBy("地平面——m")
    private double groundLevel; //GROUND_LEVEL
    private Miscellaneous() {

    }

    public final static Miscellaneous getInstance() {
        return Instance;
    }

}
