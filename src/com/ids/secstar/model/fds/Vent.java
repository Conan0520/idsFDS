package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Vent")
public class Vent extends Namelist {

    @DescribedBy("名称")
    private String id; //ID

    @DescribedBy("颜色")
    private String color; //COLOR

    @DescribedBy("控制功能")
    private String ctrlId; //CTRL_ID

    @DescribedBy("设备控制逻辑")
    private String devcId; //DEVC_ID

    @DescribedBy("Pa")
    private double DYNAMIC_PRESSURE = 0;

    @DescribedBy("")
    private boolean EVACUATION = false;

    @DescribedBy("几何平面X,Y,Z方向的值")
    private int ior; //IOR

    @DescribedBy("m")
    private double L_EDDY = 0;

    @DescribedBy("m")
    private double[] L_EDDY_IJ = new double[9];

    @DescribedBy("")
    private String MB;

    @DescribedBy("")
    private String MESH_ID;

    @DescribedBy("")
    private String MULT_ID;

    @DescribedBy("")
    private int N_EDDY = 0;

    @DescribedBy("")
    private String OBST_ID;

    @DescribedBy("只显示轮廓")
    private boolean outline = false; //OUTLINE

    @DescribedBy("")
    private double PBX, PBY, PBZ;

    @DescribedBy("")
    private String PRESSURE_RAMP;

    @DescribedBy("圆形半径")
    private double radius;//RADIUS

    @DescribedBy("m2/s2")
    private double[] REYNOLDS_STRESS = new double[9];

    @DescribedBy("颜色")
    private int[] rgb = new int[3]; //RGB

    @DescribedBy("m/s")
    private double SPREAD_RATE = 0.05;

    @DescribedBy("表面特性")
    private String surfId = "INERT"; //SURF_ID

    @DescribedBy("纹理偏移——m")
    private double[] textureOrigin = new double[]{0., 0., 0.}; //TEXTURE_ORIGIN

    @DescribedBy("◦C")
    private double TMP_EXTERIOR;

    @DescribedBy("")
    private String TMP_EXTERIOR_RAMP;

    @DescribedBy("透明度")
    private double transparency = 1; //TRANSPARENCY

    @DescribedBy("")
    private double[] UVW = new double[3];

    @DescribedBy("m/s")
    private double VEL_RMS = 0;

    @DescribedBy("范围大小——m")
    private double[] xb = new double[6]; //XB

    @DescribedBy("圆形的中心点——m")
    private double[] xyz = new double[3]; //XYZ


}
