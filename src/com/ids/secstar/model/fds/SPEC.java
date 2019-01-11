package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

import java.util.List;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Species")
public class SPEC extends Namelist {
    @DescribedBy("")
    private boolean AEROSOL = false;
    @DescribedBy("")
    private String ALIAS;
    @DescribedBy("")
    private boolean BACKGROUND = false;
    @DescribedBy("W/(m·K)")
    private double CONDUCTIVITY;
    @DescribedBy("W/(m·K)")
    private double CONDUCTIVITY_SOLID = 0.26;
    @DescribedBy("kg/m3")
    private double DENSITY_LIQUID;
    @DescribedBy("kg/m3")
    private double DENSITY_SOLID = 1800;
    @DescribedBy("m2/s")
    private double DIFFUSIVITY;
    @DescribedBy("kJ/mol")
    private double ENTHALPY_OF_FORMATION;
    @DescribedBy("")
    private double EPSILONKLJ = 0;
    @DescribedBy("ppm")
    private double FIC_CONCENTRATION = 0;
    @DescribedBy("ppm×min")
    private double FLD_LETHAL_DOSE = 0;
    @DescribedBy("")
    private String FORMULA;
    @DescribedBy("kJ/kg")
    private double HEAT_OF_VAPORIZATION;
    @DescribedBy("◦C")
    private double H_V_REFERENCE_TEMPERATURE;
    @DescribedBy("")
    private String ID;
    @DescribedBy("")
    private boolean LUMPED_COMPONENT_ONLY = false;
    @DescribedBy("")
    private double MASS_EXTINCTION_COEFFICIENT = 0;
    @DescribedBy("")
    private List<Double> MASS_FRACTION; //0
    @DescribedBy("")
    private double MASS_FRACTION_0 = 0;
    @DescribedBy("m")
    private double MEAN_DIAMETER = 1.00E-06;
    @DescribedBy("◦C")
    private double MELTING_TEMPERATURE;
    @DescribedBy("g/mol")
    private double MW = 29;
    @DescribedBy("")
    private double PR_GAS;// PR
    @DescribedBy("")
    private boolean PRIMITIVE;
    @DescribedBy("")
    private String RADCAL_ID;
    @DescribedBy("")
    private String RAMP_CP;
    @DescribedBy("")
    private String RAMP_CP_L;
    @DescribedBy("")
    private String RAMP_D;
    @DescribedBy("")
    private String RAMP_G_F;
    @DescribedBy("")
    private String RAMP_K;
    @DescribedBy("")
    private String RAMP_MU;
    @DescribedBy("kJ/kg")
    private double REFERENCE_ENTHALPY;
    @DescribedBy("◦C")
    private double REFERENCE_TEMPERATURE = 25;
    @DescribedBy("")
    private double SIGMALJ = 0;
    @DescribedBy("")
    private List<String> SPEC_ID;
    @DescribedBy("kJ/(kg·K)")
    private double SPECIFIC_HEAT;
    @DescribedBy("kJ/(kg·K)")
    private double SPECIFIC_HEAT_LIQUID;
    @DescribedBy("◦C")
    private double VAPORIZATION_TEMPERATURE;
    @DescribedBy("kg/(m·s)")
    private double VISCOSITY;
    @DescribedBy("")
    private List<Double> VOLUME_FRACTION;

}
