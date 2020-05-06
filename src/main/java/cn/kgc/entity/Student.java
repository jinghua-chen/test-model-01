package cn.kgc.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

@TableName("t_student")
public class Student {
    //标注表中的主键在类中是哪个属性，定义id的增长策略为自定义
    @TableId(value = "id",type = IdType.INPUT)
    private Integer id;

    @TableLogic
    private Integer logic;//逻辑删除

    @TableField(value = "name",fill = FieldFill.INSERT_UPDATE)
    private String name;

    //在表中没有该字段,或不想映射改属性
    /*@TableField(exist = false)*/
    private String sex;

    //当类中属性与表中字段名字不一致是使用此注解定义
    @TableField(value = "class_ranking")
    private Integer classRanking;//班级排名

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", classRanking=" + classRanking +
                '}';
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public Integer getClassRanking() {
        return classRanking;
    }

    public Integer getLogic() {
        return logic;
    }

    public void setLogic(Integer logic) {
        this.logic = logic;
    }

    public void setClassRanking(Integer classRanking) {
        this.classRanking = classRanking;
    }
}
