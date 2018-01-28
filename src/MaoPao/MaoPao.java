package MaoPao;

public class MaoPao {
    public void BigToSmall() {
        int arr[]={-5,29,8,10,4,13,32,35,-9};
            for(int i=1;i<arr.length;i++){
                for(int j=0;j<arr.length-i;j++){
                    if(arr[j]<arr[j+1]){ //现在是从大到小排列，如果是从小到大的话，只需要修改一下标点符号就行了，改成大于号
                        int temp;
                        temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
            for(int i=0;i<arr.length;i++){
                System.out.println(""+arr[i]+"");
        }
    }

    public static void main(String[] args) {
        MaoPao maoPao=new MaoPao();
        maoPao.BigToSmall();
    }
}
