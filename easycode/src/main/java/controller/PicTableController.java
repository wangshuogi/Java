package controller;



import entity.PicTable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.PicTableService;


/**
 * (PicTable)表控制层
 *
 * @author makejava
 * @since 2024-11-22 15:47:51
 */
@RestController
@RequestMapping("picTable")
public class PicTableController {
    /**
     * 服务对象
     */

    private PicTableService picTableService;

    /**
     * 分页查询
     *
     * @param picTable    筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<PicTable>> queryByPage(PicTable picTable, PageRequest pageRequest) {
        return ResponseEntity.ok(this.picTableService.queryByPage(picTable, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<PicTable> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.picTableService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param picTable 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<PicTable> add(PicTable picTable) {
        return ResponseEntity.ok(this.picTableService.insert(picTable));
    }

    /**
     * 编辑数据
     *
     * @param picTable 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<PicTable> edit(PicTable picTable) {
        return ResponseEntity.ok(this.picTableService.update(picTable));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.picTableService.deleteById(id));
    }

}

