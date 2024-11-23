package service;



import entity.PicTable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;


/**
 * (PicTable)表服务接口
 *
 * @author makejava
 * @since 2024-11-22 15:47:51
 */
public interface PicTableService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    PicTable queryById(Integer id);

    /**
     * 分页查询
     *
     * @param picTable    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    Page<PicTable> queryByPage(PicTable picTable, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param picTable 实例对象
     * @return 实例对象
     */
    PicTable insert(PicTable picTable);

    /**
     * 修改数据
     *
     * @param picTable 实例对象
     * @return 实例对象
     */
    PicTable update(PicTable picTable);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
