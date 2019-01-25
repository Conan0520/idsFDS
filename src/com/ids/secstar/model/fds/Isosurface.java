package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

import java.util.List;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Isosurface")
public class Isosurface extends Namelist {

    @DescribedBy("等值面输出类型")
    private String quantity; //QUANTITY

    private int REDUCE_TRIANGLES = 1;

    @DescribedBy("物质类型")
    private String specId; //SPEC_ID

    @DescribedBy("物质等值面的值")
    private List<Double> value; //VALUE

    @DescribedBy("速度指数")
    private int veloIndex = 0; //VELO_INDEX
}
