package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Output")
public class Output extends Namelist {

    private boolean CLIP_RESTART_FILES = true;

    @DescribedBy("将文本输出限制在255列")
    private boolean columnDumpLimit = false; //COLUMN_DUMP_LIMIT

    private int CTRL_COLUMN_LIMIT = 254;

    private int DEVC_COLUMN_LIMIT = 254;

    @DescribedBy("边界条件写入时间间隔——s")
    private double dtBndf;//DT_BNDF

    @DescribedBy("s")
    private double DT_CPU = 1000000;

    @DescribedBy("s")
    private double DT_CTRL;//

    @DescribedBy("设备参数写入时间间隔——s")
    private double dt_devc;//DT_DEVC

    @DescribedBy("s")
    private double DT_DEVC_LINE;//∆t/2

    @DescribedBy("s")
    private double DT_FLUSH;//∆t/NFRAMES

    @DescribedBy("放热率写入时间间隔——s")
    private double dtHrr;//DT_HRR

    @DescribedBy("等值面写入时间间隔——s")
    private double dtIsof;//DT_ISOF

    @DescribedBy("气体质量写入时间间隔——s")
    private double dtMass;//DT_MASS

    @DescribedBy("粒子写入时间间隔——s")
    private double dtPart;//DT_PART

    @DescribedBy("s")
    private double DT_PL3D = 1.00E+10;

    @DescribedBy("轮廓写入时间间隔——s")
    private double dtProf;//DT_PROF

    @DescribedBy("重新启动时间间隔——s")
    private double dtRestart = 1000000; //DT_RESTART

    @DescribedBy("3D切片写入时间间隔——s")
    private double dtSl3d;//DT_SL3D

    @DescribedBy("2D切片写入时间间隔——s")
    private double dtSlcf;//DT_SLCF

    private boolean EB_PART_FILE = false;

    private boolean FLUSH_FILE_BUFFERS = true;

    @DescribedBy("写入气体种类质量文件")
    private boolean massFile = false; //MASS_FILE

    @DescribedBy("每个网格的最大粒子数")
    private int maximumParticles = 1000000; //MAXIMUM_PARTICLES

    @DescribedBy("输出数据帧数")
    private int nframes = 1000; //NFRAMES

    private String[] PLOT3D_PART_ID = new String[5];

    private String[] PLOT3D_QUANTITY = new String[5];

    private String[] PLOT3D_SPEC_ID = new String[5];

    private int[] PLOT3D_VELO_INDEX = new int[5];

    private String RENDER_FILE;

    private int SIG_FIGS = 8;

    private int SIG_FIGS_EXP = 3;

    private boolean SMOKE3D = true;

    @DescribedBy("可视化类型")
    private String smoke3dQuantity; //SMOKE3D_QUANTITY

    @DescribedBy("可视化物质类型")
    private String smoke3dSpecId; //SMOKE3D_SPEC_ID

    private boolean STATUS_FILES = false;

    @DescribedBy("禁止诊断")
    private boolean suppressDiagnostics = false; //SUPPRESS_DIAGNOSTICS

    private double T_DEVC_LINE_END;//T_END

    private double[] UVW_TIMER = new double[10];

    private boolean VELOCITY_ERROR_FILE = false;

    private boolean WRITE_XYZ = false;


}
