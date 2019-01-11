package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

import java.util.List;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Obstruction")
public class OBST extends Namelist {
    @DescribedBy("")
    private String ID;
    @DescribedBy("m")
    private double[] XB = new double[6];
    @DescribedBy("")
    private String SURF_ID;
    @DescribedBy("")
    private String[] SURF_ID6 = new String[6];
    @DescribedBy("")
    private String[] SURF_IDS = new String[3];
    @DescribedBy("")
    private boolean THICKEN = false; // Obstructions can have zero thickness
    @DescribedBy("")
    private boolean OVERLAY = true;// Overlapping Obstructions
    @DescribedBy("")
    private boolean PERMIT_HOLE = true; // an obstruction is assumed to be penetrable unless otherwise directed. False If an obstruction is not to be punctured by a HOLE
    @DescribedBy("")
    private boolean ALLOW_VENT = true; // False to allow a VENT to be attached to a particular obstruction
    @DescribedBy("")
    private double TRANSPARENCY = 1; // with 0 being fully transparent
    @DescribedBy("")
    private String COLOR; // set COLOR="INVISIBLE", obstruction to be invisible
    @DescribedBy("")
    private int[] RGB = new int[3];
    @DescribedBy("")
    private List<Boolean> BNDF_FACE; // true
    @DescribedBy("")
    private boolean BNDF_OBST = true;
    @DescribedBy("kg/m3")
    private double BULK_DENSITY;

    @DescribedBy("")
    private String CTRL_ID;
    @DescribedBy("")
    private String DEVC_ID;
    @DescribedBy("")
    private boolean EVACUATION = false;
    @DescribedBy("m")
    private double HEIGHT;
    @DescribedBy("")
    private boolean HT3D = false;

    @DescribedBy("")
    private String MESH_ID;
    @DescribedBy("")
    private String MULT_ID;
    @DescribedBy("m")
    private double[] ORIENTATION = new double[]{0., 0., 1.};
    @DescribedBy("")
    private boolean OUTLINE = false;


    @DescribedBy("")
    private String PROP_ID;
    @DescribedBy("")
    private int PYRO3D_IOR = 0;
    @DescribedBy("m")
    private double RADIUS;
    @DescribedBy("")
    private boolean REMOVABLE = true;

    @DescribedBy("")
    private String SHAPE;

    @DescribedBy("m")
    private double[] TEXTURE_ORIGIN = new double[]{0., 0., 0.};



    @DescribedBy("m")
    private double[] XYZ = new double[]{0., 0., 0.};

}
