package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Mesh")
public class Mesh extends Namelist {


    @DescribedBy("范围大小")
    private double[] xb = new double[]{0, 1, 0, 1, 0, 1}; //XB

    @DescribedBy("各轴的网格数量")
    private int[] ijk = new int[]{10, 10, 10}; //IJK

    @DescribedBy("圆柱形")
    private boolean CYLINDRICAL = false;

    @DescribedBy("颜色")
    private String color = "BLACK"; // color

    @DescribedBy("颜色")
    private int[] rgb = new int[]{0, 0, 0}; // RGB

    @DescribedBy("疏散")
    private boolean EVACUATION = false;

    @DescribedBy("疏散人员")
    private boolean EVAC_HUMANS = false;

    @DescribedBy("	m	")
    private double EVAC_Z_OFFSET = 1;

    @DescribedBy("编号")
    private String ID;

    @DescribedBy("级别")
    private int LEVEL = 0;

    @DescribedBy("分配网格给指定进程")
    private int MPI_PROCESS;

    @DescribedBy("线程数")
    private int N_THREADS;

    @DescribedBy("")
    private String MULT_ID;




}
