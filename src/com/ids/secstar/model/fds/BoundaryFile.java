package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Boundary File")
public class BoundaryFile extends Namelist {

    @DescribedBy("是否以房间为中心")
    private boolean CELL_CENTERED = false;

    @DescribedBy("粒子类型")
    private String partId; //PART_ID

    @DescribedBy("设备特性")
    private String PROP_ID;

    @DescribedBy("输出的类型")
    private String quantity; //QUANTITY

    @DescribedBy("物质类型")
    private String specId; //SPEC_ID

    @DescribedBy("统计")
    private String STATISTICS;


}
