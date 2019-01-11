package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

import java.util.List;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Initial Conditions")
public class INIT extends Namelist {
    @DescribedBy("m")
    private double[] XB = new double[6];
    private List<String> SPEC_ID; // Species concentrations
    @DescribedBy("kg/m3")
    private List<Double> MASS_FRACTION;
    @DescribedBy("mol/mol")
    private List<Double> VOLUME_FRACTION; // VOLUME_FRACTION can be substituted for MASS_FRACTION.
    @DescribedBy("◦C")
    private double TEMPERATURE;// To modify the local initial temperature
    @DescribedBy("kg/m3")
    private double DENSITY; // Ambient, specifying an initial density
    @DescribedBy("kW/m3")
    private double HRRPUV; // Heat Release Rate Per Unit Volume
    @DescribedBy("◦C")
    private double AUTO_IGNITION_TEMPERATURE = -273.15;
    private boolean CELL_CENTERED = false;
    private String CTRL_ID;

    private String DEVC_ID;
    @DescribedBy("µm")
    private double DIAMETER;
    @DescribedBy("s")
    private double DT_INSERT;
    @DescribedBy("m")
    private double DX = 0;
    @DescribedBy("m")
    private double DY = 0;
    @DescribedBy("m")
    private double DZ = 0;
    @DescribedBy("m")
    private double HEIGHT;

    private String ID;

    @DescribedBy("kg/s")
    private double MASS_PER_TIME;
    @DescribedBy("kg/m3")
    private double MASS_PER_VOLUME = 1;
    private String MULT_ID;
    private int N_PARTICLES = 0;
    private int N_PARTICLES_PER_CELL = 0;
    private String PART_ID;
    private double PARTICLE_WEIGHT_FACTOR = 1;
    @DescribedBy("m")
    private double RADIUS;
    private String SHAPE = "BLOCK";


    @DescribedBy("m/s")
    private double[] UVW = new double[3];


    @DescribedBy("m")
    private double[] XYZ = new double[3];

}
