package service.impl;


import dao.PoiTableDao;
import entity.PoiTable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import service.PoiTableService;



/**
 * (PoiTable)表服务实现类
 *
 * @author makejava
 * @since 2024-11-22 15:47:51
 */
@Service("poiTableService")
public class PoiTableServiceImpl implements PoiTableService {

    private PoiTableDao poiTableDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public PoiTable queryById(Integer id) {
        return this.poiTableDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param poiTable    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @Override
    public Page<PoiTable> queryByPage(PoiTable poiTable, PageRequest pageRequest) {
        long total = this.poiTableDao.count(poiTable);
        return new PageImpl<>(this.poiTableDao.queryAllByLimit(poiTable, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param poiTable 实例对象
     * @return 实例对象
     */
    @Override
    public PoiTable insert(PoiTable poiTable) {
        this.poiTableDao.insert(poiTable);
        return poiTable;
    }

    /**
     * 修改数据
     *
     * @param poiTable 实例对象
     * @return 实例对象
     */
    @Override
    public PoiTable update(PoiTable poiTable) {
        this.poiTableDao.update(poiTable);
        return this.queryById(poiTable.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.poiTableDao.deleteById(id) > 0;
    }
}
