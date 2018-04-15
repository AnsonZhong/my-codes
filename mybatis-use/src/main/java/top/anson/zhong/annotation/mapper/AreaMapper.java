package top.anson.zhong.annotation.mapper;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface AreaMapper {

    @Select("select * from t_area")
    List<Map> getAllArea();
}
