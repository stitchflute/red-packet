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
		int n = sc.nextInt(); ////绾㈠寘涓暟
		red_packet=new int[n+1];
		red_packet_money=new double[n+1];
		System.out.println("Please input total money:"); 
		double money = sc.nextFloat()-n*0.01;////绾㈠寘閲戦
		double sum=0;/////璁板綍闅忔満鏁版�诲拰
		double max=0;////璁板綍鏈�澶ч殢鏈烘暟
		int max_num=0;////杩愭皵鐜嬪簭鍙�
		double rest_money=(double)money;////鍓╀笅鐨勯噾棰�
		/////////鐢熸垚涓�涓殢鏈烘暟缁�
		for(i=0;i<n;i++) {
			red_packet[i]=(int)( Math.random() *1000 )+10;
			sum+=red_packet[i];
			if(red_packet[i]>=max){
				max=red_packet[i];
				max_num=i;
			}
		}
		//////閫氳繃闅忔満鏁扮粍鏉ュ緱鍒版瘡涓汉鐨勭孩鍖呴噾棰�
		for(i=0;i<n-1;i++) {
			red_packet_money[i]=(double)(money*red_packet[i]/sum);
			rest_money=rest_money-red_packet_money[i];
			System.out.printf("the money of %2dth people: %.2f\n",i+1,red_packet_money[i]+0.01);
		}
		System.out.printf("the money of %2dth people: %.2f\n",i+1,rest_money+0.01);
		//////////鍓峮-1涓汉涓噾棰濇渶楂樼殑鍜屾渶鍚庝竴涓汉姣旇緝锛屾潵鍐冲畾璋佹槸杩愭皵鐜�
		if(red_packet_money[max_num]>=rest_money)
			System.out.printf("the lucky king is: %d",max_num+1);
		else 
			System.out.printf("the lucky king is: %d",max_num+1);
	}
		
}
