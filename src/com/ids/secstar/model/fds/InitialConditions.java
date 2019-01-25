package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

import java.util.List;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Initial Conditions")
public class InitialConditions extends Namelist {

    @DescribedBy("范围大小——m")
    private double[] xb = new double[6]; //XB

    @DescribedBy("物质类型")
    private List<String> specId; //SPEC_ID

    @DescribedBy("物质的质量分数——kg/m3")
    private List<Double> massFraction; //MASS_FRACTION

    @DescribedBy("物质的体积分数——mol/mol")
    private List<Double> volumeFraction; //VOLUME_FRACTION

    @DescribedBy("初始温度——◦C")
    private double temperature; //TEMPERATURE

    @DescribedBy("初始密度——kg/m3")
    private double density; //DENSITY

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
