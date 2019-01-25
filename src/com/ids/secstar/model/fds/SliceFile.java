package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Slice File")
public class SliceFile extends Namelist {

    @DescribedBy("以单元格为中心")
    private boolean cellCentered = false; //CELL_CENTERED

    @DescribedBy("")
    private boolean EVACUATION = false;

    @DescribedBy("")
    private double MAXIMUM_VALUE;

    @DescribedBy("")
    private int MESH_NUMBER;

    @DescribedBy("")
    private double MINIMUM_VALUE;

    @DescribedBy("")
    private String PART_ID;

    @DescribedBy("平面X,Y,Z方向的值——m")
    private double pbx, pby, pbz; //PBX,PBY,PBZ

    @DescribedBy("要测量的种类")
    private String quantity; //QUANTITY

    @DescribedBy("")
    private String QUANTITY2;

    @DescribedBy("")
    private String SPEC_ID;

    @DescribedBy("是否使用矢量")
    private boolean vector = false; //VECTOR

    @DescribedBy("")
    private int VELO_INDEX = 0;

    @DescribedBy("切面在3维面的大小位置m")
    private double[] xb = new double[6]; //XB


}
