package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("General Combustion")
public class COMB extends Namelist {

    private boolean CHECK_REALIZABILITY = false;

    private String EXTINCTION_MODEL = "EXTINCTION 2";

    @DescribedBy("s")
    private double FIXED_MIX_TIME;

    private double FUEL_C_TO_CO_FRACTION = 2 / 3;

    private double FUEL_H_TO_H2_FRACTION = 0;

    @DescribedBy("初始非混合分数")
    private double initialUnmixedFraction = 1; //INITIAL_UNMIXED_FRACTION

    private int MAX_CHEMISTRY_SUBSTEPS = 20;

    private int N_FIXED_CHEMISTRY_SUBSTEPS = -1;

    private int N_SIMPLE_CHEMISTRY_REACTIONS = 1;

    private String ODE_SOLVER;

    private double RICHARDSON_ERROR_TOLERANCE = 0.000001;

    @DescribedBy("反应抑制")
    private boolean suppression = true; //SUPPRESSION

    private double TAU_CHEM;

    private double TAU_FLAME = 10000000000d;
}


