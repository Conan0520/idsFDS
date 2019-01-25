package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

import java.util.List;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Material")
public class Material extends Namelist {

    @DescribedBy("指前因子——1/s")
    private List<Double> a; //A

    @DescribedBy("吸收系数——1/m")
    private double absorptionCoefficient = 50000; //ABSORPTION_COEFFICIENT

    @DescribedBy("允许收缩")
    private boolean ALLOW_SHRINKING = true;

    @DescribedBy("允许膨胀")
    private boolean ALLOW_SWELLING = true;

    @DescribedBy("沸腾温度——◦C")
    private double boilingTemperature = 5000; //BOILING_TEMPERATURE

    @DescribedBy("热传导率——W/(m·K)")
    private double conductivity = 0; //CONDUCTIVITY

    @DescribedBy("热导率曲线")
    private String conductivityRamp; //CONDUCTIVITY_RAMP

    @DescribedBy("密度——kg/m3")
    private double density = 0; //DENSITY

    @DescribedBy("扩散系数——m2/2")
    private double DIFFUSIVITY_SPEC;

    @DescribedBy("活化能量——kJ/kmol")
    private List<Double> e; //E

    @DescribedBy("发射率")
    private double emissivity = 0.9; //EMISSIVITY

    @DescribedBy("气体扩散深度——m")
    private List<Double> GAS_DIFFUSION_DEPTH; // 0.001

    @DescribedBy("加热速率——◦C/min")
    private List<Double> heatingRate; // 5 HEATING_RATE

    @DescribedBy("燃烧产生的热量——kJ/kg")
    private List<Double> heatOfCombustion; //HEAT_OF_COMBUSTION

    @DescribedBy("反应产生的热量——kJ/kg")
    private List<Double> heatOfReaction;// 0 HEAT_OF_REACTION

    @DescribedBy("ID")
    private String ID;

    @DescribedBy("材质")
    private String matlId; //MATL_ID

    @DescribedBy("材质在反应中所占的比例——kg/kg")
    private List<Double> nuMatl;//0 NU_MATL

    @DescribedBy("物质中反应中所占的比例")
    private List<Double> nuSpec;//	0 NU_SPEC

    @DescribedBy("反应数量")
    private int nReactions = 0; //N_REACTIONS

    @DescribedBy("")
    private List<Double> N_O2; //0

    @DescribedBy("质量指数")
    private List<Double> ns; // 1 N_S

    @DescribedBy("临界温度指数")
    private List<Double> nt; //0 N_T

    @DescribedBy("")
    private List<Boolean> PCR; // FALSE

    @DescribedBy("热解范围——◦C")
    private List<Double> pyrolysisRange; //80 PYROLYSIS_RANGE

    @DescribedBy("参考速率——1/s")
    private List<Double> REFERENCE_RATE;

    @DescribedBy("参考温度——◦C")
    private List<Double> referenceTemperature; //REFERENCE_TEMPERATURE

    @DescribedBy("比热——kJ/(kg·K)")
    private double specificHeat = 0; //SPECIFIC_HEAT

    @DescribedBy("比热容曲线")
    private String specificHeatRamp; //SPECIFIC_HEAT_RAMP

    @DescribedBy("物质类型")
    private String specId; //SPEC_ID

    @DescribedBy("临界征兆")
    private List<Double> THRESHOLD_SIGN; //1
    
    @DescribedBy("临界温度——◦C")
    private List<Double> thresholdTemperature;// -273.15 THRESHOLD_TEMPERATURE
}
