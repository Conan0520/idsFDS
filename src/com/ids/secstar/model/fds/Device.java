package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Device")
public class Device extends Namelist {
    @DescribedBy("计算域外部空气流速——kg/s")
    private double bypassFlowrate = 0; //BYPASS_FLOWRATE

    @DescribedBy("转换加数")
    private double CONVERSION_ADDEND = 0;

    @DescribedBy("转换分数")
    private double CONVERSION_FACTOR = 1;

    @DescribedBy("")
    private double COORD_FACTOR = 1;

    @DescribedBy("")
    private String CTRL_ID;

    @DescribedBy("转移延迟(采样位置到中央探测器的传输时间)s")
    private double delay = 0; //DELAY

    @DescribedBy("表面深度——m")
    private double depth = 0; //DEPTH

    @DescribedBy("")
    private String DEVC_ID;

    @DescribedBy("")
    private boolean DRY = false;

    @DescribedBy("")
    private String DUCT_ID;

    @DescribedBy("")
    private boolean EVACUATION = false;

    @DescribedBy("气体流速——kg/s")
    private double flowrate = 0; //FLOWRATE

    @DescribedBy("")
    private boolean HIDE_COORDINATES = false;

    @DescribedBy("设备名称")
    private String id; //ID

    @DescribedBy("初始化时设定点是否激活")
    private boolean initialState = false; //INITIAL_STATE

    @DescribedBy("")
    private String INIT_ID;

    @DescribedBy("设备所连接表面的外法线")
    private int ior; //IOR

    @DescribedBy("设定点只触发一次")
    private boolean latch = true; //LATCH

    @DescribedBy("")
    private String MATL_ID;

    @DescribedBy("")
    private String NODE_ID[] = new String[2];

    @DescribedBy("冻结输出，当激活这个控件时，设备输出将冻结在当前值")
    private String noUpdateDevcId; //NO_UPDATE_DEVC_ID

    @DescribedBy("")
    private String NO_UPDATE_CTRL_ID;

    @DescribedBy("方向")
    private double[] orientation = new double[]{0, 0, -1}; //ORIENTATION

    @DescribedBy("")
    private int ORIENTATION_NUMBER = 1;

    @DescribedBy("")
    private boolean OUTPUT = true;

    @DescribedBy("")
    private String PART_ID;

    @DescribedBy("")
    private int PIPE_INDEX = 1;

    @DescribedBy("线条上点的数量")
    private int points = 1; //POINTS

    @DescribedBy("装置")
    private String propId; //PROP_ID

    @DescribedBy("衡量标准")
    private String quantity; //QUANTITY

    @DescribedBy("")
    private String QUANTITY2;

    @DescribedBy("")
    private double[] QUANTITY_RANGE = new double[]{-10 ^ 50, 10 ^ 50};

    @DescribedBy("")
    private boolean RELATIVE = false;

    @DescribedBy("")
    private String R_ID;

    @DescribedBy("旋转角度")
    private double rotation = 0; //ROTATION

    @DescribedBy("设定点")
    private double setPoint; //SETPOINT

    @DescribedBy("按照**来统计")
    private String statistics; //STATISTICS

    @DescribedBy("s")
    private double STATISTICS_START = 0;//T_BEGIN

    @DescribedBy("")
    private double SMOOTHING_FACTOR = 0;

    @DescribedBy("")
    private String SPEC_ID;

    @DescribedBy("")
    private String SURF_ID;

    @DescribedBy("")
    private boolean TIME_AVERAGED = true;

    @DescribedBy("")
    private boolean TIME_HISTORY;

    @DescribedBy("")
    private int TRIP_DIRECTION = 1;

    @DescribedBy("")
    private String UNITS;

    @DescribedBy("")
    private int VELO_INDEX = 0;

    @DescribedBy("垂直轴的坐标m")
    private double[] xb = new double[6]; //XB

    @DescribedBy("设备位置——m")
    private double[] xyz = new double[3]; //XYZ

    @DescribedBy("")
    private String X_ID = "ID-x";

    @DescribedBy("")
    private String Y_ID = "ID-y";

    @DescribedBy("")
    private String Z_ID = "ID-z";

    @DescribedBy("")
    private String XYZ_UNITS = "m";

}
