package dao;




import entity.PicTable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.query.Param;


import java.awt.print.Pageable;
import java.util.List;

/**
 * (PicTable)表数据库访问层
 *
 * @author makejava
 * @since 2024-11-22 15:47:51
 */
public interface PicTableDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PicTable queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param picTable 查询条件
     * @param pageable 分页对象
     * @return 对象列表
     */
    List<PicTable> queryAllByLimit(PicTable picTable, @Param("pageable") PageRequest pageRequest);

    /**
     * 统计总行数
     *
     * @param picTable 查询条件
     * @return 总行数
     */
    long count(PicTable picTable);

    /**
     * 新增数据
     *
     * @param picTable 实例对象
     * @return 影响行数
     */
    int insert(PicTable picTable);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<PicTable> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<PicTable> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<PicTable> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<PicTable> entities);

    /**
     * 修改数据
     *
     * @param picTable 实例对象
     * @return 影响行数
     */
    int update(PicTable picTable);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

