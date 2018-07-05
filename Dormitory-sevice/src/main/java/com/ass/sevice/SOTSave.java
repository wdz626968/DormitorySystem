package com.ass.sevice;

import com.ass.domin.SOT;
import com.ass.domin.SOTlogin;

public interface SOTSave {
    public  void save(SOT sot);
    public void match(SOTlogin soTlogin);
}
