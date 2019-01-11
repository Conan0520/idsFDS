package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Output")
public class DUMP extends Namelist {
    private boolean CLIP_RESTART_FILES = true;
    private boolean COLUMN_DUMP_LIMIT = false;
    private int CTRL_COLUMN_LIMIT = 254;
    private int DEVC_COLUMN_LIMIT = 254;
    @DescribedBy("s")
    private double DT_BNDF;//2∆t/NFRAMES
    @DescribedBy("s")
    private double DT_CPU = 1000000;
    @DescribedBy("s")
    private double DT_CTRL;//∆t/NFRAMES
    @DescribedBy("s")
    private double DT_DEVC;//∆t/NFRAMES
    @DescribedBy("s")
    private double DT_DEVC_LINE;//∆t/2
    @DescribedBy("s")
    private double DT_FLUSH;//∆t/NFRAMES
    @DescribedBy("s")
    private double DT_HRR;//∆t/NFRAMES
    @DescribedBy("s")
    private double DT_ISOF;//∆t/NFRAMES
    @DescribedBy("s")
    private double DT_MASS;//∆t/NFRAMES
    @DescribedBy("s")
    private double DT_PART;//∆t/NFRAMES
    @DescribedBy("s")
    private double DT_PL3D = 1.00E+10;
    @DescribedBy("s")
    private double DT_PROF;//∆t/NFRAMES
    @DescribedBy("s")
    private double DT_RESTART = 1000000;
    @DescribedBy("s")
    private double DT_SL3D;//∆t/5
    @DescribedBy("s")
    private double DT_SLCF;//∆t/NFRAMES
    private boolean EB_PART_FILE = false;
    private boolean FLUSH_FILE_BUFFERS = true;
    private boolean MASS_FILE = false;
    private int MAXIMUM_PARTICLES = 1000000;
    private int NFRAMES = 1000;
    private String[] PLOT3D_PART_ID = new String[5];
    private String[] PLOT3D_QUANTITY = new String[5];
    private String[] PLOT3D_SPEC_ID = new String[5];
    private int[] PLOT3D_VELO_INDEX = new int[5];
    private String RENDER_FILE;
    private int SIG_FIGS = 8;
    private int SIG_FIGS_EXP = 3;
    private boolean SMOKE3D = true;
    private String SMOKE3D_QUANTITY;
    private String SMOKE3D_SPEC_ID;
    private boolean STATUS_FILES = false;
    private boolean SUPPRESS_DIAGNOSTICS = false;
    private double T_DEVC_LINE_END;//T_END
    private double[] UVW_TIMER = new double[10];
    private boolean VELOCITY_ERROR_FILE = false;
    private boolean WRITE_XYZ = false;


}
