package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

import java.util.List;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Reaction")
public class REAC extends Namelist {
    @DescribedBy("")
    private double A;
    @DescribedBy("◦C")
    private double AUTO_IGNITION_TEMPERATURE;
    @DescribedBy("")
    private double C = 0;
    @DescribedBy("")
    private boolean CHECK_ATOM_BALANCE = true;
    @DescribedBy("kg/kg")
    private double CO_YIELD = 0;
    @DescribedBy("◦C")
    private double CRITICAL_FLAME_TEMPERATURE = 1427;
    @DescribedBy("kJ/kmol")
    private double E;
    @DescribedBy("kJ/kg")
    private double EPUMO2 = 13100;
    @DescribedBy("")
    private String EQUATION;
    @DescribedBy("")
    private String FORMULA;
    @DescribedBy("")
    private String FUEL;
    @DescribedBy("")
    private String FUEL_RADCAL_ID;
    @DescribedBy("")
    private double H = 0;
    @DescribedBy("kJ/kg")
    private double HEAT_OF_COMBUSTION;
    @DescribedBy("")
    private String ID;
    @DescribedBy("")
    private boolean IDEAL = false;
    @DescribedBy("mol/mol")
    private double LOWER_OXYGEN_LIMIT;
    @DescribedBy("")
    private double N = 0;
    @DescribedBy("")
    private List<Double> NU;
    @DescribedBy("")
    private List<Double> N_S;
    @DescribedBy("")
    private double N_T;
    @DescribedBy("")
    private double O = 0;
    @DescribedBy("")
    private int PRIORITY = 1;
    @DescribedBy("")
    private double RADIATIVE_FRACTION;
    @DescribedBy("")
    private String RAMP_CHI_R;
    @DescribedBy("atoms")
    private double REAC_ATOM_ERROR = 1.00E-05;
    @DescribedBy("kg/kg ")
    private double REAC_MASS_ERROR = 1.00E-04;
    @DescribedBy("")
    private double SOOT_H_FRACTION = 0.1;
    @DescribedBy("kg/kg")
    private double SOOT_YIELD = 0;
    @DescribedBy("")
    private List<String> SPEC_ID_N_S;

}
