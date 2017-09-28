package hongbao;
import javax.swing.*;
import java.util.Scanner;
public class hongbao {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int [] red_packet;
		double [] red_packet_money;
		int i;
		System.out.println("Please input number of red packet:"); 
		int n = sc.nextInt(); ////红包数量
		red_packet=new int[n+1];
		red_packet_money=new double[n+1];
		System.out.println("Please input total money:"); 
		double money = sc.nextFloat()-n*0.01;////红包金额（这里减了0.01乘以总人数，后面在分别加0.01保证每个人至少可以得到一分钱
		double sum=0;/////随机数组的总和
		double max=0;////用来计算谁得到钱最高（即运气王）
		int max_num=0;////运气王的序号
		double rest_money=(double)money;////剩余金额
		/////////生成一个随机数组，用来随机生成红包金额
		for(i=0;i<n;i++) {
			red_packet[i]=(int)( Math.random() *1000 )+10;
			sum+=red_packet[i];
			if(red_packet[i]>=max){
				max=red_packet[i];
				max_num=i;
			}
		}
		//////生成每个人得到的红包金额，为总金额乘以各个人在随机数组中的百分比
		for(i=0;i<n-1;i++) {
			red_packet_money[i]=(double)(money*red_packet[i]/sum);
			rest_money=rest_money-red_packet_money[i];
			System.out.printf("the money of %2dth people: %.2f\n",i+1,red_packet_money[i]+0.01);
		}
		System.out.printf("the money of %2dth people: %.2f\n",i+1,rest_money+0.01);
		//////////将前n-1个人中运气王和最后一个人比较，来决定谁是最终的运气王。
		if(red_packet_money[max_num]>=rest_money)
			System.out.printf("the lucky king is: %d",max_num+1);
		else 
			System.out.printf("the lucky king is: %d",max_num+1);
	}
		
}
