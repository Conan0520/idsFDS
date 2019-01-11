package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

import java.util.List;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Material")
public class MATL extends Namelist {
    @DescribedBy("1/s")
    private List<Double> A;
    @DescribedBy("1/m")
    private double ABSORPTION_COEFFICIENT = 50000;
    @DescribedBy("")
    private boolean ALLOW_SHRINKING = true;
    @DescribedBy("")
    private boolean ALLOW_SWELLING = true;
    @DescribedBy("◦C")
    private double BOILING_TEMPERATURE = 5000;
    @DescribedBy("W/(m·K)")
    private double CONDUCTIVITY = 0;
    @DescribedBy("")
    private String CONDUCTIVITY_RAMP;
    @DescribedBy("kg/m3")
    private double DENSITY = 0;
    @DescribedBy("m2/2")
    private double DIFFUSIVITY_SPEC;
    @DescribedBy("kJ/kmol")
    private List<Double> E;
    @DescribedBy("")
    private double EMISSIVITY = 0.9;
    @DescribedBy("m")
    private List<Double> GAS_DIFFUSION_DEPTH; // 0.001
    @DescribedBy("◦C/min")
    private List<Double> HEATING_RATE; // 5
    @DescribedBy("kJ/kg")
    private List<Double> HEAT_OF_COMBUSTION;
    @DescribedBy("kJ/kg")
    private List<Double> HEAT_OF_REACTION;// 0
    @DescribedBy("")
    private String ID;
    @DescribedBy("")
    private String MATL_ID;
    @DescribedBy("kg/kg")
    private List<Double> NU_MATL;//0
    @DescribedBy("")
    private List<Double> NU_SPEC;//	0
    @DescribedBy("")
    private int N_REACTIONS = 0;
    @DescribedBy("")
    private List<Double> N_O2; //0
    @DescribedBy("")
    private List<Double> N_S; // 1
    @DescribedBy("")
    private List<Double> N_T; //0
    @DescribedBy("")
    private List<Boolean> PCR; // FALSE
    @DescribedBy("◦C")
    private List<Double> PYROLYSIS_RANGE; //80
    @DescribedBy("1/s")
    private List<Double> REFERENCE_RATE;
    @DescribedBy("◦C")
    private List<Double> REFERENCE_TEMPERATURE;
    @DescribedBy("kJ/(kg·K)")
    private double SPECIFIC_HEAT = 0;
    @DescribedBy("")
    private String SPECIFIC_HEAT_RAMP;
    @DescribedBy("")
    private String SPEC_ID;
    @DescribedBy("")
    private List<Double> THRESHOLD_SIGN; //1
    @DescribedBy("◦C")
    private List<Double> THRESHOLD_TEMPERATURE;// -273.15
}
