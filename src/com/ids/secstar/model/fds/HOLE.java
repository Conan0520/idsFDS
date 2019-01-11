package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Obstruction Cutout")
public class HOLE extends Namelist {
    @DescribedBy("")
    private String ID;
    @DescribedBy("m")
    private double[] XB = new double[6];
    @DescribedBy("")
    private String COLOR;
    @DescribedBy("")
    private int RGB[] = new int[3];
    @DescribedBy("")
    private double TRANSPARENCY;
    @DescribedBy("")
    private boolean BLOCK_WIND = false;
    @DescribedBy("")
    private String CTRL_ID;
    @DescribedBy("")
    private String DEVC_ID;
    @DescribedBy("")
    private boolean EVACUATION;
    @DescribedBy("")
    private String MESH_ID;
    @DescribedBy("")
    private String MULT_ID;


}
