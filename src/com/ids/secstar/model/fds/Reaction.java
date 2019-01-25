package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

import java.util.List;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Reaction")
public class Reaction extends Namelist {

    @DescribedBy("")
    private double A;

    @DescribedBy("自燃温度——◦C")
    private double autoIgnitionTemperature; //AUTO_IGNITION_TEMPERATURE

    @DescribedBy("碳原子")
    private double c = 0; //C

    @DescribedBy("")
    private boolean CHECK_ATOM_BALANCE = true;

    @DescribedBy("一氧化碳产量——kg/kg")
    private double coYield = 0; //CO_YIELD

    @DescribedBy("火焰临界温度——◦C")
    private double criticalFlameTemperature = 1427; //CRITICAL_FLAME_TEMPERATURE

    @DescribedBy("kJ/kmol")
    private double E;

    @DescribedBy("每单位质量氧气释放量——kJ/kg")
    private double epumo2 = 13100; //EPUMO2

    @DescribedBy("")
    private String EQUATION;

    @DescribedBy("化学式")
    private String formula;//FORMULA

    @DescribedBy("燃料类型")
    private String fuel;//FUEL

    @DescribedBy("")
    private String FUEL_RADCAL_ID;

    @DescribedBy("氢原子")
    private double h = 0;//H

    @DescribedBy("燃烧产生的热量——kJ/kg")
    private double heatOfCombustion; //HEAT_OF_COMBUSTION

    @DescribedBy("反应编号")
    private String id; //ID

    @DescribedBy("理想的能量释放")
    private boolean ideal = false;//IDEAL

    @DescribedBy("mol/mol")
    private double LOWER_OXYGEN_LIMIT;

    @DescribedBy("氮原子")
    private double n = 0;//N

    @DescribedBy("化学计量系数中物质的含量")
    private List<Double> nu; //NU

    @DescribedBy("")
    private List<Double> N_S;

    @DescribedBy("")
    private double N_T;

    @DescribedBy("氧原子")
    private double o = 0;//O

    @DescribedBy("")
    private int PRIORITY = 1;

    @DescribedBy("辐射量")
    private double radiativeFraction; //RADIATIVE_FRACTION

    @DescribedBy("")
    private String RAMP_CHI_R;

    @DescribedBy("atoms")
    private double REAC_ATOM_ERROR = 1.00E-05;

    @DescribedBy("kg/kg ")
    private double REAC_MASS_ERROR = 1.00E-04;

    @DescribedBy("氢产量")
    private double sootHFraction = 0.1; //SOOT_H_FRACTION

    @DescribedBy("烟雾产量——kg/kg")
    private double sootYield = 0; //SOOT_YIELD

    @DescribedBy("")
    private List<String> SPEC_ID_N_S;

    @DescribedBy("化学计量系数中的物质")
    private List<String> specIdNu; //SPEC_ID_NU

}
