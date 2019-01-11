package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Vent")
public class VENT extends Namelist {
    @DescribedBy("")
    private String ID;
    @DescribedBy("")
    private String COLOR;
    @DescribedBy("")
    private String CTRL_ID;
    @DescribedBy("")
    private String DEVC_ID;
    @DescribedBy("Pa")
    private double DYNAMIC_PRESSURE = 0;
    @DescribedBy("")
    private boolean EVACUATION = false;
    @DescribedBy("")
    private int IOR;
    @DescribedBy("m")
    private double L_EDDY = 0;
    @DescribedBy("m")
    private double[] L_EDDY_IJ = new double[9];
    @DescribedBy("")
    private String MB;
    @DescribedBy("")
    private String MESH_ID;
    @DescribedBy("")
    private String MULT_ID;
    @DescribedBy("")
    private int N_EDDY = 0;
    @DescribedBy("")
    private String OBST_ID;
    @DescribedBy("")
    private boolean OUTLINE = false;
    @DescribedBy("")
    private double PBX, PBY, PBZ;
    @DescribedBy("")
    private String PRESSURE_RAMP;
    @DescribedBy("m2/s2")
    private double[] REYNOLDS_STRESS = new double[9];
    @DescribedBy("")
    private int[] RGB = new int[3];
    @DescribedBy("m/s")
    private double SPREAD_RATE = 0.05;
    @DescribedBy("")
    private String SURF_ID = "INERT";
    @DescribedBy("m")
    private double[] TEXTURE_ORIGIN = new double[]{0., 0., 0.};
    @DescribedBy("◦C")
    private double TMP_EXTERIOR;
    @DescribedBy("")
    private String TMP_EXTERIOR_RAMP;
    @DescribedBy("")
    private double TRANSPARENCY = 1;
    @DescribedBy("")
    private double[] UVW = new double[3];
    @DescribedBy("m/s")
    private double VEL_RMS = 0;
    @DescribedBy("m")
    private double[] XB = new double[6];
    @DescribedBy("m")
    private double[] XYZ = new double[3];

}
