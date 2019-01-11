package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Boundary File")
public class BNDF extends Namelist {
    private boolean CELL_CENTERED = false;
    private String PART_ID;
    private String PROP_ID;
    private String QUANTITY;
    private String SPEC_ID;
    private String STATISTICS;
}
