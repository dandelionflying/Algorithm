package cn.running4light.demo.finished;

/**
 * @decription 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class JZ6 {
    /**
     *  @Description
     *  思路：
     *  根据题目可知，非递减数组旋转后，存在两种情况
     *  1.旋转次数恰好为数组长度，那么等于没有旋转，那么数组第一项则为最小值
     *  2.旋转次数非数组长度
     *      （1）此时需根据数组中间索引将数组一分为二，
     *      （2）若拆分后的两个数组均满足首项小于末项，那么右侧数组第一项即为最小，跳转（4）；
     *      （3）否则，必定有且只有其中一个数组满足首项大于末项，此时选择该数组作为新数组进行（1），若数组长度为1则末项即为最小元素，跳转（4）；
     *      （4）结束
     *  @Author running4light朱泽雄
     *  @CreateTime 11:07 2021/5/12
     *
     */
    public int minNumberInRotateArray(int [] array) {
        if(array.length >0){
            int begin = 0;
            int length = array.length;
            int end = array.length - 1;
            if(array[0]<array[end]){
                return array[0];
            }
            while(length>0){
                int leftBegin = begin;
                int leftEnd = begin + length/2 - 1;
                int rightBegin = begin + length/2;
                int rightEnd = end;
                if(end - begin == 1){
                    return array[end];
                }
                if(array[leftBegin]>array[leftEnd]){
                    // 存在左侧
                    begin = leftBegin;
                    end = leftEnd;
                    length = length%2 == 1 ?length/2+1:length/2;
                    System.err.println("leftBegin:"+leftBegin+"\tleftEnd:"+leftEnd+"\tlength:"+length+"\tdata:"+array[leftBegin]+"\t"+array[leftEnd]);
                    continue;
                }else if(array[rightBegin]>array[rightEnd]){
                    // 存在右侧
                    begin = rightBegin;
                    end = rightEnd;
                    length = length%2 == 1 ?length/2+1:length/2;
                    System.err.println("rightBegin:"+rightBegin+"\trightEnd:"+rightEnd+"\tlength:"+length+"\tdata:"+array[rightBegin]+"\t"+array[rightEnd]);
                    continue;
                }
                return array[rightBegin];
            }
            return 0;
        }else{
            return 0;
        }
    }
}
/**
 * 3 4 5 1 2
 * 5 1 2 3 4
 * 2 3 4 5 1
 * 4, 5, 6, 1, 2, 2, 3, 3
 *
 * */