#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
void main()
{
	printf("���뽱��Ľ��\n");
	int money;
	scanf("%d",&money);
	int baiyuan=money/100;
	int wushi=money%100/50;
	int ershi=money%100%50/20;
	int shi=money%100%50%20/10;
	int wu=money%100%50%20%10/5;
	int er=money%100%50%20%10%5/2;
	int yi=money%100%50%20%10%5%2;
	printf("100Ԫ:%d��\n50Ԫ:%d��\n20Ԫ:%d��\n10Ԫ:%d��\n5Ԫ:%d��\n2Ԫ:%d��\n1Ԫ:%d��",baiyuan,wushi,ershi,shi,wu,er,yi);
}
