package hongbao;
import javax.swing.*;
import java.util.Scanner;
public class hongbao {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int [] red_packet;
		float [] red_packet_money;
		int i;
		System.out.println("Please input number of red packet:"); 
		int n = sc.nextInt(); ////红包个数
		red_packet=new int[n+1];
		red_packet_money=new float[n+1];
		System.out.println("Please input total money:"); 
		float money = sc.nextFloat();////红包金额
		float sum=0;/////记录随机数总和
		float max=0;////记录最大随机数
		int max_num=0;////运气王序号
		float rest_money=(float)money;////剩下的金额
		/////////生成一个随机数组
		for(i=0;i<n;i++) {
			red_packet[i]=(int)( Math.random() *1000 )+10;
			sum+=red_packet[i];
			if(red_packet[i]>=max){
				max=red_packet[i];
				max_num=i;
			}
		}
		//////通过随机数组来得到每个人的红包金额
		for(i=0;i<n-1;i++) {
			red_packet_money[i]=(float)(money*red_packet[i]/sum);
			rest_money=rest_money-red_packet_money[i];
			System.out.printf("the money of %2dth people: %.2f\n",i+1,red_packet_money[i]);
		}
		System.out.printf("the money of %2dth people: %.2f\n",i+1,rest_money);
		//////////前n-1个人中金额最高的和最后一个人比较，来决定谁是运气王
		if(red_packet_money[max_num]>=rest_money)
			System.out.printf("the lucky king is: %d",max_num+1);
		else 
			System.out.printf("the lucky king is: %d",max_num+1);
	}
		
}
