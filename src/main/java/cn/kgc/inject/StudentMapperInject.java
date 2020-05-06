package cn.kgc.inject;

import com.baomidou.mybatisplus.entity.TableInfo;
import com.baomidou.mybatisplus.mapper.AutoSqlInjector;
import org.apache.ibatis.builder.MapperBuilderAssistant;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.session.Configuration;

public class StudentMapperInject extends AutoSqlInjector {
    @Override
    public void inject(Configuration configuration, MapperBuilderAssistant builderAssistant
            , Class<?> mapperClass, Class<?> modelClass, TableInfo table) {
        //将StudentMapper中的deleteAll处理成对应的Mappedstatement对象加入到Configuration中
        System.out.println(table.getTableName() + "--------------");
        String sql = "DELETE FROM " + table.getTableName();
        //注入的方法名一定要与StudentMapper接口中的方法名一致
        String method = "deleteAll";
        //构造SqlSource对象
        SqlSource sqlSource = languageDriver.createSqlSource(configuration, sql, modelClass);
        //构造一个删除的MappedStatement对象
        this.addDeleteMappedStatement(mapperClass, method, sqlSource);

    }
}
