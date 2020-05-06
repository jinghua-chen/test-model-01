package cn.kgc.handler;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

public class MyHandler extends MetaObjectHandler {
    /**
     * 插入操作自动填充
     */
    public void insertFill(MetaObject metaObject) {
        //获取到需要被填充的字段值
        Object valByName = getFieldValByName("name", metaObject);
        if (valByName == null) {
            System.out.println("******插入操作 满足填充条件*******");
            setFieldValByName("name", "自动填充的值", metaObject);
        }
    }

    /**
     * 修改操作自动填充
     */
    public void updateFill(MetaObject metaObject) {
        Object valByName = getFieldValByName("name", metaObject);
        if (valByName == null) {
            System.out.println("******插入操作 满足填充条件*******");
            setFieldValByName("name", "修改填充的值", metaObject);
        }
    }
}
