package optimization.service.impl;

import optimization.entity.electronics.Computer;
import optimization.service.electronicsService;

import java.math.BigDecimal;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/9 9:39
 * @description:
 */
public class ComputerServiceImpl implements electronicsService {

    private Computer computer = new Computer("R5 3600","32GB","500GB");

    public void param() {
        System.out.println(
                computer
        );
    }

    public void info() {
        computer.setPrice(new BigDecimal(5000));
        computer.setName("神州电脑");
        System.out.println(computer.getName()+","+computer.getPrice());
    }
}
