package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

import java.util.List;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Species")
public class Species extends Namelist {

    @DescribedBy("使用气溶胶沉积模型")
    private boolean aerosol = false; //AEROSOL

    @DescribedBy("")
    private String ALIAS;

    @DescribedBy("")
    private boolean BACKGROUND = false;

    @DescribedBy("热传导率——W/(m·K)")
    private double CONDUCTIVITY;

    @DescribedBy("固体热传导率——W/(m·K)")
    private double conductivitySolid = 0.26; //CONDUCTIVITY_SOLID

    @DescribedBy("液体密度——kg/m3")
    private double densityLiquid; //DENSITY_LIQUID

    @DescribedBy("固体密度——kg/m3")
    private double densitySolid = 1800; //DENSITY_SOLID

    @DescribedBy("扩散系数——m2/s")
    private double diffusivity;//DIFFUSIVITY

    @DescribedBy("生成热——kJ/mol")
    private double enthalpyOfFormation; //ENTHALPY_OF_FORMATION

    @DescribedBy("Epsilon/Ε ε")
    private double epsilonklj = 0;//EPSILONKLJ

    @DescribedBy("ppm")
    private double FIC_CONCENTRATION = 0;

    @DescribedBy("ppm×min")
    private double FLD_LETHAL_DOSE = 0;

    @DescribedBy("化学式")
    private String formula;//FORMULA

    @DescribedBy("汽化热量——kJ/kg")
    private double heatOfVaporization; //HEAT_OF_VAPORIZATION

    @DescribedBy("高压参考温度——◦C")
    private double hvReferenceTemperature; //H_V_REFERENCE_TEMPERATURE

    @DescribedBy("物种编号")
    private String id; //ID

    @DescribedBy("集总物种")
    private boolean LUMPED_COMPONENT_ONLY = false;

    @DescribedBy("")
    private double MASS_EXTINCTION_COEFFICIENT = 0;

    @DescribedBy("集总物质质量分数")
    private List<Double> massFraction; //MASS_FRACTION

    @DescribedBy("初始质量分数")
    private double massFraction0 = 0; //MASS_FRACTION_0

    @DescribedBy("平均直径——m")
    private double meanDiameter = 1.00E-06; //MEAN_DIAMETER

    @DescribedBy("融化温度——◦C")
    private double meltingTemperature; //MELTING_TEMPERATURE

    @DescribedBy("分子量——g/mol")
    private double mw = 29;//MW

    @DescribedBy("")
    private double PR_GAS;// PR

    @DescribedBy("")
    private boolean PRIMITIVE;

    @DescribedBy("辐射代替物")
    private String radcalId;//RADCAL_ID

    @DescribedBy("气体比热变化曲线")
    private String rampCp;//RAMP_CP

    @DescribedBy("液体比热变化曲线")
    private String rampCpL;//RAMP_CP_L

    @DescribedBy("扩散系数变化曲线")
    private String rampD;//RAMP_D

    @DescribedBy("")
    private String RAMP_G_F;

    @DescribedBy("")
    private String RAMP_K;

    @DescribedBy("粘度变化曲线")
    private String rampMu;//RAMP_MU

    @DescribedBy("气体参考热容量——kJ/kg")
    private double referenceEnthalpy; //REFERENCE_ENTHALPY

    @DescribedBy("气体参考温度——◦C")
    private double referenceTemperature = 25; //REFERENCE_TEMPERATURE

    @DescribedBy("Delta/Δδ")
    private double sigmalj = 0;//SIGMALJ

    @DescribedBy("集总物质名称")
    private List<String> specId;//SPEC_ID

    @DescribedBy("比热——kJ/(kg·K)")
    private double SPECIFIC_HEAT;

    @DescribedBy("液体比热——kJ/(kg·K)")
    private double specificHeatLiquid; //SPECIFIC_HEAT_LIQUID

    @DescribedBy("气化温度——◦C")
    private double vaporizationTemperature;//VAPORIZATION_TEMPERATURE

    @DescribedBy("粘度——kg/(m·s)")
    private double viscosity;//VISCOSITY

    @DescribedBy("集总物质体积分数")
    private List<Double> volumeFraction;//VOLUME_FRACTION


}
