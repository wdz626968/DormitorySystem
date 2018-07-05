package com.ass.sevice.Impl;

import com.ass.domin.SOT;
import com.ass.domin.SOTlogin;
import com.ass.domin.customer;
import com.ass.mapper.CustomerMapper;
import com.ass.mapper.SOTMapper;
import com.ass.sevice.CustomerSave;
import com.ass.sevice.SOTSave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SOTSaveImpl implements SOTSave {
    @Autowired
    private SOTMapper sotMapper;

    @Override
    public void save(SOT sot) {
        sotMapper.save(sot);
    }

    @Override
    public void match(SOTlogin soTlogin) {
        sotMapper.match( soTlogin);
    }
}
