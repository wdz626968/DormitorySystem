package com.ass.mapper;

import com.ass.domin.SOT;
import com.ass.domin.SOTlogin;

public interface SOTMapper {
    public  void  save(SOT sot);
    public  void  match(SOTlogin soTlogin);
}
