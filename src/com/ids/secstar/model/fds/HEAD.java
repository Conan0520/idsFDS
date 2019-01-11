package com.ids.secstar.model.fds;

import com.ids.secstar.model.annotations.DescribedBy;
import com.ids.secstar.model.annotations.SecAnnotated;

/**
 * Created by Xinlu on 2018/12/19.
 */

@SecAnnotated
@DescribedBy("Header")
public class HEAD extends Namelist {
    @DescribedBy("")
    private String CHID = "output"; // a string of 40 characters or less used to tag the output files.

    @DescribedBy("")
    private String TITLE; // a string of 256 characters or less that describes the simulation.

    public String getCHID() {
        return CHID;
    }

    public void setCHID(String CHID) {
        this.CHID = CHID;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }
}
