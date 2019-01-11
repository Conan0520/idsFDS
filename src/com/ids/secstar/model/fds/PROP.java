package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

import java.util.List;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Device Properties")
public class PROP extends Namelist {
    @DescribedBy("%/m")
    private double ACTIVATION_OBSCURATION = 3.24;
    @DescribedBy("◦C")
    private double ACTIVATION_TEMPERATURE = 74;
    @DescribedBy("")
    private double ALPHA_C = 1.8;
    @DescribedBy("")
    private double ALPHA_E = 0;
    @DescribedBy("")
    private double BETA_C = 1;
    @DescribedBy("")
    private double BETA_E = 1;
    @DescribedBy("m/s")
    private double CHARACTERISTIC_VELOCITY = 1;
    @DescribedBy("(m/s)1/2")
    private double C_FACTOR = 0;
    @DescribedBy("kg/m3")
    private double DENSITY = 8908;
    @DescribedBy("m")
    private double DIAMETER = 0.001;
    @DescribedBy("")
    private double EMISSIVITY = 0.85;
    @DescribedBy("")
    private String FLOW_RAMP;
    @DescribedBy("L/min")
    private double FLOW_RATE;
    @DescribedBy("")
    private double FLOW_TAU = 0;
    @DescribedBy("")
    private double GAUGE_EMISSIVITY = 0.9;
    @DescribedBy("◦C")
    private double GAUGE_TEMPERATURE; //TMPA
    @DescribedBy("W/(m2 ·K)")
    private double HEAT_TRANSFER_COEFFICIENT;
    @DescribedBy("")
    private String ID;
    @DescribedBy("◦C")
    private double INITIAL_TEMPERATURE; //TMPA
    @DescribedBy("L/(min·bar 12 )")
    private double K_FACTOR = 1;
    @DescribedBy("m")
    private double LENGTH = 1.8;
    @DescribedBy("kg/s")
    private double MASS_FLOW_RATE;
    @DescribedBy("m")
    private double OFFSET = 0.05;
    @DescribedBy("bar")
    private double OPERATING_PRESSURE = 1;
    @DescribedBy("m")
    private double ORIFICE_DIAMETER = 0;
    @DescribedBy("m/s")
    private double P = 0;
    @DescribedBy("m/s")
    private double[] PX = new double[3];
    @DescribedBy("m/s")
    private double[] PXX = new double[9];
    @DescribedBy("")
    private int PARTICLES_PER_SECOND = 5000;
    @DescribedBy("m/s")
    private double PARTICLE_VELOCITY = 0;
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
    @DescribedBy("")
    private String PRESSURE_RAMP;
    @DescribedBy("√")
    private String QUANTITY;
    @DescribedBy("m·s")
    private double RTI = 100;
    @DescribedBy("")
    private List<String> SMOKEVIEW_ID;
    @DescribedBy("")
    private List<String> SMOKEVIEW_PARAMETERS;
    @DescribedBy("")
    private String SPEC_ID;
    @DescribedBy("kJ/(kg·K)")
    private double SPECIFIC_HEAT = 0.44;
    @DescribedBy("degrees")
    private double[] SPRAY_ANGLE = new double[]{60., 75.};
    @DescribedBy("degrees")
    private double SPRAY_PATTERN_BETA = 5;
    @DescribedBy("degrees")
    private double SPRAY_PATTERN_MU = 0;
    @DescribedBy("")
    private String SPRAY_PATTERN_SHAPE = "GAUSSIAN";
    @DescribedBy("")
    private String SPRAY_PATTERN_TABLE;
    @DescribedBy("")
    private int VELOCITY_COMPONENT;

}
