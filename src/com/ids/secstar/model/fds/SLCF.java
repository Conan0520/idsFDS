package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Slice File")
public class SLCF extends Namelist {
    @DescribedBy("")
    private boolean CELL_CENTERED = false;
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
    @DescribedBy("m")
    private double PBX, PBY, PBZ;
    @DescribedBy("")
    private String QUANTITY;
    @DescribedBy("")
    private String QUANTITY2;
    @DescribedBy("")
    private String SPEC_ID;
    @DescribedBy("")
    private boolean VECTOR = false;
    @DescribedBy("")
    private int VELO_INDEX = 0;
    @DescribedBy("m")
    private double[] XB = new double[6];

}
