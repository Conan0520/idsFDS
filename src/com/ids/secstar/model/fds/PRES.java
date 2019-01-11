package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;
import com.ids.secstar.model.fds.type.PressureSolver;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Pressure Solver")
public class PRES extends Namelist {
    @DescribedBy("m/s")
    private double VELOCITY_TOLERANCE; // the maximum allowable normal velocity component on the solid boundary or the largest error at a mesh interface
    @DescribedBy("")
    private int MAX_PRESSURE_ITERATIONS = 10; // The maximum number of iterations for each half of the time step
    @DescribedBy("s")
    private double ITERATION_SUSPEND_FACTOR = 0.95; // suspend the pressure iterations if the error does not drop below ITERATION_SUSPEND_FACTOR (0.95, by default) of its previous value
    @DescribedBy("")
    private boolean SUSPEND_PRESSURE_ITERATIONS = true;// True to enable FDS to suspend the pressure iteration
    @DescribedBy("")
    private boolean CHECK_POISSON = false; // True to check that the left-hand and right-hand sides of the Poisson equation for H are equivalent
    @DescribedBy("")
    private PressureSolver SOLVER = PressureSolver.FFT;
    @DescribedBy("")
    private int[] FISHPAK_BC = new int[3]; //  to implement true periodic boundaries for a single mesh case, set the appropriate FISHPAK_BC value to zero.
    @DescribedBy("")
    private double RELAXATION_FACTOR = 1; // When there is an error in the normal component of velocity at a solid boundary, this parameter dictates that the correction be applied in 1 time step. If its value were 0.5, the correction would be applied in 2 time steps.
    @DescribedBy("s")
    private double PRESSURE_RELAX_TIME = 1; // controls the rate at which the pressures in adjacent compartments are brought into equilibrium following a breach. Its default value is 1 s, meaning that equilibrium is achieved in roughly a second.
    @DescribedBy("m/s2")
    private double PRESSURE_TOLERANCE; // Reduce the value of PRESSURE_TOLERANCE on the PRES line to alleviate the mismatch between old and new pressure fields.
}
