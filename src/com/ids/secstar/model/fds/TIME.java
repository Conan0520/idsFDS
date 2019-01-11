package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Time")
/**
 * define the time duration of the simulation and the initial time step used to advance the solution of the discretized equations.
 */
public class TIME extends Namelist {
    @DescribedBy("s")
    private double T_BEGIN = 0; // specify the time written to file for the first time step. This would be useful for matching time lines of experimental data or video recordings.

    @DescribedBy("s")
    private double T_END = 1; // the duration of the simulation, set to zero, only the set-up work is performed, allowing you to quickly check the geometry in Smokeview.

    @DescribedBy("s")
    private double DT; // the initial time step size

    @DescribedBy("")
    private boolean RESTRICT_TIME_STEP = true; // by default the time step is never allowed to increase above its initial value

    @DescribedBy("")
    private boolean LOCK_TIME_STEP = false; // True to prevent FDS from automatically changing the time step

    @DescribedBy("")
    private double TIME_SHRINK_FACTOR = 1; // Speeding up the time to Steady-State

    @DescribedBy("")
    private double LIMITING_DT_RATIO = 0.0001; // By default, the calculation is stopped when the time step drops below 0.0001 of the initial time step. This factor can be change via the TIME line by specifying the LIMITING_DT_RATIO.

    @DescribedBy("s")
    private double EVAC_DT_FLOWFIELD = 0.01;

    @DescribedBy("s")
    private double EVAC_DT_STEADY_STATE = 0.05;

    @DescribedBy("")
    private int WALL_INCREMENT = 2;

    public double getT_BEGIN() {
        return T_BEGIN;
    }

    public void setT_BEGIN(double t_BEGIN) {
        T_BEGIN = t_BEGIN;
    }

    public double getT_END() {
        return T_END;
    }

    public void setT_END(double t_END) {
        T_END = t_END;
    }

    public double getDT() {
        return DT;
    }

    public void setDT(double DT) {
        this.DT = DT;
    }

    public boolean isRESTRICT_TIME_STEP() {
        return RESTRICT_TIME_STEP;
    }

    public void setRESTRICT_TIME_STEP(boolean RESTRICT_TIME_STEP) {
        this.RESTRICT_TIME_STEP = RESTRICT_TIME_STEP;
    }

    public boolean isLOCK_TIME_STEP() {
        return LOCK_TIME_STEP;
    }

    public void setLOCK_TIME_STEP(boolean LOCK_TIME_STEP) {
        this.LOCK_TIME_STEP = LOCK_TIME_STEP;
    }

    public double getTIME_SHRINK_FACTOR() {
        return TIME_SHRINK_FACTOR;
    }

    public void setTIME_SHRINK_FACTOR(double TIME_SHRINK_FACTOR) {
        this.TIME_SHRINK_FACTOR = TIME_SHRINK_FACTOR;
    }

    public double getLIMITING_DT_RATIO() {
        return LIMITING_DT_RATIO;
    }

    public void setLIMITING_DT_RATIO(double LIMITING_DT_RATIO) {
        this.LIMITING_DT_RATIO = LIMITING_DT_RATIO;
    }

    public double getEVAC_DT_FLOWFIELD() {
        return EVAC_DT_FLOWFIELD;
    }

    public void setEVAC_DT_FLOWFIELD(double EVAC_DT_FLOWFIELD) {
        this.EVAC_DT_FLOWFIELD = EVAC_DT_FLOWFIELD;
    }

    public double getEVAC_DT_STEADY_STATE() {
        return EVAC_DT_STEADY_STATE;
    }

    public void setEVAC_DT_STEADY_STATE(double EVAC_DT_STEADY_STATE) {
        this.EVAC_DT_STEADY_STATE = EVAC_DT_STEADY_STATE;
    }

    public int getWALL_INCREMENT() {
        return WALL_INCREMENT;
    }

    public void setWALL_INCREMENT(int WALL_INCREMENT) {
        this.WALL_INCREMENT = WALL_INCREMENT;
    }
}
