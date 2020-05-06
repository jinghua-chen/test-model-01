package cn.kgc.mapper;

import cn.kgc.entity.Student;
import com.baomidou.mybatisplus.mapper.BaseMapper;

public interface StudentMapper extends BaseMapper<Student> {

    //之前Mybatis需要在xml中进行配置的SQL语句，
    //现在Mybatis-Plus通过扩展AutoSqlInjector 在加载mybatis 环境时就注入
    public void deleteAll();

}
