package optimization.service.impl;

import optimization.entity.stationery.Pencil;
import optimization.service.StationeryService;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/9 9:52
 * @description:
 */
public class PencilServiceImpl implements StationeryService {

    private Pencil pencil = new Pencil("2B","绿色");

    public void work() {
        System.out.println(pencil);
    }

    public void info() {
        System.out.println("铅笔哦");
    }
}
