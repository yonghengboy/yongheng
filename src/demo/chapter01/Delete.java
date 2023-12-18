package demo.chapter01;
//2023-10-16  删除数组中的元素
public class Delete {
    public static void main(String[] args) {
        //查找要删除的目标数据
        int[] array={2,1,3,12,7,4};
        int num =7;
        int index = -1;
        int n =array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==num)
            {
                index=i;
            }
        }
        //删除目标元素
        if(index==1){
            System.out.println("无目标值");
        }else{
        for (int i = index; i < n-1; i++) {
          array[i]=array[i+1];
        }
        n--;
        }
        //遍历输出删除后的数组元素
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
        System.out.println("----------------");
        //增强型for循环
        for (int i : array) {
            System.out.println(i);
        }
        //有序插入
    }
}

