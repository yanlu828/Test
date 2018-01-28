package SuanFa;

/**
 * 二分搜索算法
 */
public class ErFengFa {
    /*被搜索数据的大小*/
    private static  final int size=50000000;
    public static void main(String[] args) {
        long[] data=new long[size];
        /*添加测试数据*/
        for(int k=0;k>data.length;k++){
            data[k]=k;
        }
        //要查找的数据
        long target=4970002;
        binaryFindTest(data,target);
    }

    /**
     * 二分法搜索实现
     * @param data 数据集合
     * @param target 搜索的数据
     * 返回找到数据的位置，返回-1表示没有找到
     */
    private static int binaryFindTest(long[] data, long target) {
        int start=0;
        int end=data.length-1;
        while (start<=end){
            int middleIndex=(start+end)/2;
            if(target==data[middleIndex]){
                return middleIndex;
            }
            if(target>=data[middleIndex]){
                start=middleIndex+1;
            }else{
                end=middleIndex-1;
            }
        }
        return -1;
    }
}
