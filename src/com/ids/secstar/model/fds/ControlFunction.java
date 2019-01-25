package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

import java.util.List;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Control Function")
public class ControlFunction extends Namelist {

    private double CONSTANT;

    @DescribedBy("延迟——s")
    private double delay = 0; //DELAY

    private double DIFFERENTIAL_GAIN = 0;

    private boolean EVACUATION = false;

    @DescribedBy("功能类型")
    private String functionType; //FUNCTION_TYPE

    @DescribedBy("名称")
    private String id; //ID

    private boolean INITIAL_STATE = false;

    @DescribedBy("引入其他控制功能")
    private List<String> inputId; //INPUT_ID

    private double INTEGRAL_GAIN = 0;

    @DescribedBy("是否只触发一次")
    private boolean latch = true; //LATCH

    private int N = 1;

    private String ON_BOUND = "LOWER";

    private double PROPORTIONAL_GAIN = 0;

    private String RAMP_ID;

    private double SETPOINT;

    private double TARGET_VALUE = 0;

    private int TRIP_DIRECTION = 1;
}
