import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: yqy
 * @Date: 2022/05/16/15:06
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
       /* fileCreate();
        deleteFileORDir();
        getFileListPlus("d://idea");*/
        File file=new File("D:/20211214 - 副本");
        deleteAll(file);
    }

    private static void fileCreate(){
        //新建文件
        try {
        File file1=new File("d:/aa.txt");
            System.out.println(file1.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        /**
         * 返回值，是否创建成功
         */
        File file=new File("d:/zzz");
        boolean b = file.mkdir();
        System.out.println("b"+b);
        /**
         * 创建多个文件夹
         */
        File file2=new File("d:/zzz/zzz");
        boolean b1 = file2.mkdirs();
        System.out.println("b1"+b1);
        /**
         * true
         * btrue
         * b1true
         */
    }
    private static void deleteFileORDir(){
        File file=new File("d:/zzz");
        File file1=new File("d:/aa.txt");
        File file2=new File("d:/zzz/zzz");
        boolean delete1 = file2.delete();
        boolean delete2 = file.delete();
        boolean delete = file1.delete();
        System.out.println(delete1+"fdsa         "+delete2+"dsfaasd       " +delete);
        //System.out.println(delete1);
    }

    /**
     * 删除文件夹及里面包含所有内容
     * @param file
     */
    private static void deleteAll(File file){
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
    private static List<String> getFileList(String s){
        List<String> list=new ArrayList<>();
        File file=new File(s);
        String[] strings = file.list();
        for (String string : strings) {
            list.add(string);
        }
        return list;
    }
    private static List<String> getFileListPlus(String s){
        List<String> list=new ArrayList<>();
        File file=new File(s);
        String[] strings = file.list();
        for (String string : strings) {
            if (file.isFile()){
                list.add(string+"----------文件");
            }else if (file.isDirectory()){
                list.add(string+"----------文件夹");
            }else {
                continue;
            }
        }
        return list;
    }
    private static void fileCreatePlus(String path){

    }
}
