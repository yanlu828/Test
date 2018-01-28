package SuanFa;

/**
 * 判断两个圆是否相交，一个圆坐标为X1，Y1，半径为R1,一个圆的坐标为X2.Y2,半径为R2
 * 计算下两个圆之前的距离是否大于半径之和，不大于和等于表示相交
 */
public class YuanShiFouXiang {
        boolean flag=false; //首先设定值为false,也就是不相交

        public boolean Compare(int x1,int y1,int r1,int x2,int y2,int r2){
        int num1=(x1-x2)*(x1-x2);
        int num2=(y1-y2)*(y1-y2);
        int num3=num1+num2;
        double distance=Math.sqrt(num3);
        if(distance<=(r1+r2)){
            flag=true;
        }
            return  flag;
    }

    public static void main(String[] args) {
        //boolean flag=false;
        YuanShiFouXiang yuanShiFouXiang=new YuanShiFouXiang();
        yuanShiFouXiang.Compare(1,1,1,9,9,1);
        System.out.println(yuanShiFouXiang.flag);
    }
}
