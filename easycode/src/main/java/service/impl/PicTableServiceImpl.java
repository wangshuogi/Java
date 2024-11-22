package service.impl;




import dao.PicTableDao;
import entity.PicTable;

import org.springframework.context.annotation.ImportResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import service.PicTableService;



/**
 * (PicTable)表服务实现类
 *
 * @author makejava
 * @since 2024-11-22 15:47:51
 */
@Service("picTableService")
public class PicTableServiceImpl implements PicTableService {

    private PicTableDao picTableDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PicTable queryById(Integer id) {
        return this.picTableDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param picTable    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<PicTable> queryByPage(PicTable picTable, PageRequest pageRequest) {
        long total = this.picTableDao.count(picTable);
        return new PageImpl<>(this.picTableDao.queryAllByLimit(picTable, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param picTable 实例对象
     * @return 实例对象
     */
    @Override
    public PicTable insert(PicTable picTable) {
        this.picTableDao.insert(picTable);
        return picTable;
    }

    /**
     * 修改数据
     *
     * @param picTable 实例对象
     * @return 实例对象
     */
    @Override
    public PicTable update(PicTable picTable) {
        this.picTableDao.update(picTable);
        return this.queryById(picTable.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.picTableDao.deleteById(id) > 0;
    }
}
