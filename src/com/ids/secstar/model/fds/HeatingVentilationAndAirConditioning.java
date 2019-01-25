package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

import java.util.List;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("HeatingVentilationAndAirConditioning System Definition")
public class HeatingVentilationAndAirConditioning extends Namelist {

    @DescribedBy("制冷器")
    private String aircoilId; //AIRCOIL_ID

    @DescribedBy("启用环境端点")
    private boolean ambient = false; //AMBIENT

    @DescribedBy("面积——m2")
    private double area; //AREA

    @DescribedBy("零负载时过滤器的流量损失")
    private double cleanLoss; //CLEAN_LOSS

    @DescribedBy("冷却剂质量流量——kg/s")
    private double coolantMassFlow; //COOLANT_MASS_FLOW

    @DescribedBy("冷却剂比热——kJ/(kg·K)")
    private double coolantSpecificHeat; //COOLANT_SPECIFIC_HEAT

    @DescribedBy("冷却剂温度——◦C")
    private double coolantTemperature; //COOLANT_TEMPERATURE

    @DescribedBy("控制功能")
    private String ctrlId; //CTRL_ID

    @DescribedBy("管道开关")
    private boolean damper = false; //DAMPER

    @DescribedBy("设备控制逻辑")
    private String devcId; //DEVC_ID

    @DescribedBy("直径——m")
    private double diameter; //DIAMETER

    @DescribedBy("节点之间连接的管道")
    private List<String> ductId; //DUCT_ID

    private String DUCT_INTERP_TYPE = "NODE1";

    @DescribedBy("效率")
    private List<Double> efficiency;//EFFICIENCY

    @DescribedBy("风机")
    private String fanId; //FAN_ID

    @DescribedBy("过滤器")
    private String filterId; //FILTER_ID

    @DescribedBy("热交换效率——kW")
    private double fixedQ; //FIXED_Q

    @DescribedBy("名称")
    private String id; //ID

    @DescribedBy("是否泄漏焓")
    private boolean leakEnthalpy = false; //LEAK_ENTHALPY

    @DescribedBy("管道长度——m")
    private double length; //LENGTH

    @DescribedBy("初始加载时的质量——kg")
    private List<Double> loading;//LOADING

    @DescribedBy("加载乘数——1/kg")
    private List<Double> loadingMultiplier;//LOADING_MULTIPLIER

    @DescribedBy("损失")
    private List<Double> loss;//LOSS

    @DescribedBy("kg/s")
    private double MASS_FLOW;

    @DescribedBy("最大流率——m3/s")
    private double maxFlow; //MAX_FLOW

    @DescribedBy("最大压力——Pa")
    private double maxPressure; //MAX_PRESSURE

    private int N_CELLS;//LENGTH/0.1

    @DescribedBy("管道连接的节点")
    private List<String> nodeId; //NODE_ID

    @DescribedBy("周长——m")
    private double perimeter; //PERIMETER

    @DescribedBy("变化曲线")
    private String rampId; //RAMP_ID

    private String RAMP_LOSS;

    private boolean REVERSE = false;

    @DescribedBy("粗糙度——m")
    private double roughness = 0; //ROUGHNESS

    @DescribedBy("要过滤的物质")
    private List<String> specId; //SPEC_ID

    @DescribedBy("热交换效率变化时间——s")
    private double tauAc = 1; //TAU_AC

    @DescribedBy("风机初始加速时间——s")
    private double tauFan = 1; //TAU_FAN

    @DescribedBy("管道内风机转速到达最大值时间——s")
    private double tauVf = 1; //TAU_VF

    @DescribedBy("类型")
    private String typeId; //TYPE_ID

    @DescribedBy("通风口")
    private String ventId; //VENT_ID

    @DescribedBy("通风口2")
    private String vent2Id; //VENT2_ID

    @DescribedBy("体积流量——m3/s")
    private double volumeFlow; //VOLUME_FLOW

    @DescribedBy("位置——m")
    private double[] xyz = new double[3];//XYZ
}
