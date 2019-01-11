package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("MESH Transformations")
public class TRN extends Namelist {
    @DescribedBy("m")
    private double CC;

    @DescribedBy("")
    private double PC;

    @DescribedBy("")
    private int IDERIV; //

    @DescribedBy("")
    private int MESH_NUMBER; // which mesh to apply the transformation. If you want the transformation to be applied to all meshes, set MESH_NUMBER to 0

}
