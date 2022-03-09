package notOptimized.service;

/**
 * TODO
 *
 * @author yds
 * @version 1.0
 * @date 2022/3/3 16:58
 * @description:
 */
public class ComputerService {
    public String getComputer(String cpu,Integer memory,Integer hardDisk){
        System.out.println("得到了电脑,电脑cpu为："+cpu+"，内存为："+memory+"，硬盘为："+hardDisk+"");
        return "得到了电脑";
    }
}
