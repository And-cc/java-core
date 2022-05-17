import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yqy
 * @Date: 2022/05/16/15:59
 * @Description:
 */
public class FileMethods {
    public void deleteAll(File file){
        if (!file.exists()) {
            System.out.println("该文件不存在");
            return;
        }
        if (file.isFile()){
            file.delete();
            return;
        }
        for (File listFile : file.listFiles()) {
            if (listFile.isFile()){
                System.out.println("删除"+file.getName()+"------------"+"文件");
                listFile.delete();
            }else {
                deleteAll(listFile);
            }
        }
        file.delete();
        System.out.println("删除"+file.getName()+"------------"+"文件夹");
    }
    public List<String> getAllString(File file){
        List<String> list=new ArrayList<>();
        if (file.exists()) {
            System.out.println("文件不存在");
            return null;
        }
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()){
                list.add(f.getName()+"--文件");
            }else {
                list.add(f.getName()+"--文件夹");
            }
        }
        return list;
    }
    //创建一个文件
    public boolean createFile(File file) throws IOException {
        if (file.exists()){
            System.out.println("文件已经存在");
        }
        boolean b = file.createNewFile();
        return b;
    }
    //创建一个文件夹
    public boolean createDir(File file){
        if (file.exists()){
            System.out.println("文件已经存在");
        }
        boolean b = file.mkdirs();
        return b;
    }
    public boolean updateFileName(File file,String name){
        if (!file.exists()){
            System.out.println("文件不存在");
            return false;
        }
        return file.renameTo(new File(name));
    }
}
