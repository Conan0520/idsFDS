package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Lagrangian Particles/Droplets")
public class PART extends Namelist {
    @DescribedBy("s")
    private double AGE = 10 ^ 5;
    @DescribedBy("")
    private boolean BREAKUP = false;
    @DescribedBy("")
    private String BREAKUP_CNF_RAMP_ID;
    @DescribedBy("")
    private String BREAKUP_DISTRIBUTION = "ROSIN...";
    @DescribedBy("")
    private double BREAKUP_GAMMA_D = 2.4;
    @DescribedBy("")
    private double BREAKUP_RATIO = 3 / 7;
    @DescribedBy("")
    private double BREAKUP_SIGMA_D;
    @DescribedBy("")
    private boolean CHECK_DISTRIBUTION = false;
    @DescribedBy("")
    private String CNF_RAMP_ID;
    @DescribedBy("")
    private String COLOR = "BLACK";
    @DescribedBy("")
    private double COMPLEX_REFRACTIVE_INDEX = 0.01;
    @DescribedBy("")
    private String CTRL_ID;
    @DescribedBy("")
    private double DENSE_VOLUME_FRACTION = 10 ^ (-5);
    @DescribedBy("")
    private String DEVC_ID;
    @DescribedBy("µm")
    private double DIAMETER;
    @DescribedBy("")
    private String DISTRIBUTION = "ROSIN...";
    @DescribedBy("")
    private double[] DRAG_COEFFICIENT = new double[3];
    @DescribedBy("")
    private String DRAG_LAW = "SPHERE";
    @DescribedBy("")
    private double FREE_AREA_FRACTION;
    @DescribedBy("")
    private double GAMMA_D = 2.4;
    @DescribedBy("kJ/kg")
    private double HEAT_OF_COMBUSTION;
    @DescribedBy("m/s")
    private double HORIZONTAL_VELOCITY = 0.2;
    @DescribedBy("")
    private String ID;
    @DescribedBy("◦C")
    private double INITIAL_TEMPERATURE; //	TMPA
    @DescribedBy("")
    private boolean MASSLESS = false;
    @DescribedBy("µm")
    private double MAXIMUM_DIAMETER = Double.MAX_VALUE;
    @DescribedBy("µm")
    private double MINIMUM_DIAMETER = 20;
    @DescribedBy("")
    private boolean MONODISPERSE = false;
    @DescribedBy("")
    private int N_STRATA = 6;
    @DescribedBy("")
    private double[] ORIENTATION = new double[3];
    @DescribedBy("")
    private boolean PERIODIC_X = false;
    @DescribedBy("")
    private boolean PERIODIC_Y = false;
    @DescribedBy("")
    private boolean PERIODIC_Z = false;
    @DescribedBy("")
    private double[] PERMEABILITY = new double[3];
    @DescribedBy("")
    private double POROUS_VOLUME_FRACTION;
    @DescribedBy("")
    private String PROP_ID;
    @DescribedBy("")
    private String QUANTITIES;
    @DescribedBy("")
    private String QUANTITIES_SPEC_ID;
    @DescribedBy("")
    private double RADIATIVE_PROPERTY_TABLE;
    @DescribedBy("")
    private double REAL_REFRACTIVE_INDEX = 1.33;
    @DescribedBy("")
    private int[] RGB = new int[3];
    @DescribedBy("")
    private double RUNNING_AVERAGE_FACTOR = 0.5;
    @DescribedBy("")
    private int SAMPLING_FACTOR = 1;
    @DescribedBy("")
    private boolean SECOND_ORDER_PARTICLE_TRANSPORT = false;
    @DescribedBy("")
    private double SHAPE_FACTOR = 0.25;
    @DescribedBy("")
    private double SIGMA_D;
    @DescribedBy("")
    private String SPEC_ID;
    @DescribedBy("")
    private boolean STATIC = false;
    @DescribedBy("N/m")
    private double SURFACE_TENSION = 7.28 * (10 ^ (-2));
    @DescribedBy("")
    private String SURF_ID;
    @DescribedBy("")
    private boolean TURBULENT_DISPERSION = false;
    @DescribedBy("m/s")
    private double VERTICAL_VELOCITY = 0.5;

}
