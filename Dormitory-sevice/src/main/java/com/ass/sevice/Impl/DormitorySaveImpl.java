package com.ass.sevice.Impl;

import com.ass.domin.Dormitory;
import com.ass.mapper.DormitoryMapper;
import com.ass.sevice.DormitorySave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DormitorySaveImpl implements DormitorySave {
    @Autowired
    private DormitoryMapper dormitoryMapper;

    public void save(Dormitory dormitory) {
        dormitoryMapper.save(dormitory);
    }
}
