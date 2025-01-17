package service;




import entity.PoiTable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;


/**
 * (PoiTable)表服务接口
 *
 * @author makejava
 * @since 2024-11-22 15:47:51
 */
public interface PoiTableService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PoiTable queryById(Integer id);

    /**
     * 分页查询
     *
     * @param poiTable    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<PoiTable> queryByPage(PoiTable poiTable, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param poiTable 实例对象
     * @return 实例对象
     */
    PoiTable insert(PoiTable poiTable);

    /**
     * 修改数据
     *
     * @param poiTable 实例对象
     * @return 实例对象
     */
    PoiTable update(PoiTable poiTable);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
