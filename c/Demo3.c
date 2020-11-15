#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
void main()
{
	printf("输入硬币的堆数\n");
	int num=0;
	scanf("%d",&num);
	printf("输入每堆硬币的个数\n");
	int nums[num];
	int i=0;
	int sum=0;
	for(i=0;i<num;i++)
	{
		scanf("%d",&nums[i]);
	}
	for(i=0;i<num;i++)
	{
		sum+=(nums[i]+1)/2;
	}
	printf("最少要来%d次商店才能拿完",sum);
}
