#include <stdio.h>
#include <stdlib.h>

/* run this program using the console pauser or add your own getch, system("pause") or input loop */
void main()
{
	printf("����Ӳ�ҵĶ���\n");
	int num=0;
	scanf("%d",&num);
	printf("����ÿ��Ӳ�ҵĸ���\n");
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
	printf("����Ҫ��%d���̵��������",sum);
}
