package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

import java.util.List;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Surface")
public class Surface extends Namelist {
    @DescribedBy("绝热的")
    private boolean ADIABATIC;

    @DescribedBy("自燃温度——◦C")
    private double AUTO_IGNITION_TEMPERATURE = -273;

    @DescribedBy("背面的边界条件")
    private String backing = "EXPOSED"; //BACKING

    @DescribedBy("允许烧掉")
    private boolean burnAway; //BURN_AWAY

    @DescribedBy("单元格大小")
    private double CELL_SIZE_FACTOR = 1;

    @DescribedBy("")
    private double C_FORCED_CONSTANT = 0;

    @DescribedBy("")
    private double C_FORCED_PR_EXP = 0;

    @DescribedBy("")
    private double C_FORCED_RE = 0;

    @DescribedBy("")
    private double C_FORCED_RE_EXP = 0;

    @DescribedBy("")
    private double C_HORIZONTAL = 1.52;

    @DescribedBy("")
    private double C_VERTICAL = 1.31;

    @DescribedBy("颜色")
    private String COLOR;

    @DescribedBy("对流规模长度——m")
    private double CONVECTION_LENGTH_SCALE = 1;

    @DescribedBy("对流热通量——kW/m2")
    private double convectiveHeatFlux; //CONVECTIVE_HEAT_FLUX

    @DescribedBy("体积转质量")
    private boolean CONVERT_VOLUME_TO_MASS;

    @DescribedBy("默认")
    private boolean DEFAULT;

    @DescribedBy("插入间隔时间——s")
    private double dtInsert = 0.01; //DT_INSERT

    @DescribedBy("发射率")
    private double emissivity = 0.9; //EMISSIVITY

    @DescribedBy("")
    private double EMISSIVITY_BACK;

    @DescribedBy("")
    private boolean EVAC_DEFAULT;

    @DescribedBy("灭火系数——m2/(kg·s)")
    private double eCoefficient; //E_COEFFICIENT

    @DescribedBy("外部通量——kW/m2")
    private double EXTERNAL_FLUX;

    @DescribedBy("熄灭温度——◦C")
    private double EXTINCTION_TEMPERATURE = -273;

    @DescribedBy("自由滑动")
    private boolean FREE_SLIP;

    @DescribedBy("几何形状")
    private String geometry = "CARTESIAN"; //GEOMETRY

    @DescribedBy("蒸发产生的热量——kJ/kg")
    private double heatOfVaporization; //HEAT_OF_VAPORIZATION

    @DescribedBy("传热系数——W/(m2 ·K)")
    private double heatTransferCoefficient; //HEAT_TRANSFER_COEFFICIENT

    @DescribedBy("W/(m2 ·K)")
    private double HEAT_TRANSFER_COEFFICIENT_BACK;

    @DescribedBy("传热模型")
    private String heatTransferModel; //HEAT_TRANSFER_MODEL

    @DescribedBy("每单位面积的热释放率——kW/m2")
    private double hrrpua; //HRRPUA

    @DescribedBy("")
    private boolean HT3D;

    @DescribedBy("")
    private String ID;

    @DescribedBy("点燃温度——◦C")
    private double ignitionTemperature = 5000; //IGNITION_TEMPERATURE

    @DescribedBy("几何体内半径——m")
    private double innerRadius; //INNER_RADIUS

    @DescribedBy("内部热源——kW/m3")
    private List<Double> INTERNAL_HEAT_SOURCE;

    @DescribedBy("层划分")
    private double layerDivide; // LAYER_DIVIDE

    @DescribedBy("压力泄露路径")
    private int[] leakPath = new int[2]; //LEAK_PATH

    @DescribedBy("几何体长度——m")
    private double length; //LENGTH

    @DescribedBy("质量通量——kg/(m2 ·s)")
    private List<Double> massFlux; //MASS_FLUX

    @DescribedBy("总质量通量——kg/(m2 ·s)")
    private double massFluxTotal; //MASS_FLUX_TOTAL

    @DescribedBy("")
    private double MASS_FLUX_VAR;

    @DescribedBy("质量分数(各物质的和不能大于1)")
    private List<Double> massFraction;  //MASS_FRACTION

    @DescribedBy("质量传递系数——m/s")
    private double MASS_TRANSFER_COEFFICIENT;

    @DescribedBy("材质类型")
    private List<String> matlId;  //MATL_ID(1,1:3) 表示第一层的第一到第三种材质

    @DescribedBy("材质质量分数")
    private List<Double> matlMassFraction; //MATL_MASS_FRACTION(3:2) 表示第三层的第二种材质的质量分数

    @DescribedBy("最小厚度——m")
    private double MINIMUM_LAYER_THICKNESS = 1.00E-06;

