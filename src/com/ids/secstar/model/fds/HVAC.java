package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

import java.util.List;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("HVAC System Definition")
public class HVAC extends Namelist {
    private String AIRCOIL_ID;
    private boolean AMBIENT = false;
    @DescribedBy("m2")
    private double AREA;
    private double CLEAN_LOSS;
    @DescribedBy("kg/s")
    private double COOLANT_MASS_FLOW;
    @DescribedBy("kJ/(kg·K)")
    private double COOLANT_SPECIFIC_HEAT;
    @DescribedBy("◦C")
    private double COOLANT_TEMPERATURE;
    private String CTRL_ID;
    private boolean DAMPER = false;
    private String DEVC_ID;
    @DescribedBy("m")
    private double DIAMETER;
    private List<String> DUCT_ID;
    private String DUCT_INTERP_TYPE = "NODE1";
    private List<Double> EFFICIENCY;//1
    private String FAN_ID;
    private String FILTER_ID;
    @DescribedBy("kW")
    private double FIXED_Q;
    private String ID;
    private boolean LEAK_ENTHALPY = false;
    @DescribedBy("m")
    private double LENGTH;
    @DescribedBy("kg")
    private List<Double> LOADING;//0
    @DescribedBy("1/kg")
    private List<Double> LOADING_MULTIPLIER;//1
    private List<Double> LOSS;//
    @DescribedBy("kg/s")
    private double MASS_FLOW;
    @DescribedBy("m3/s")
    private double MAX_FLOW;
    @DescribedBy("Pa")
    private double MAX_PRESSURE;
    private int N_CELLS;//LENGTH/0.1
    private List<String> NODE_ID;
    @DescribedBy("m")
    private double PERIMETER;
    private String RAMP_ID;
    private String RAMP_LOSS;
    private boolean REVERSE = false;
    @DescribedBy("m")
    private double ROUGHNESS = 0;
    private List<String> SPEC_ID;
    @DescribedBy("s")
    private double TAU_AC = 1;
    @DescribedBy("s")
    private double TAU_FAN = 1;
    @DescribedBy("s")
    private double TAU_VF = 1;
    private String TYPE_ID;
    private String VENT_ID;
    private String VENT2_ID;
    @DescribedBy("m3/s")
    private double VOLUME_FLOW;
    @DescribedBy("m")
    private double[] XYZ = new double[3];//0
}
