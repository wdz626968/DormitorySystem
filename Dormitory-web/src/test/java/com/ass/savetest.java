package com.ass;


import com.ass.mapper.DormitoryMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.ass.domin.Dormitory;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class savetest{
    @Autowired
    private DormitoryMapper dormitoryMapper;
    @Test
    public  void test(){
        Dormitory dormitory=new Dormitory(true,"厦门大学","17859753244",1000,"123123",true);
        dormitoryMapper.save(dormitory);
    }
}
