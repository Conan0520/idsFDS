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
public class MISC extends Namelist {
    private final static MISC Instance = new MISC();
    @DescribedBy("Pa")
    private double P_INF = 101325; // Background pressure (at the ground) in Pa. The default is 101325 Pa.
    @DescribedBy("◦C")
    private double TMPA = 20; // Ambient temperature, the temperature of everything at the start of the simulation. The default is 20 ◦C.
    @DescribedBy("")
    private SimulationMode SIMULATION_MODE = SimulationMode.VLES;
    @DescribedBy("")
    private boolean BAROCLINIC = true;
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
    @DescribedBy("m/s2")
    private double[] GVEC = new double[]{0, 0, -9.81};
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
    @DescribedBy("")
    private double CFL_MAX = 1;
    @DescribedBy("")
    private double CFL_MIN = 0.8;
    @DescribedBy("")
    private double VN_MAX = 1; // Von Neumann Constraint, default 1.0 for all forms of LES, 0.5 for DNS
    @DescribedBy("")
    private double VN_MIN = 0.8; // Von Neumann Constraint, default 0.8 for all forms of LES, 0.4 for DNS
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
    @DescribedBy("")
    private boolean ALLOW_UNDERSIDE_PARTICLES = false;
    @DescribedBy("◦C")
    private double ASSUMED_GAS_TEMPERATURE;
    @DescribedBy("")
    private String ASSUMED_GAS_TEMPERATURE_RAMP;
    @DescribedBy("")
    private boolean BNDF_DEFAULT = true;
    @DescribedBy("")
    private double C_DEARDORFF = 0.1;
    @DescribedBy("")
    private double C_SMAGORINSKY = 0.2;
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
    @DescribedBy("%")
    private double HUMIDITY = 40;
    @DescribedBy("")
    private boolean IBLANK_SMV = true;
    @DescribedBy("")
    private int MAX_LEAK_PATHS = 200;
    @DescribedBy("m")
    private double MAXIMUM_VISIBILITY = 30;
    @DescribedBy("s")
    private double MPI_TIMEOUT = 10;

    @DescribedBy("")
    private boolean NO_EVACUATION = false;
    @DescribedBy("")
    private boolean NO_RAMPS = false;

    @DescribedBy("")
    private boolean POROUS_FLOOR = true;
    @DescribedBy("")
    private double PR = 0.5;
    @DescribedBy("")
    private boolean PROCESS_ALL_MESHES = false;
    @DescribedBy("")
    private String RAMP_GX;
    @DescribedBy("")
    private String RAMP_GY;
    @DescribedBy("")
    private String RAMP_GZ;
    @DescribedBy("")
    private double SC = 0.5;
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
    @DescribedBy("m")
    private double[] TEXTURE_ORIGIN = new double[]{0.0, 0.0, 0.0};
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
    @DescribedBy("")
    private double VISIBILITY_FACTOR = 3;
    @DescribedBy("kg/kg")
    private double Y_CO2_INFTY;
    @DescribedBy("kg/kg")
    private double Y_O2_INFTY;

    private MISC() {

    }

    public final static MISC getInstance() {
        return Instance;
    }

}
