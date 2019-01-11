package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

import java.util.List;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Control Function")
public class CTRL extends Namelist {
    private double CONSTANT;
    private double DELAY = 0;
    private double DIFFERENTIAL_GAIN = 0;
    private boolean EVACUATION = false;
    private String FUNCTION_TYPE;
    private String ID;
    private boolean INITIAL_STATE = false;
    private List<String> INPUT_ID;
    private double INTEGRAL_GAIN = 0;
    private boolean LATCH = true;
    private int N = 1;
    private String ON_BOUND = "LOWER";
    private double PROPORTIONAL_GAIN = 0;
    private String RAMP_ID;
    private double SETPOINT;
    private double TARGET_VALUE = 0;
    private int TRIP_DIRECTION = 1;
}
