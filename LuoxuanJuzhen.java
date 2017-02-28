package com.ww.algorithm.table;

/**
 * 螺旋矩阵思路整理分析
 * 1、实现需要使用二维数组，将螺旋分解成多次重复的右，下，左，上过程，然后将自增的数依次填入到数组相应位置中，每次循环数组下标需要减少2
 * 2、往右时数组中元素都为空所以循环次数为当前计算完成后的次数，往下和左时，因为有一位已经有值所以循环次数要减一，往上时两位有值循环次数要减二
 * 3、此为第一版实现，后续有优化灵感再改进
 * @author ww
 *
 */
public class LuoxuanJuzhen {
	public static void main(String[] args) {
		int n = 11; 
		int [][]arr=new int[n][n];
		
		int j=0;
		for(int i=1;n-2*(i-1)>0;i++){
			//right
			int c=i-1;
			int tmp=0;
			while(tmp<n-2*(i-1)){
				arr[i-1][c++]=++j;
				tmp++;
			}
			//down
			int l=0;
			int m=i;
			int k=n-2*(i-1)-1;
			while(l<k){
				arr[m++][n-i]=++j;
				l++;
			}
			//left
			l=0;
			k=n-i-1;
			while(l<n-2*(i-1)-1){
				arr[m-1][k--]=++j;  
				l++;
			}
			//up
			l=0;
			k=n-i-1;
			while(l<n-2*(i-1)-2){
				arr[k--][i-1]=++j;
				l++;
			}
		}
		for (int i = 0; i < n; i++) {
			if(i!=0){
				System.out.println();
				System.out.println();
			}
			for (int o = 0; o < n; o++) {
				System.out.print(arr[i][o]+"\t");
			}
		}
	}
}
