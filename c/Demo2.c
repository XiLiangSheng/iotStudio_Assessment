#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
void main()
{
	printf("输入奖金的金额\n");
	int money;
	scanf("%d",&money);
	int baiyuan=money/100;
	int wushi=money%100/50;
	int ershi=money%100%50/20;
	int shi=money%100%50%20/10;
	int wu=money%100%50%20%10/5;
	int er=money%100%50%20%10%5/2;
	int yi=money%100%50%20%10%5%2;
	printf("100元:%d张\n50元:%d张\n20元:%d张\n10元:%d张\n5元:%d张\n2元:%d张\n1元:%d张",baiyuan,wushi,ershi,shi,wu,er,yi);
}
