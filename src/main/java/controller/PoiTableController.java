package controller;




import entity.PoiTable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.PoiTableService;



/**
 * (PoiTable)表控制层
 *
 * @author makejava
 * @since 2024-11-22 15:47:51
 */
@RestController
@RequestMapping("poiTable")
public class PoiTableController {
    /**
     * 服务对象
     */

    private PoiTableService poiTableService;

    /**
     * 分页查询
     *
     * @param poiTable    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<PoiTable>> queryByPage(PoiTable poiTable, PageRequest pageRequest) {
        return ResponseEntity.ok(this.poiTableService.queryByPage(poiTable, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<PoiTable> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.poiTableService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param poiTable 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<PoiTable> add(PoiTable poiTable) {
        return ResponseEntity.ok(this.poiTableService.insert(poiTable));
    }

    /**
     * 编辑数据
     *
     * @param poiTable 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<PoiTable> edit(PoiTable poiTable) {
        return ResponseEntity.ok(this.poiTableService.update(poiTable));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.poiTableService.deleteById(id));
    }

}

