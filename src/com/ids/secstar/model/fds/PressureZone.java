package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Pressure Zone")
public class PressureZone extends Namelist {
    @DescribedBy("压力区域名称")
    private String id; //ID

    @DescribedBy("颜色")
    private String color ; //COLOR

    @DescribedBy("颜色")
    private int[] rgb = new int[]{0, 0, 0}; //RGB

    @DescribedBy("泄露面积")
    private double leakArea; //LEAK_AREA

    @DescribedBy("范围大小")
    private double[] xb; //XB


}
