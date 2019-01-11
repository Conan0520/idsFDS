package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Multiplier Function")
public class MULT extends Namelist {
    @DescribedBy("m")
    private double DX = 0; //	Spacing in the x direction
    @DescribedBy("m")
    private double[] DXB = new double[6]; //	Spacing for all 6 coordinates
    @DescribedBy("m")
    private double DX0 = 0; //	Translation in the x direction
    @DescribedBy("m")
    private double DY = 0; //	Spacing in the y direction
    @DescribedBy("m")
    private double DY0 = 0; //	Translation in the y direction
    @DescribedBy("m")
    private double DZ = 0; //	Spacing in the z direction
    @DescribedBy("m")
    private double DZ0 = 0; //	Translation in the z direction
    @DescribedBy("")
    private String ID; //	Identification tag
    @DescribedBy("")
    private int I_LOWER = 0; //	Lower array bound, x direction
    @DescribedBy("")
    private int I_LOWER_SKIP; //	Lower array bound begin skip, x direction
    @DescribedBy("")
    private int I_UPPER = 0; //	Upper array bound, x direction
    @DescribedBy("")
    private int I_UPPER_SKIP; //	Upper array bound end skip, x direction
    @DescribedBy("")
    private int J_LOWER = 0; //	Lower array bound, y direction
    @DescribedBy("")
    private int J_LOWER_SKIP; //	Lower array bound begin skip, y direction
    @DescribedBy("")
    private int J_UPPER = 0; //	Upper array bound, y direction
    @DescribedBy("")
    private int J_UPPER_SKIP; //	Upper array bound end skip, y direction
    @DescribedBy("")
    private int K_LOWER = 0; //	Lower array bound, z direction
    @DescribedBy("")
    private int K_LOWER_SKIP; //	Lower array bound begin skip, z direction
    @DescribedBy("")
    private int K_UPPER = 0; //	Upper array bound, z direction
    @DescribedBy("")
    private int K_UPPER_SKIP; //	Upper array bound end skip, z direction
    @DescribedBy("")
    private int N_LOWER = 0; //	Lower sequence bound
    @DescribedBy("")
    private int N_LOWER_SKIP; //	Lower sequence bound begin skip
    @DescribedBy("")
    private int N_UPPER = 0; //	Upper sequence bound
    @DescribedBy("")
    private int N_UPPER_SKIP; //	Upper sequence bound end skip

}
