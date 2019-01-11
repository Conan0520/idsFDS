package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Mesh")
public class MESH extends Namelist {
    @DescribedBy("m")
    private double[] XB = new double[]{0, 1, 0, 1, 0, 1}; // a single right parallelepiped, i.e., a box.

    @DescribedBy("")
    private int[] IJK = new int[]{10, 10, 10}; // mesh is subdivided into uniform cells

    @DescribedBy("")
    private boolean CYLINDRICAL = false; // axial symmetry

    @DescribedBy("")
    private String COLOR = "BLACK"; //  assign them colors using either the character string COLOR or the integer triplet RGB

    @DescribedBy("")
    private int[] RGB = new int[]{0, 0, 0};

    @DescribedBy("")
    private boolean EVACUATION = false;

    @DescribedBy("")
    private boolean EVAC_HUMANS = false;

    @DescribedBy("	m	")
    private double EVAC_Z_OFFSET = 1;

    @DescribedBy("")
    private String ID;

    @DescribedBy("")
    private int LEVEL = 0;

    @DescribedBy("")
    private int MPI_PROCESS;

    @DescribedBy("")
    private int N_THREADS;

    @DescribedBy("")
    private String MULT_ID;




}
