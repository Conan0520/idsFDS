package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

import java.util.List;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Isosurface")
public class ISOF extends Namelist {
    private String QUANTITY;
    private int REDUCE_TRIANGLES = 1;
    private String SPEC_ID;
    private List<Double> VALUE;
    private int VELO_INDEX = 0;
}
