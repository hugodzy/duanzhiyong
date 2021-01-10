package cn.itcast;



/**
 * description:
 *
 * @auther hugo
 * @date 2020/9/5 13:59
 */
public class MaoPao {
    public static void main(String[] args) {


        int[] arr=new int[]{22,33,100,10,1,35,61,89,36,55};
        int temp=0;
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
