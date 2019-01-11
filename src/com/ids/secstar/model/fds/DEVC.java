package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Device")
public class DEVC extends Namelist {
    @DescribedBy("kg/s")
    private double BYPASS_FLOWRATE = 0;
    private double CONVERSION_ADDEND = 0;
    private double CONVERSION_FACTOR = 1;
    private double COORD_FACTOR = 1;
    private String CTRL_ID;
    @DescribedBy("s")
    private double DELAY = 0;
    @DescribedBy("m")
    private double DEPTH = 0;
    private String DEVC_ID;
    private boolean DRY = false;
    private String DUCT_ID;
    private boolean EVACUATION = false;
    @DescribedBy("kg/s")
    private double FLOWRATE = 0;
    private boolean HIDE_COORDINATES = false;
    private String ID;
    private boolean INITIAL_STATE = false;
    private String INIT_ID;
    private int IOR;
    private boolean LATCH = true;
    private String MATL_ID;
    private String NODE_ID[] = new String[2];
    private String NO_UPDATE_DEVC_ID;
    private String NO_UPDATE_CTRL_ID;
    private double[] ORIENTATION = new double[]{0, 0, -1};
    private int ORIENTATION_NUMBER = 1;
    private boolean OUTPUT = true;
    private String PART_ID;
    private int PIPE_INDEX = 1;
    private int POINTS = 1;
    private String PROP_ID;
    private String QUANTITY;
    private String QUANTITY2;
    private double[] QUANTITY_RANGE = new double[]{-10 ^ 50, 10 ^ 50};
    private boolean RELATIVE = false;
    private String R_ID;
    @DescribedBy("Degree")
    private double ROTATION = 0;
    private double SETPOINT;
    private String STATISTICS;
    @DescribedBy("s")
    private double STATISTICS_START = 0;//T_BEGIN
    private double SMOOTHING_FACTOR = 0;
    private String SPEC_ID;
    private String SURF_ID;
    private boolean TIME_AVERAGED = true;
    private boolean TIME_HISTORY;
    private int TRIP_DIRECTION = 1;
    private String UNITS;
    private int VELO_INDEX = 0;
    @DescribedBy("m")
    private double[] XB = new double[6];
    @DescribedBy("m")
    private double[] XYZ = new double[3];
    private String X_ID = "ID-x";
    private String Y_ID = "ID-y";
    private String Z_ID = "ID-z";
    private String XYZ_UNITS = "m";

}
