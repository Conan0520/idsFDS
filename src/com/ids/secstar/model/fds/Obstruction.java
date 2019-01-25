package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

import java.util.List;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Obstruction")
public class Obstruction extends Namelist {
    @DescribedBy("编号")
    private String id; //ID

    @DescribedBy("范围大小——m")
    private double[] xb = new double[6]; //XB

    @DescribedBy("障碍物表面")
    private String surfId; //SURF_ID

    @DescribedBy("障碍物左、右、后、前、下、上表面")
    private String[] surfId6 = new String[6]; //SURF_ID6

    @DescribedBy("障碍物上表面、四周表面、下表面")
    private String[] surfIds = new String[3]; //SURF_IDS

    @DescribedBy("加厚")
    private boolean thicken = false; //THICKEN

    @DescribedBy("重叠")
    private boolean OVERLAY = true;// Overlapping Obstructions

    @DescribedBy("允许开孔/穿透")
    private boolean permitHole = true; //PERMIT_HOLE

    @DescribedBy("允许存在通风口")
    private boolean allowVent = true; //ALLOW_VENT

    @DescribedBy("透明度")
    private double transparency = 1; //TRANSPARENCY

    @DescribedBy("颜色")
    private String color; // COLOR

    @DescribedBy("颜色")
    private int[] rgb = new int[3]; //RGB

    @DescribedBy("")
    private List<Boolean> BNDF_FACE; // true

    @DescribedBy("允许记录在输出边界文件中")
    private boolean bndfObst = true; //BNDF_OBST

    @DescribedBy("体积密度——kg/m3")
    private double bulkDensity; //BULK_DENSITY


    @DescribedBy("")
    private String CTRL_ID;

    @DescribedBy("设备控制逻辑")
    private String devcId; //DEVC_ID

    @DescribedBy("")
    private boolean EVACUATION = false;

    @DescribedBy("高度——m")
    private double HEIGHT;

    @DescribedBy("")
    private boolean HT3D = false;

    @DescribedBy("")
    private String MESH_ID;

    @DescribedBy("")
    private String MULT_ID;

    @DescribedBy("m")
    private double[] ORIENTATION = new double[]{0., 0., 1.};

    @DescribedBy("只显示线条")
    private boolean outline = false; //OUTLINE

    @DescribedBy("")
    private String PROP_ID;

    @DescribedBy("")
    private int PYRO3D_IOR = 0;

    @DescribedBy("m")
    private double RADIUS;

    @DescribedBy("可拆卸，使对象可以通过激活事件或BURN_AWAY曲面选项从模拟中删除。")
    private boolean removable = true; //REMOVABLE

    @DescribedBy("")
    private String SHAPE;

    @DescribedBy("基于默认纹理源点进行偏移——m")
    private double[] textureOrigin = new double[]{0., 0., 0.}; //TEXTURE_ORIGIN

    @DescribedBy("m")
    private double[] XYZ = new double[]{0., 0., 0.};

}
