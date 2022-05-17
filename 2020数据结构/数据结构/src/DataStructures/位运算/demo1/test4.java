package DataStructures.位运算.demo1;

/**
 * @Author: yqy
 * @Date: 2022/02/22/11:28
 * @Description:
 */
public class test4 {
    int find(int arr[]){
        int tmp = arr[0];
        for(int i = 1;i < arr.length; i++){
            tmp = tmp ^ arr[i];
        }
        return tmp;
    }
}
