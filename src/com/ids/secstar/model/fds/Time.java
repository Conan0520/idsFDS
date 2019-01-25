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
public class Time extends Namelist {
    @DescribedBy("模拟开始进行时间——s")
    private double tBegin = 0; // T_BEGIN

    @DescribedBy("模拟持续时间，设置为0直接运行模拟结果以便查看几何图形——s")
    private double tEnd = 1; // T_END

    @DescribedBy("初始时间步长——s")
    private double dt; // DT

    @DescribedBy("不允许时间步长超过其初始值")
    private boolean restrictTimeStep = true; //RESTRICT_TIME_STEP

    @DescribedBy("阻止FDS自动更改时间步长")
    private boolean lockTimeStep = false; // LOCK_TIME_STEP

    @DescribedBy("减少各种材料的比热倍数")
    private double TIME_SHRINK_FACTOR = 1; // Speeding up the time to Steady-State

    @DescribedBy("")
    private double LIMITING_DT_RATIO = 0.0001; // By default, the calculation is stopped when the time step drops below 0.0001 of the initial time step. This factor can be change via the Time line by specifying the LIMITING_DT_RATIO.

    @DescribedBy("s")
    private double EVAC_DT_FLOWFIELD = 0.01;

    @DescribedBy("s")
    private double EVAC_DT_STEADY_STATE = 0.05;

    @DescribedBy("壁增量")
    private int wallIncrement = 2; //WALL_INCREMENT

}