    @DescribedBy("每单位面积的质量损失率——kg/(m2 ·s)")
    private double mlrpua; //MLRPUA

    @DescribedBy("N层单元最大值")
    private List<Integer> N_LAYER_CELLS_MAX; // 1000

    @DescribedBy("净热通量——kW/m2")
    private double netHeatFlux; //NET_HEAT_FLUX

    @DescribedBy("不能滑动")
    private boolean NO_SLIP;

    @DescribedBy("每个细胞的颗粒数量")
    private int nppc = 1; //NPPC

    @DescribedBy("粒子质量通量——kg/(m2 ·s)")
    private double particleMassFlux;  //PARTICLE_MASS_FLUX

    @DescribedBy("粒子表面密度——kg/m2")
    private double particleSurfaceDensity; //PARTICLE_SURFACE_DENSITY

    @DescribedBy("粒子类型")
    private String partId; //PART_ID

    @DescribedBy("大气剖面指数")
    private double ple = 0.3; //PLE

    @DescribedBy("风廓线")
    private String profile; //PROFILE

    @DescribedBy("几何体半径——m")
    private double radius; //RADIUS

    @DescribedBy("")
    private String RAMP_EF;

    @DescribedBy("注入物种速率曲线")
    private String rampMf; //RAMP_MF

    @DescribedBy("粒子上升时间曲线")
    private String rampPart; //RAMP_PART

    @DescribedBy("热释放率上升曲线")
    private String rampQ; //RAMP_Q

    @DescribedBy("表面温度上升曲线")
    private String rampT; //RAMP_T

    @DescribedBy("")
    private String RAMP_T_I;

    @DescribedBy("气流上升到指定量的时间曲线")
    private String rampV; //RAMP_   V

    @DescribedBy("")
    private String RAMP_V_X;

    @DescribedBy("")
    private String RAMP_V_Y;

    @DescribedBy("")
    private String RAMP_V_Z;

    @DescribedBy("颜色")
    private int[] rgb = new int[]{255, 204, 102}; //RGB

    @DescribedBy("m")
    private double ROUGHNESS = 0;

    @DescribedBy("物种类型")
    private String specId; //SPEC_ID

    @DescribedBy("m/s")
    private double SPREAD_RATE;

    @DescribedBy("")
    private double STRETCH_FACTOR = 2;

    @DescribedBy("s ")
    private double TAU_EF = 1;

    @DescribedBy("物质质量上升时间——s ")
    private double tauMf = 1; //TAU_MF

    @DescribedBy("粒子上升时间——s ")
    private double tauPart = 1; //TAU_PART

    @DescribedBy("热释放率上升时间——s ")
    private double tauQ = 1; //TAU_Q

    @DescribedBy("表面温度上升时间——s ")
    private double tauT = 1; //TAU_T

    @DescribedBy("气流上升时间——s ")
    private double tauV = 1; //TAU_V

    @DescribedBy("图片高度——m")
    private double textureHeight = 1; //TEXTURE_HEIGHT

    @DescribedBy("模型图片路径")
    private String textureMap; //TEXTURE_MAP

    @DescribedBy("图片宽度——m")
    private double textureWidth = 1; //TEXTURE_WIDTH

    @DescribedBy("")
    private boolean TGA_ANALYSIS;

    @DescribedBy("◦C")
    private double TGA_FINAL_TEMPERATURE = 800;

    @DescribedBy("◦C/min")
    private double TGA_HEATING_RATE = 5;

    @DescribedBy("厚度——m")
    private List<Double> thickness; //THICKNESS(1:2) 表示第一层和第二层的厚度

    @DescribedBy("间隙温度——◦C")
    private double tmpBack = 20; //TMP_BACK

    @DescribedBy("表面温度——◦C")
    private double tmpFront = 20; //TMP_FRONT

    @DescribedBy("固体内的初始温度——◦C ")
    private List<Double> tmpInner; //TMP_INNER

    @DescribedBy("透明度")
    private double transparency = 1; //TRANSPARENCY

    @DescribedBy("速度——m/s")
    private double vel; //VEL

    @DescribedBy("m/s")
    private double VEL_BULK;

    @DescribedBy("1/s")
    private double VEL_GRAD;

    @DescribedBy("切向速度(切向加速度和向心加速度)——m/s")
    private double[] velT = new double[2]; //VEL_T

    @DescribedBy("体积流量——m3/s")
    private double volumeFlow; //VOLUME_FLOW

    @DescribedBy("几何体宽度——m")
    private double width; //WIDTH

    @DescribedBy("m")
    private double[] XYZ = new double[3];

    @DescribedBy("大气剖面起点——m")
    private double z0 = 10; //Z0

}
