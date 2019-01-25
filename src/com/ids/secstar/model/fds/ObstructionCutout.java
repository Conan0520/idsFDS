package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Obstruction Cutout")
public class ObstructionCutout extends Namelist {

    @DescribedBy("编号")
    private String id; //ID

    @DescribedBy("范围大小——m")
    private double[] xb = new double[6]; //XB

    @DescribedBy("颜色")
    private String color; //COLOR

    @DescribedBy("颜色")
    private int rgb[] = new int[3]; //RGB

    @DescribedBy("透明度")
    private double transparency; //TRANSPARENCY

    @DescribedBy("")
    private boolean BLOCK_WIND = false;

    @DescribedBy("控制逻辑")
    private String ctrlId; //CTRL_ID

    @DescribedBy("设备控制逻辑")
    private String devcId; //DEVC_ID

    @DescribedBy("")
    private boolean EVACUATION;

    @DescribedBy("")
    private String MESH_ID;

    @DescribedBy("")
    private String MULT_ID;



}
