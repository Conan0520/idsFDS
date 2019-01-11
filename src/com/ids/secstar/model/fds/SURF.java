package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

import java.util.List;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Surface")
public class SURF extends Namelist {
    @DescribedBy("")
    private boolean ADIABATIC;
    @DescribedBy("◦C")
    private double AUTO_IGNITION_TEMPERATURE = -273;
    @DescribedBy("")
    private String BACKING = "EXPOSED";
    @DescribedBy("")
    private boolean BURN_AWAY;
    @DescribedBy("")
    private double CELL_SIZE_FACTOR = 1;
    @DescribedBy("")
    private double C_FORCED_CONSTANT = 0;
    @DescribedBy("")
    private double C_FORCED_PR_EXP = 0;
    @DescribedBy("")
    private double C_FORCED_RE = 0;
    @DescribedBy("")
    private double C_FORCED_RE_EXP = 0;
    @DescribedBy("")
    private double C_HORIZONTAL = 1.52;
    @DescribedBy("")
    private double C_VERTICAL = 1.31;
    @DescribedBy("")
    private String COLOR;
    @DescribedBy("m")
    private double CONVECTION_LENGTH_SCALE = 1;
    @DescribedBy("kW/m2")
    private double CONVECTIVE_HEAT_FLUX;
    @DescribedBy("")
    private boolean CONVERT_VOLUME_TO_MASS;
    @DescribedBy("")
    private boolean DEFAULT;
    @DescribedBy("s")
    private double DT_INSERT = 0.01;
    @DescribedBy("")
    private double EMISSIVITY = 0.9;
    @DescribedBy("")
    private double EMISSIVITY_BACK;
    @DescribedBy("")
    private boolean EVAC_DEFAULT;
    @DescribedBy("m2/(kg·s)")
    private double E_COEFFICIENT;
    @DescribedBy("kW/m2")
    private double EXTERNAL_FLUX;
    @DescribedBy("◦C")
    private double EXTINCTION_TEMPERATURE = -273;
    @DescribedBy("")
    private boolean FREE_SLIP;
    @DescribedBy("")
    private String GEOMETRY = "CARTESIAN";
    @DescribedBy("kJ/kg")
    private double HEAT_OF_VAPORIZATION;
    @DescribedBy("W/(m2 ·K)")
    private double HEAT_TRANSFER_COEFFICIENT;
    @DescribedBy("W/(m2 ·K)")
    private double HEAT_TRANSFER_COEFFICIENT_BACK;
    @DescribedBy("")
    private String HEAT_TRANSFER_MODEL;
    @DescribedBy("kW/m2")
    private double HRRPUA;
    @DescribedBy("")
    private boolean HT3D;
    @DescribedBy("")
    private String ID;
    @DescribedBy("◦C")
    private double IGNITION_TEMPERATURE = 5000;
    @DescribedBy("m")
    private double INNER_RADIUS;
    @DescribedBy("kW/m3")
    private List<Double> INTERNAL_HEAT_SOURCE;
    @DescribedBy("")
    private double LAYER_DIVIDE; // N_LAYERS/2
    @DescribedBy("")
    private int[] LEAK_PATH = new int[2];
    @DescribedBy("m")
    private double LENGTH;
    @DescribedBy("kg/(m2 ·s)")
    private List<Double> MASS_FLUX;
    @DescribedBy("kg/(m2 ·s)")
    private double MASS_FLUX_TOTAL;
    @DescribedBy("")
    private double MASS_FLUX_VAR;
    @DescribedBy("")
    private List<Double> MASS_FRACTION;
    @DescribedBy("m/s")
    private double MASS_TRANSFER_COEFFICIENT;
    @DescribedBy("")
    private List<String> MATL_ID; //NL,NC)
    @DescribedBy("")
    private List<Double> MATL_MASS_FRACTION; //(NL,NC)
    @DescribedBy("m")
    private double MINIMUM_LAYER_THICKNESS = 1.00E-06;
    @DescribedBy("kg/(m2 ·s)")
    private double MLRPUA;
    @DescribedBy("")
    private List<Integer> N_LAYER_CELLS_MAX; // 1000
    @DescribedBy("kW/m2")
    private double NET_HEAT_FLUX;
    @DescribedBy("")
    private boolean NO_SLIP;
    @DescribedBy("")
    private int NPPC = 1;
    @DescribedBy("kg/(m2 ·s)")
    private double PARTICLE_MASS_FLUX;
    @DescribedBy("kg/m2")
    private double PARTICLE_SURFACE_DENSITY;
    @DescribedBy("")
    private String PART_ID;
    @DescribedBy("")
    private double PLE = 0.3;
    @DescribedBy("")
    private String PROFILE;
    @DescribedBy("m")
    private double RADIUS;
    @DescribedBy("")
    private String RAMP_EF;
    @DescribedBy("")
    private String RAMP_MF;
    @DescribedBy("")
    private String RAMP_PART;
    @DescribedBy("")
    private String RAMP_Q;
    @DescribedBy("")
    private String RAMP_T;
    @DescribedBy("")
    private String RAMP_T_I;
    @DescribedBy("")
    private String RAMP_V;
    @DescribedBy("")
    private String RAMP_V_X;
    @DescribedBy("")
    private String RAMP_V_Y;
    @DescribedBy("")
    private String RAMP_V_Z;
    @DescribedBy("")
    private int[] RGB = new int[]{255, 204, 102};
    @DescribedBy("m")
    private double ROUGHNESS = 0;
    @DescribedBy("")
    private String SPEC_ID;
    @DescribedBy("m/s")
    private double SPREAD_RATE;
    @DescribedBy("")
    private double STRETCH_FACTOR = 2;
    @DescribedBy("s ")
    private double TAU_EF = 1;
    @DescribedBy("s ")
    private double TAU_MF = 1;
    @DescribedBy("s ")
    private double TAU_PART = 1;
    @DescribedBy("s ")
    private double TAU_Q = 1;
    @DescribedBy("s ")
    private double TAU_T = 1;
    @DescribedBy("s ")
    private double TAU_V = 1;
    @DescribedBy("m")
    private double TEXTURE_HEIGHT = 1;
    @DescribedBy("")
    private String TEXTURE_MAP;
    @DescribedBy("m")
    private double TEXTURE_WIDTH = 1;
    @DescribedBy("")
    private boolean TGA_ANALYSIS;
    @DescribedBy("◦C")
    private double TGA_FINAL_TEMPERATURE = 800;
    @DescribedBy("◦C/min")
    private double TGA_HEATING_RATE = 5;
    @DescribedBy("m")
    private List<Double> THICKNESS; //(NL)
    @DescribedBy("◦C")
    private double TMP_BACK = 20;
    @DescribedBy("◦C")
    private double TMP_FRONT = 20;
    @DescribedBy("◦C ")
    private List<Double> TMP_INNER; // 20
    @DescribedBy("")
    private double TRANSPARENCY = 1;
    @DescribedBy("m/s")
    private double VEL;
    @DescribedBy("m/s")
    private double VEL_BULK;
    @DescribedBy("1/s")
    private double VEL_GRAD;
    @DescribedBy("m/s")
    private double[] VEL_T = new double[2];
    @DescribedBy("m3/s")
    private double VOLUME_FLOW;
    @DescribedBy("m")
    private double WIDTH;
    @DescribedBy("m")
    private double[] XYZ = new double[3];
    @DescribedBy("m")
    private double Z0 = 10;

}
